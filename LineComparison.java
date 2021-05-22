package LineComparison;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");
		
		double line1 = calLenght(0.0,0.0,4.0,1.0);
		double line2 = calLenght(0.0,0.0,4.0,1.0);
		
		System.out.println(line1);
		System.out.println(line2);
		
		checkLineLenght(line1,line2);

	}
	
	public static double calLenght(double x1, double y1, double x2, double y2) {
		 double lenght = Math.sqrt(Math.pow((x2 - x1),2) - Math.pow((y2 - y1),2));
		 return lenght;	
	}
	
	public static void checkLineLenght(double line1,double line2) {
		
		if(line1 == line2) {
			System.out.println("Two line of are equal lenght");
		}
	}

}
