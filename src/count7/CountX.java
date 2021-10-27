package count7;

public class CountX {
	
	/*
	Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


	countX("xxhixx") -- 4
	countX("xhixhix") -- 3
	countX("hi") -- 0
	 * */
	
	
	
	
	
	public static int countX(String str) {
		
		  if(str.length() < 1 ) return 0;
		  
		  if(str.charAt(0) == 'x') 
		    return 1 + countX(str.substring(1));
		  else
		    return countX(str.substring(1));
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(countX("xxhixx"));
		System.out.println(countX("xhixhix"));
		System.out.println(countX("hi"));
	}

}
