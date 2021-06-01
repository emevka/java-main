package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("1", "2", "3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returntoGroupPage();
  }
}
