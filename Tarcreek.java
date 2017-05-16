public class Tarcreek

{
	public static void main( String [] args)
	{
		
	String name;
    String clas;
    double credits = 0;
    char yn = 'n';
	double fhc = 0, shc = 0, xhc = 0;
	double fhrs = 0, shrs = 0, xhrs = 0;
	double tothc = 0;
	double tcredits = 0;
	
    while ( yn == 'n')	
	{
	System.out.println("\n What is the student name?");
	  name = SavitchIn.readLine();
	  
	  System.out.println("\n What is the student's classification? F, S, or X");
	   clas = SavitchIn.readLine();
	    
		System.out.println("\n What is the student's credit hours?");
        credits = SavitchIn.readLineDouble();
		
		if ( credits > 24)
		{
			System.out.println("\n  Tar  Creek  University");
			System.out.println("\n\n Enrollment Summary Exception Report");
			System.out.println("\n\n NAME                MESSAGE");
			System.out.println(  name  + "     Invalid Credit hour Entry");
		}
			else
			
						if (clas.equals("F"))
						{
							fhc += 1;
							 fhrs = credits ;
						}
						else
							if (clas.equals("S"))
							{
							   shc += 1;
							    shrs = credits ;
							}
							else
								if ( clas.equals("X"))
								{
								   xhc += 1;
								  xhrs = credits;
								}
						else
						
							if ( clas != "F")	
			               {
				             System.out.println("\n  Tar  Creek  University");
			                 System.out.println("\n\n Enrollment Summary Exception Report");
			                 System.out.println("\n\n NAME                MESSAGE");
			                 System.out.println(  name  + "     Invalid Classification");
		                 	}
			              else
			               	if ( clas != "S")
				               {
				              	System.out.println("\n  Tar  Creek  University");
			                    System.out.println("\n\n Enrollment Summary Exception Report");
			                    System.out.println("\n\n NAME                MESSAGE");
			                    System.out.println(  name  + "  Invalid Classification");
				                }
				             else
				               	if ( clas != "X")
				             	{
					             	System.out.println("\n  Tar  Creek  University");
			                        System.out.println("\n\n Enrollment Summary Exception Report");
			                        System.out.println("\n\n NAME                MESSAGE");
			                        System.out.println(  name  + "     Invalid Classification");		
					}
					else
						 tothc = fhc + shc + xhc;
					     tcredits = fhrs + shrs + xhrs;
					  
						System.out.println("\n\n\n               Tar  Creek  University");
			            System.out.println("\n\n                   Enrollment Summary ");
			            System.out.println("\n\n  Classification               Head Count   Credit Hours");
			            System.out.println("\n  Freshman                 "  + "         " +  fhc +  "      " + fhrs);
						System.out.println("\n  Sophomores               "  + "         " +  shc +  "      " + shrs);
						System.out.println("\n  Special Students         "  + "         " +  xhc +  "      " + xhrs);
						System.out.println("\nTotals                            "+  tothc   + "      " + tcredits);
						
						System.out.println("\n\n Do you want to quit? y/n");
						yn = SavitchIn.readChar();
						
						SavitchIn.readLine(); 
	   }	
	}	
}