package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().selectName();
    app.getContactHelper().fillinContactPage(new ContactData("name", "surname", "company", "address", "phone", "email"));
    app.getContactHelper().updateContact();
    app.getNavigationHelper().gotoHomePage();
  }
}
