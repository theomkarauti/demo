/*	  interface is a Just like a #Class , 
	which  contains only  #Abstract class 		*/

/*  	To achieve interface Java Provide a Keyword 
	called, #implements  				*/ 



interface aprint
{
   public abstract    void run();
 }



class demo implements aprint
{
             public void run()
	{
	  System.out.println("Run method called....!!!");

	}	


      public static void main (String args[])
	 {

		demo  d = new demo();
		d.run();

	}		



}



/* ABs class is a class that cannot be used to create obJ.     */
/* ABs method  can only be used in Abs. class &
	 it does not have body
     */

/*Abstraction is used to hide background details or any unnecessary 
implementation about the data so that users only see the required information.*/