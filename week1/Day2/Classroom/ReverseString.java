package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
	      String str="tester";
//	      char[] charArray = str.toCharArray();
	      for (int i = str.length()-1; i >=0 ; i--) {
//	    	  System.out.print(charArray[i]);
	    		System.out.print(str.charAt(i));
	    		
	    	}
	}

}
