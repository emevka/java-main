package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeletion extends TestBase{

  @Test(enabled = false)
  public void testContactDeletion() {
    app.getGoTo().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData("new name", null, null, null, null, null, null));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() -1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().closeAlert();
    List<ContactData> after = app.getContactHelper().getContactList();
    app.getGoTo().gotoHomePage();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() -1);
      Assert.assertEquals(before, after);
    }
  }
