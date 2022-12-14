   //  Use of default and Static

package Dimond_Ambiguity;

public interface Mother {

	
	void care();
	
	void nature();
	
	default void Love()
	{
		System.out.println("Good day");
	}
	
	static void advice()
	{
		System.out.println("Mother gives Advice for any problem ");
	}
	
	
}
