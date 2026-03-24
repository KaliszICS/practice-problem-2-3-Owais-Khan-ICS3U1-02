import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   // test 0
   @Test
   void test1_1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   // test 1
   @Test
   void test1_2() {
      assertEquals(3.141592653589793, PracticeProblem.circleArea(1.0));
   }

   // test simple double
   @Test
   void test1_3() {
      assertEquals(78.53981633974483, PracticeProblem.circleArea(5.0));
   }

   // test larger double
   @Test
   void test1_4() {
      assertEquals(3489.960407194446, PracticeProblem.circleArea(33.33));
   }

   // test long double
   @Test
   void test1_5() {
      assertEquals(31.006276680299816, PracticeProblem.circleArea(3.141592653589793));
   }

   //minutes to hours (int)

   // test 0
   @Test
   void test2_1() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }

   @Test
   void test2_2() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }

   @Test
   void test2_3() {
      assertEquals(78.53981633974483, PracticeProblem.circleArea(5.0));
   }

   // test larger double
   @Test
   void test2_4() {
      assertEquals(3489.960407194446, PracticeProblem.circleArea(33.33));
   }

   // test long double
   @Test
   void test2_5() {
      assertEquals(31.006276680299816, PracticeProblem.circleArea(3.141592653589793));
   }

   //q3
   
   // test 0
   @Test
   void test3_1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   // test 1
   @Test
   void test3_2() {
      assertEquals(3.141592653589793, PracticeProblem.circleArea(1.0));
   }

   // test simple double
   @Test
   void test3_3() {
      assertEquals(78.53981633974483, PracticeProblem.circleArea(5.0));
   }

   // test larger double
   @Test
   void test3_4() {
      assertEquals(3489.960407194446, PracticeProblem.circleArea(33.33));
   }

   // test long double
   @Test
   void test3_5() {
      assertEquals(31.006276680299816, PracticeProblem.circleArea(3.141592653589793));
   }

   //q4
   
   // test 0
   @Test
   void test4_1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   // test 1
   @Test
   void test4_2() {
      assertEquals(3.141592653589793, PracticeProblem.circleArea(1.0));
   }

   // test simple double
   @Test
   void test4_3() {
      assertEquals(78.53981633974483, PracticeProblem.circleArea(5.0));
   }

   // test larger double
   @Test
   void test4_4() {
      assertEquals(3489.960407194446, PracticeProblem.circleArea(33.33));
   }

   // test long double
   @Test
   void test4_5() {
      assertEquals(31.006276680299816, PracticeProblem.circleArea(3.141592653589793));
   }
}
