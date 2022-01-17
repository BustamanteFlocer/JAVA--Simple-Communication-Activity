import java.util.Scanner;

public class Communication {
		  
	 private static Scanner Input;	 
        public String name;
        public int num;
		public static void main(String args[]) {
		Scanner cc = new Scanner(System.in);	           
	        int f;
                double balance = 30f;
			   
	            do {
		       System.out.println("\nWelcome to AT&T");
			   System.out.println("Press   [1] - Send a message");
			   System.out.println("        [2] - Make a call");
			   System.out.println("        [3] - Inquire balance");
			   System.out.println("        [4] - Exit");
			   System.out.println("        Choice: ");
			   f = cc.nextInt();

               switch (f) {
               case 1:
            	
            	       Communication A = new Communication();
            	       System.out.print("Enter a number:");
            		   A.num = cc.nextInt();
            		   System.out.print("Enter message:");
            		   A.name = cc.next();
            		   System.out.print("Message sent\n\n");
            		   balance=balance-1;
                       break;
 
               case 2:
            	   Communication b = new Communication();
                     System.out.print("Enter a number:");
          		      b.num = cc.nextInt();
                     System.out.print("Calling number.\n\n");
                     balance=balance-7.5;
                     break;

               case 3:

                     System.out.println("\nYour current balance: P" + balance);
                   
                     break;

               case 4:
     
            	   System.out.println("Thank you. See you soon");                 
                     break;
               } 
			  } while (f!=4);
		}
		}
		


               
		   
		   



			   		  
			   
			   
		   
			   



