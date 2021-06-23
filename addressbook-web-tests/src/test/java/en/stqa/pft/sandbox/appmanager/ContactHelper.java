package en.stqa.pft.sandbox.appmanager;

import en.stqa.pft.sandbox.model.ContactData;
import en.stqa.pft.sandbox.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

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
      click(By.xpath("(//input[@name='submit'])"));
    }

    public void selectContact (int index) { wd.findElements(By.name ("selected[]")).get(index).click(); }

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
    fillinContactPage (contact, true);
    submitContact();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//input[@name='selected[]']"));
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("span.contact"));
    for (WebElement element : elements) {
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(name,null, null, null, null,null, null);
      contacts.add(contact);
    }
    return contacts;
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}