package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData(null, null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("1test", "2test", "3test"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returntoGroupPage();
  }
}
