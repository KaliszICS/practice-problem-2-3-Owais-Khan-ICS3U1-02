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

   // test minutes
   @Test
   void test2_2() {
      assertEquals("0 hours and 30 minutes", PracticeProblem.minutesToHours(30));
   }

   // test hours
   @Test
   void test2_3() {
      assertEquals("1 hours and 0 minutes", PracticeProblem.minutesToHours(60));
   }

   // test both
   @Test
   void test2_4() {
      assertEquals("1 hours and 30 minutes", PracticeProblem.minutesToHours(90));
   }

   // test larger number
   @Test
   void test2_5() {
      assertEquals("2 hours and 55 minutes", PracticeProblem.minutesToHours(175));
   }

   //simpleInterest(double principal, double annualRate, int years)
   
   // test 0
   @Test
   void test3_1() {
      assertEquals(0.0, PracticeProblem.simpleInterest(0, 0, 0));
   }

   // test normal
   @Test
   void test3_2() {
      assertEquals(160.0, PracticeProblem.simpleInterest(200, 10, 8));
   }

   // test small principle
   @Test
   void test3_3() {
      assertEquals(1.2, PracticeProblem.simpleInterest(1, 15, 8));
   }

   // test larger annual rate
   @Test
   void test3_4() {
      assertEquals(110.0, PracticeProblem.simpleInterest(55, 100, 2));
   }

   // test strange doubles
   @Test
   void test3_5() {
      assertEquals(3291.8307839999998, PracticeProblem.simpleInterest(123.456, 33.33, 80));
   }

   //hypotenuse(double sideA, double sideB)
   
   // test 0
   @Test
   void test4_1() {
      assertEquals(0, PracticeProblem.hypotenuse(0, 0));
   }

   // test 3 4 5 triangle
   @Test
   void test4_2() {
      assertEquals(5.0, PracticeProblem.hypotenuse(3.0, 4.0));
   }

   // test simple fractions
   @Test
   void test4_3() {
      assertEquals(16.00781059358212, PracticeProblem.hypotenuse(10.0, 12.5));
   }

   // test special triangle
   @Test
   void test4_4() {
      assertEquals(1.4142135623730951, PracticeProblem.hypotenuse(1.0, 1.0));
   }

   // test fractions
   @Test
   void test4_5() {
      assertEquals(3.258588651548397, PracticeProblem.hypotenuse(0.5, 3.22));
   }
}
