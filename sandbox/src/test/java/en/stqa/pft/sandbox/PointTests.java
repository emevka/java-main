package en.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p = new Point(6,8,0, 9);
    Assert.assertEquals(p.distance(), 6.082762530298219);
  }
}
