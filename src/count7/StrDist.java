package count7;

public class StrDist {

	public static void main(String[] args) {
		System.out.println(strDist("catcowcat", "cat"));
		System.out.println(strDist("catcowcat", "cow"));
		System.out.println(strDist("cccatcowcatxx", "cat"));

	}

	/*
	 * Given a string and a non-empty substring sub, compute recursively the largest 
	 * substring which starts and ends with sub and return its length.


	strDist("catcowcat", "cat") 	-> 9
	strDist("catcowcat", "cow")		-> 3
	strDist("cccatcowcatxx", "cat") -> 9
	 */

//	public static int strDist(String str, String sub) {
//
//		if (str.length() < sub.length())
//			return 0;
//
//		if (str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length(), str.length()).equals(sub))
//			return str.length();
//		else if (!str.substring(0, sub.length()).equals(sub))  
//			return strDist(str.substring(1), sub);
//		else if (!str.substring(str.length()-sub.length(), str.length()).equals("sub"))
//			return strDist(str.substring(0, str.length()-1), sub);
//		else
//			return strDist(str.substring(1, str.length()-1), sub);
//
//	}


	//there is a better solution 

	public static int strDist(String str, String sub) {

		return func(str, sub).length(); 

	}


	private static String func(String str, String sub) {
		int strlen = str.length();
		int sublen = sub.length();

		if (str.equals("")) return str;
		
		if (str.startsWith(sub)) {
			if (str.substring(strlen-sublen, strlen).equals(sub))
				return str;
			else
				return func(str.substring(0, strlen-1), sub);
		}
		else
			return func(str.substring(1), sub);
	}

}
