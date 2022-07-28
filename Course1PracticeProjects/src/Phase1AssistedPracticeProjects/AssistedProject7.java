package Phase1AssistedPracticeProjects;

public class AssistedProject7 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		AssistedProject7 obj=new AssistedProject7();
		AssistedProject7.Inner in=obj.new Inner();  
		in.hello();  
	}
}

//
//public class PracticeProject72 {
//
//private String msg="Inner Classes";
//
//void display(){  
//	 class Inner{  
//		 void msg(){
//			 System.out.println(msg);
//		 }  
// }  
// 
// Inner l=new Inner();  
// l.msg();  
//}  
//
//
//public static void main(String[] args) {
//	PracticeProject72  ob=new PracticeProject72 ();  
//	ob.display();  
//	}
//}
//
//
////anonymous inner class
//abstract class AnonymousInnerClass {
//	   public abstract void display();
//	}
//
//
//	public class PracticeProject73 {
//
//	public static void main(String[] args) {
//	AnonymousInnerClass i = new AnonymousInnerClass() {
//
//	         public void display() {
//	            System.out.println("Anonymous Inner Class");
//	         }
//	      };
//	      i.display();
//	   }
//	}
//
