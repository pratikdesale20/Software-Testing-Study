package Dimond_Ambiguity;

public class son implements Mother, Father
{
  public static void main(String[] args) 
	{
		son s=new son();
		s.Love();

		Mother.advice();
		
	}

	@Override
	public void money() {
		System.out.println("father properties money");
		
	}

	@Override
	public void support() {
		System.out.println("father properties support");
		
	}

	
		
	

	@Override
	public void care() {
		System.out.println("Mother properties care");
		
	}

	@Override
	public void nature() {
		System.out.println("Mother properties nature");
		
	}

	@Override
	public void Love() {
		Mother.super.Love();
		
		Father.super.Love();
		
		
	}

}
