import org.junit.*;;

public class testLargest  {

	private Largest temp1;
	@Test
	public void test() {
		testPositive();
 //         testNegative();
 //        testMixes();
	}
	public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        Largest temp1 = new Largest();
        int maxValue = temp1.largest(arr);
        Assert.assertEquals(10, maxValue);

	/** add tests to check for this unit test **/	
    }

public void testNegative(){
        /** add tests to check for this unit test **/
    }
    
    public void testMixes(){
        /** add tests to check for this unit test **/
    }
}
