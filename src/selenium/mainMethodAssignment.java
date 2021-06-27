package selenium;

import java.util.Scanner;

public class mainMethodAssignment {

	public static void main(String[] args) throws InterruptedException {
		Scanner inp = new Scanner(System.in); 
		
		System.out.print("Enter the program you want to run Enter \n 1: for Broken Links check \n 2: for login automation "
				+ "\n 3: ticket search"+ "\n 4: formfill automation"+ "\n 0 to exit \n");
		
		
		
		
		
		while(true) {
			//inp.nextLine();
			int i = inp.nextInt();
			if(i == 1) {
				//check broken links on a website https://canadagenix.com
				System.out.println("Enter the link eg: 'https://canadagenix.com'");
				inp.nextLine();
				String s = inp.nextLine();
				brokenLinksAssignment.brokenLinksChecker(s);
				break;
			}else if(i == 2) {
				//Login
				login_Assignment.login_Assignmentfun();
				break;
			}else if(i == 3) {
				//Ticket search
				ticketBooking_assignment.ticket();
				break;
			}else if(i == 4) {
				formFill_Assignment.formFill_Assignmentfun();
			}else if(i == 0) {
				break;
			}else {
				System.out.println("!Invalid  Input");
				break;
			}
			
			
			
		}
		
		
	
		
		
		
		
		
}

	
}