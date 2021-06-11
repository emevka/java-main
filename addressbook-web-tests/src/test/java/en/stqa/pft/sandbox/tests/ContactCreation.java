package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.ContactData;
import org.testng.annotations.*;

public class ContactCreation extends TestBase{

  @Test
  public void tContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().createAContact(new ContactData("name", "surname", "company", "address", "phone", "email", "1test"), false);
  }

}
