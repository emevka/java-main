package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.appmanager.NavigationHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returntoGroupPage();
  }
}
