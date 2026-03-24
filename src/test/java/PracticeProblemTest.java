import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void testZero() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   @Test
   void testOne() {
      assertEquals(3.141592653589793, PracticeProblem.circleArea(1.0));
   }

   @Test
   void testSimpleDouble() {
      assertEquals(78.53981633974483, PracticeProblem.circleArea(5.0));
   }

   @Test
   void testLargerDouble() {
      assertEquals(3489.960407194446, PracticeProblem.circleArea(33.33));
   }

   @Test
   void testLongDouble() {
      assertEquals(31.006276680299816, PracticeProblem.circleArea(3.141592653589793));
   }

}
