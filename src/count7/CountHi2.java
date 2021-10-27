package count7;

public class CountHi2 {

	public static void main(String[] args) {
		System.out.println(countHi2("ahixhi"));
		System.out.println(countHi2("ahibhi"));
		System.out.println(countHi2("xhixhi"));
		System.out.println(countHi2("hixhi"));  
	}
	
	
	/*
	 * 
	Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
	however do not count "hi" that have an 'x' immedately before them.
	
	
	countHi2("ahixhi") -- 1
	countHi2("ahibhi") -- 2
	countHi2("xhixhi") -- 0
	countHi2("hixhi") -- 1
	 */
	
	
	public static int countHi2(String str) {
		
		//base case
		if(str.length() < 2)
			return 0;
		
		int len = str.length();
		
		if(str.substring(len-2, len).equals("hi")) {
			if(len > 2 && str.charAt(len-3) != 'x' || len == 2)
				return 1 + countHi2(str.substring(0, len-1));
		}

		return countHi2(str.substring(0, len-1));
	}
	

}
