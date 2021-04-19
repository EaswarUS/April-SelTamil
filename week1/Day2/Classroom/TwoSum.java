package week1.day2;

public class TwoSum {

	public static void main(String[] args) {
		
        int[] input = {2,3,4,5};
        int k = 5;
        boolean num = false;
        
        for (int i = 0; i < input.length; i++) {
		for (int j = i+1; j < input.length; j++) {
			 if (input[i]+input[j] ==k) {
				 num = true;
				 System.out.println("True");
				 break;
			}
		}	
		if (num) {
			break;
		}
		if (!num) {
			System.out.println("False");
			break;
		}
		}
	}

}
