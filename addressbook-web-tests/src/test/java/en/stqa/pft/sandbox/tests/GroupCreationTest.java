package en.stqa.pft.sandbox.tests;

import en.stqa.pft.sandbox.model.GroupData;
import org.testng.annotations.*;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("name", "header", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returntoGroupPage();
  }

}
