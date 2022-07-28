package Phase1AssistedPracticeProjects;

public class AssistedProject3 {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	AssistedProject3 d = new AssistedProject3();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}



