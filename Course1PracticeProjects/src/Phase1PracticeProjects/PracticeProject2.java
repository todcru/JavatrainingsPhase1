package Phase1PracticeProjects;

class defPracticeProject2
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class PracticeProject2 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defPracticeProject2 obj = new defPracticeProject2(); 		  
        obj.display(); 

	}
}