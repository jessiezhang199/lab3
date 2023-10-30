import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

	}
  @Test
  public void Reversed1() {
    int[] input1 = {1,2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2, 1}, input1);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {1,2};
    assertArrayEquals(new int[]{2,1 }, ArrayExamples.reversed(input1));
  }

  // @Test
  // public void testaverage() {
  //   double[] input1 = {1.0};
  //   assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1));
  // }
  // @Test
  // public void testaverage1() {
  //   double[] input1 = {1.0,3.0};
  //   assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1));

  // }
  // @Test
  // public void testaverage2() {
  //   double[] input1 = {1.0,2.0,3.0};
  //   assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1));
    
  // }
}
