package String_Study;

public class String_Use {

	public static void main(String[] args)
	{
		String s="pratik";
	    String s1=new String("pratik");
	System.out.println(s1);
	System.out.println(s );
		 // (1) Length()    Method use
        
       String P="Velocity";
       
      System.out.println(P.length());
	
	     int lenghtOfString = P.length();
	
	System.out.println("String Lenght "+lenghtOfString);

	System.out.println("===================================================");  
	   //  (2) toUppercase()
	  //   (3) toLowercase()
	
	String b="mahabarat";
	
	System.out.println(b.toUpperCase());
	
	     String myString = b.toUpperCase();
	System.out.println("my String "+myString);
	
	   String thisString=myString.toLowerCase();
	   
	System.out.println("Lower case "+thisString);
	
System.out.println("======================================================");	
	  //  (4) .equal()  Method used
   
   String k= "Pune";
   String k1="Pune";
   String k2=new String("Pune");
   String k3=new String("pune");
   
   System.out.println(k==k1);
   System.out.println(k1==k2);
   System.out.println(k3==k2);
		   
	System.out.println(k.equals(k2));
	System.out.println(k1.equals(k2));
	System.out.println(k2.equals(k3));
	
	String k4="mumbai";
	String k5=" mumbai";  // space also not allowed
	 
	System.out.println(k4.equals(k5));
	
	boolean result= k4.equals(k5);
	System.out.println("result of "+result);

	System.out.println("==============================================");	
	 //  (5) contains()  method use

    String g="Ganpati Bappa";
    
    System.out.println(g.contains("Ganpati"));
    System.out.println(g.contains("pti"));
    System.out.println(g.contains("ti bappa"));
 System.out.println("===================================================");
    //  ( 6) isEmpty()   Method use 
    
    String d="Mah";
    
    System.out.println(d.isEmpty());
    		
    String e="  ";  // space also consider
    
    System.out.println(e.isEmpty());
	
	String f="";
	
	System.out.println(f.isEmpty());
System.out.println("=========================================================");
	// (7) isBlank() method used
	
String l="Bharat";
    System.out.println(l.isBlank());
    
 String l1="   ";
    System.out.println(l1.isBlank());
    
 String l2="";
    System.out.println(l2.isBlank());
    
 String l3="a";
    System.out.println(l3.isBlank());
System.out.println("==================================================================");

       // (8) chartAt()

String N="what are you doing today";

System.out.println(N.charAt(9));
System.out.println(N.charAt(13));

//  System.out.println(N.charAt(-5)); //  We can not call more than string contain number or not less than such as (minus)
//  String N1=null;
//  System.out.println(N1.toUpperCase());
System.out.println("======================================================================");

     // (9) endsWith() And startsWith() Method used

String M="Vrindawan";

System.out.println(M.endsWith("an"));

System.out.println(M.endsWith("An"));

System.out.println(M.endsWith("Vrindawan"));
	
	
System.out.println(M.startsWith("Vrin"));	

System.out.println(M.startsWith("vrin"));

System.out.println(M.startsWith("daw", 4));

System.out.println("=======================================================================");

   // (10) substring()  method used

 String h="I Love My parents";
 
 System.out.println(h.substring(6));
	
 System.out.println(h.substring(0));
 
 System.out.println(h.substring(8));
 
 System.out.println(h.substring(4, 12));
 
 System.out.println(h.subSequence(4,12));
 
System.out.println("===============================================================");
	// 11) concat()   Method used
	
	String i="velocity ";
	String i1="Corporate ";
	
System.out.println(i.concat(i1));
System.out.println(i.concat(i1).concat("Tranning Center"));

 String output=i.concat(i1).concat("Tranning Center");
 
 System.out.println(output);
 System.out.println("==================================================================");
     // 12 )  indexOf method use
 
 String j="Testing";
 
 System.out.println(j.indexOf('t'));
 
 System.out.println(j.indexOf('i'));
 
 String j1="developments";
 
 System.out.println(j1.indexOf('e'));
 System.out.println(j1.lastIndexOf('e'));	
 System.out.println(j1.indexOf('e', 2));
 
 System.out.println("===========================================================================");
 //  13) replace method used
 
 String x="studying";
 
System.out.println(x.replace('d', 'p'));

System.out.println(x.replace('u', 'd'));	
	
String x1="Velocity Corporate Tranning Institute";
System.out.println(x1.replace('t', 'e'));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
