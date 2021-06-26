package selenium;

import java.util.Scanner;

public class mainMethodAssignment {

	public static void main(String[] args) throws InterruptedException {
		Scanner inp = new Scanner(System.in); 
		
		System.out.print("Enter the program you want to run Enter 1: for Broken Links check 2: for login automation "
				+ " 3: ticket search"+ " 4: formfill automation"+ " 0 to exit");
		
		int i = inp.nextInt();
		
		
		
		while(true) {
			if(i == 1) {
				//check broken links on a website https://canadagenix.com
				System.out.println("Enter the link eg: 'https://canadagenix.com'");
				inp.nextLine();
				String s = inp.nextLine();
				brokenLinksAssignment.brokenLinksChecker(s);
			}else if(i == 2) {
				//Login
				login_Assignment.login_Assignmentfun();
			}else if(i == 3) {
				//Ticket search
				ticketBooking_assignment.ticket();
			}else if(i == 4) {
				formFill_Assignment.formFill_Assignmentfun();
			}else if(i == 0) {
				
			}else {
				System.out.println("!Invalid  Input");
			}
			
			
			
		}
		
		
	
		
		
		
		
		
}

	
}