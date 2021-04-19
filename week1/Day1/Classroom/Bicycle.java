package week.day1;

public class Bicycle {

	public String getCycleColor() {
		return "Green";
		
	}
	public void isPunctured(boolean condition) {
		if (condition) {
			System.out.println("The wheel is punctured");
		}else {
			System.out.println("The wheel is not punctured");
		}
		
	}
	
	public static void main(String[] args) {
		Bicycle cycle = new Bicycle();
		String color = cycle.getCycleColor();
	System.out.println(color);	
	cycle.isPunctured(false);
		
		

	}

}
