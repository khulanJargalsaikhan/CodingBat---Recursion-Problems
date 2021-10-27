package count7;

public class Count7 {
	
	/*Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
	  so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields 
	  the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

		count7(717) -- 2
		count7(7) -- 1
		count7(123) -- 0 
	 */
	
	
	static int count7(int n) {
		int count = 0;
		if(n<1) return 0;
		if(n%10 == 7) 
			count++;
		return count + count7(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(count7(717)); 
		System.out.println(count7(7)); 
		System.out.println(count7(126)); 
		

	}
}
