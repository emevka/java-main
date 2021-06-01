package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreation extends TestBase{

  @Test
  public void tContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().fillinContactPage(new ContactData("name", "surname", "company", "address", "phone", "email"));
    app.getContactHelper().submitContact();
    app.getNavigationHelper().gotoContactPage();
  }

}
