package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase{
  @Test(enabled = false)
  public void testContactModification() {
    app.getGoTo().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData("name", "surname", null, null, null, null, null));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() -1);
    app.getContactHelper().editContact();
    app.getContactHelper().selectName();
    ContactData contact = new ContactData(before.get(before.size() -1).getId(),"2name", "2surname", null, null, null, null, null);
    app.getContactHelper().updateContact();
    app.getContactHelper().fillinContactPage(contact, false);
    List<ContactData> after = app.getContactHelper().getContactList();
    app.getGoTo().gotoHomePage();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);

    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }
}
