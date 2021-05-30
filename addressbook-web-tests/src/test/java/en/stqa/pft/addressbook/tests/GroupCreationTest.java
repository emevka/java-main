package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.*;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("1", "2", "3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returntoGroupPage();
  }

}
