package en.stqa.pft.sandbox.appmanager;

import en.stqa.pft.sandbox.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase{

  private ContactData contactData;
  private ContactData contact;

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillinContactPage(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"), contactData.getSurname());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getPhone());
    type(By.name("email"), contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

    public void submitContact () {
      click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void selectContact () { click(By.xpath("//input[@name='selected[]']")); }

    public void deleteContact () {
      click(By.xpath("(//input[@value='Delete'])"));
    }

    public void closeAlert () {
      wd.switchTo().alert().accept();
    }

    public void editContact () {
      click(By.xpath("(//img[@alt='Edit'])"));
    }

    public void updateContact () {
      click(By.name("update"));
    }

    public void selectName () {
      click(By.name("firstname"));
    }

    public void addContact () { click(By.linkText("add new"));}

  public void createAContact(ContactData contact) {
    addContact();
    fillinContactPage(new ContactData(new ContactData("2name", "2surname", "2company", "2address", "2phone", "2email", null), false));
    submitContact();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//input[@name='selected[]']"));
  }
}