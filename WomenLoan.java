   import java.util.Scanner;
   import java.io.*;

   class Synchr {
  
      long minmamloan = 10000;
	  
	  final long limit =60000;
	  
   synchronized void bank( long pepole, int age ) throws InterruptedException {
	  
	     if( age < 18 ) {
			 
			 System.out.println(" Sorry! Loan only for age above 18." );
			 
			 return;
		 }
	  
	     if( minmamloan > pepole ) {
			 
			System.out.println(" processing loan ");
				
			Thread.sleep(5000);
			
			System.out.println(" A loan is provided success full to you on behalf of the Grovrment ");
		 
		    Thread.sleep(2000);
		    
		    minmamloan -=pepole;
			
		    System.out.println(" Your loan amount " + pepole );
		 }
		 
		 else {
		   
		    try {
				
			 System.out.println(" plss Waittttt ");
				  
			 Thread.sleep(1000);
			 
			 System.out.println(" The amount requseted by the pepole is high ");
			 
			 Thread.sleep(2000);
			 
	         System.out.println(" Sorry we are unable to provide this (amount) "+ pepole);
			 
			 Thread.sleep(3000);
			 
			 System.out.println(" your limited by " + limit );
			 
		}
			catch ( Exception e ) {
		 
		    System.out.println(e);
			
			}
		 }
      }
		
	synchronized void loan ( double sendmoney ) { 
		  
		  try {
			  
		   minmamloan += sendmoney;
		   
		   System.out.println(" Grovrment provided by (Women's Loan) " );
		   
		   Thread.sleep(2000);
		   
		   System.out.println(" Enter your Age ");
		   
		   Thread.sleep(4000);
		   
		   System.out.println( " telling your Loan amount ");
		   
		   }
		   catch (Exception a) {
			   System.out.println(a);
		   }
		}
	 }		
  
   class The extends Thread {
	   
	     Synchr ob;
		 Scanner sc;
	   
	   The ( Synchr ob, Scanner sc) {
	   
	     this.ob=ob;
		 this.sc=sc;
	   
	   }
        public void run () {
		try {
			
	    int age = sc.nextInt();
			
		long gg = sc.nextLong();
			
         ob.bank( gg, age );
		 
	       }
		catch( Exception x ) {
			
			System.out.println( x );
		    }
        }			 
    }
   
   class And extends Thread {
	   
	     Synchr ob;
		 
		 And( Synchr ob ) {
	   
	       this.ob=ob;
		}
	   
	    public void run() {
	   
	      ob.loan(50000);
	   
		}
    }
    
	public class WomenLoan {
		
    public static void main (String [] args ) {
		
		Scanner sc = new Scanner ( System.in );
		
		Synchr obj = new Synchr();
		
		The one = new The (obj, sc);
		
		And two = new And (obj);
		
		one.start();
		two.start();
		
	   }
   }