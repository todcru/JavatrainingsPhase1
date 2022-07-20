package searchElement;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class searchElement {
    static String [] dataBase= {"Khaled@wwc.com","Ahmed@Gmail.com","Rahul@outlook.net"};


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
	     for(String id : dataBase)
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