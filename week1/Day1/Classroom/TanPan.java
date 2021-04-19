package week.day1;

public class TanPan {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
		if (i/3==0 && i/5==0) {
			System.out.println("TANPAN" + i);
		}else if(i%3==0) {
				System.out.println("TAN" + i);
			}else if(i%5==0) {
				System.out.println("PAN" + i);
			
		}

	}

}
}