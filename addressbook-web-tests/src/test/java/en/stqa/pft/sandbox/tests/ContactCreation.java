package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.ContactData;
import org.testng.annotations.*;

public class ContactCreation extends TestBase{

  @Test
  public void tContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().createAContact(new ContactData("2name", "2surname", "2company", "2address", "2phone", "2email", "1test"));
     }
}
