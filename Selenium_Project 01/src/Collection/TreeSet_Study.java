package Collection;

import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {
		
		TreeSet<Object> T=new TreeSet<>();
		
		T.add(20);
	//	T.add(null);
	//	T.add("Hello");
		T.add(1998);
	//	T.add(true);
	//	T.add('P');
	//	T.add(2022.56f);
		T.add(51);
		T.add(52);
		T.add(53);
		
		
		System.out.println(T);
		
	// In TreeSet class only support interger values like number noy support string value or Null.
		
		// T.add("hello"); -->>>>>    ClassCastException:
		// T.add(null); --->>>>>>     null values are not allowed-->NullPointerException
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
