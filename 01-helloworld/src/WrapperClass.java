
public class WrapperClass {
	public static void main(String[] args) {
		
		int y=1;
		
		// Auto boxing from int to Integer is happening
		Integer x = 2;
		
		
		Integer z = new Integer(5);
		
		
		// Auto un-boxing from Integer to int is happening
		
		
		int myint = z; // converting automatically- auto unboxing
		myint = z.intValue(); //convert explicitly from wrapper to primitive
		
		short y = 3725;
		Short newshort = y;
		
		
				
				
	}

}
