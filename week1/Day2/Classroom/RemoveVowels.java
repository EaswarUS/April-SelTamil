package week1.day2;

public class RemoveVowels {

	public static void main(String[] args) {
		String str="testleaf";
		
//		char[] chars = str.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//			if (chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u') {
//				
//			}else {
//				System.out.print(chars[i]);
//			}
//		}
		/*
		 * String replace = str.replace("a", "").replace("e", "").replace("i",
		 * "").replace("o", "").replace("u", ""); System.out.println(replace);
		 */
	    
	    String replaceAll = str.replaceAll("[aeiou", "");
	    System.out.println(replaceAll);
	}
	

}
