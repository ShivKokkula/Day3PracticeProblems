package LineComparison;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");
		
		double result = calLenght(0.0,0.0,4.0,1.0);
		System.out.println(result);

	}
	
	public static double calLenght(double x1, double y1, double x2, double y2) {
		 double lenght = Math.sqrt(Math.pow((x2 - x1),2) - Math.pow((y2 - y1),2));
		 return lenght;	
	}

}
