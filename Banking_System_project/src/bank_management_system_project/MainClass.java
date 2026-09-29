package bank_management_system_project;

import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {  // main method
		
		
		Bank_System sb= new Bank_System();
		ArrayList<Data> data = new ArrayList<Data>();
		
		// Account holders details 
		
		//                     *name         *Ac number      *id
		
		data.add(new Data("shahruk shaikh", 12345678901l, "srk@5143",1700.3)); // ac number :-12345678901
		
		data.add(new Data("sameer shaikh", 12345678902l, "sam@123",2550.15)); //   12345678902
		
		data.add(new Data("faruk patel", 12345678903l, "far@123",1000.0)); //12345678903
		
		data.add(new Data("dishan khan", 12345678904l, "dis@123",150));//12345678904
		
		data.add(new Data("sunil thombre", 12345678905l, "sun@123",800.23)); // 12345678905
		
		data.add(new Data("eknath patil", 12345678906l, "ekn@123",600));//12345678906
		
		data.add(new Data("gita kale", 12345678907l, "git@001",366.48));//12345678907
		
		
		//------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter Acount Number");
		long acnumber= scanner.nextLong();
		
		
		
		
		for (Data data2 : data) {
			if(data2.getAcountNumber()==acnumber) {
				
				System.out.println("ac Holder :" + data2.getAcHolder()+"  Acount Number: "+data2.getAcountNumber()+"  User Id: "+data2.getUserID()+" Acount Balance: "+data2.getBalance());
				Scanner scanner1 = new Scanner(System.in);
				// balance variable is our private variable
				double balance = data2.getBalance();
				
				// program is running 
				boolean isRunning = true;
				
				// Declaring int choice to use in switch case 
				int choice;

				// for repeatable perches we gona use wile loop until user exit from the system
				while (isRunning) {
					
					// scanner class options 
					System.out.println("--------------------");
					System.out.println("BANKING PROGRAM");
					System.out.println("------------------------");
					System.out.println("1.Show Balance");
					System.out.println("2. Deposite");
					System.out.println("3. Withdraw");
					System.out.println("4. Exit");

					System.out.println("**************************");

					System.out.print("Enter Your Choice (1-4)");
					choice = scanner1.nextInt();

					// in side of wile loop we use switch case for different different option 
					switch (choice) { // choice is int type 
					
					// if user enter 1 --> system will show balance 
					case 1 -> System.out.println("Rs: "+balance);
					
					// if user enter 2 --> its for deposit previous balance + deposit amount (deposit() method in Bank_System class) 
					case 2 -> balance = balance + sb.diposite();
					
					// if user enter 3--> for withdraw = previous balance - withdraw amount (withdraw() method in Bank_System class) 
					case 3 -> balance = balance - sb.withdraw(balance);
					
					// case 4 for exit --> wile loop condition is run until isRunning is true , press 4 and isRunning get false and wile loop will be terminate  
					case 4 -> isRunning = false;
					
					// in case user input is random number other than given choice  get massage "Invalid Choice"
					default -> System.out.println("Invalid Chois");
					}
					
				}
				// after while loop exit get massage for user 
				
				System.out.println("************************");
				System.out.println("Thank you! Have a nice day! ");
					System.out.println("******************************");
				
				
			}
	
		}
		
	}

}
