import java.util.*;

public class ATMTransaction1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        	String pin, option;
		double balance = 1000;
		double input;
		
		System.out.println("\n================================");
        	System.out.println("Welcome to Online Banking!");
		System.out.println("Enter Pin:");
		pin = sc.nextLine();
		
		if (pin.equals("123456")){
	        System.out.println("Transaction available: \n[W] - Withdraw \n[D] - Deposit \n[C] - Check Balance");
	        System.out.println("Choose Transaction: ");
	        option = sc.nextLine().toUpperCase(); 
			
	    switch (option){
	    case "W":
	        System.out.println("\nHow much would you like to withdraw: ");
	        input =sc.nextDouble();
	            if(input%100==0 && input <= balance){
	                balance -=input;
	                System.out.println("Your remaining balance is: "+ balance);
	                System.out.println("You'll get "+ input + " pesos.");
	            }
	            else{
	                System.out.println("\nInvalid withdrawal amount or insufficient funds!\n");
	            }
	   break;
	   case "D":
	        System.out.println("\nHow much would you like to deposit: ");
	        input = sc.nextDouble();
	            if(input > 0){
	                balance += input;
	                System.out.println("Your remaining balance is: "+ balance);
	            }
	            else {
	                System.out.println("Invalid deposit amount!");
	            }	
	   break;
	   case "C":
	        System.out.println("\nYour remaining balance is: "+ balance); 
	   break;
	   default:
	   		System.out.println("\n===Invalid transaction choice!===\n");  		   
	    }
	}
        else {
            System.out.println("\n===Incorrect PIN!===\n");
        }
		System.out.println("Thank you for banking with us!\n");
		System.out.println("================================");
        sc.close();
    }
}
