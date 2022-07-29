package Phase1AssistedPracticeProjects;

import java.util.regex.*;

public class AssistedProject10 {

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "Regular Expression";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
