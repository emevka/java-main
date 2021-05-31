package en.stqa.pft.addressbook.appmanager;

import en.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillinContactPage(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"),contactData.getSurname());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getPhone());
    type(By.name("email"), contactData.getEmail());
  }

  public void submitContact() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }
}
