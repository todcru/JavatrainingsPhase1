package Phase1PracticeProjects;

import java.util.Scanner;

public class PracticeProject2 {
    static String [] EmailID= {"abc@gmail.com","def@gmail.com","egh@gmail.com","ijk@gmail.com","lmn@gmail.com"};

	public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String userID;
		while (true){
	     System.out.println("---- Please Enter your EMAIL ID--- ");
	     userID = inp.next();
	     VerfiyID(userID);
	     System.out.println("");
	     }
	}
	private static void VerfiyID(String ID)
	{
		boolean accessFlag= false;
	     for(String id : EmailID)
	     {
	    	 if(ID.equalsIgnoreCase(id))
	    	 {
	    		 accessFlag=true;
		    	 System.out.println("EMAIL VALIDATED "+ ID );
	    		 break;
	    	 }   	 
	     }
	     if(accessFlag==false)
	     {
	    	 System.out.println("INVALID EMAIL ID "+ ID );
	     }	
	}
}