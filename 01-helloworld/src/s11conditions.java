
public class s11conditions {
	public static void main(String[] args) {
		boolean isAlien = false;
		
		if (isAlien) {
			System.out.println("It is an alien");
		}
		if (!isAlien) {
			System.out.println("It is not an alien");
			
		String name = "max";
		if (name == "max") {
			System.out.println("correct name");
		}
		
		boolean x = true;
		boolean y = true;
		
		if (x && y) {
			System.out.println("Both the statements are true");
		} else if (x) {
			System.out.println("Only x is true");
		} else {
			System.out.println("Only y is true");
		}
		
		int a = 10;
		int b = 5;
		int c = 20;
		
//		System.out.println("a<b=" + (a<b));
//		System.out.println("a<b and a<c=" + (a<b && a<c));
//		System.out.println("a<b and a<c=" + (a<b & a<c));
		
	
		System.out.println("a<b and a<c=" + (a<b && ++a<c));
		System.out.println("A after logical and =" + a);
		System.out.println("a<b and a<c =" + (a<b & ++a<c));
		System.out.println("A after bitwise and =" + a);
		
		System.out.println("");
		
		// == comparison
		// = assignment
		
		boolean mybool = false;
		if (mybool= false) {
			System.out.println("X");
		} else {
			System.out.println("Y");
		}
		
		System.out.println(" WHAT WILL BE THE VALUE? " + (mybool = false));
		
		System.out.println("VALUE OF A BEFORE OR CONDITIONS = " + a);
		
		System.out.println("a < b OR a < c = " + (a<b || ++a<c)); // Logical OR
		System.out.println(a);
		System.out.println("a < b OR a < c = " + (a<b | ++a<c)); // Bitwise OR
		System.out.println(a);
		}
	}

}
