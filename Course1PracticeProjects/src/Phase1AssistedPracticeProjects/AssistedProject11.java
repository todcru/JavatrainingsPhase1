package Phase1AssistedPracticeProjects;

public class AssistedProject11 extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		AssistedProject11 mt = new  AssistedProject11();
  		mt.start();
 	}
}
