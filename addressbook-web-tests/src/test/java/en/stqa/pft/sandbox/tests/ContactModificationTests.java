package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData("name", "surname", "company", "address", "phone", "email", "1test"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().selectName();
    app.getContactHelper().fillinContactPage(new ContactData("2name", "2surname", "2company", "2address", "2phone", "2email", null), false);
    app.getContactHelper().updateContact();
    app.getNavigationHelper().gotoHomePage();
  }
}
