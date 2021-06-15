package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletion extends TestBase{

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData("new name", "new surname", "new company", "new address", "new phone", "new email", "1test"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().closeAlert();
    app.getNavigationHelper().gotoHomePage();
  }
}
