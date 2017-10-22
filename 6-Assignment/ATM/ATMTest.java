/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtest;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class ATMTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char s=' ';
	Scanner scanner = new Scanner(System.in);
	
        Bank bank1=new Bank();
	Card crd = new Card(1234567890,12345);
	Card crd1 = new Card(123456789,1234);
	Card crd2 = new Card(12345678,1234);
	
        Account accnt = new Account(1234554321, 1020);
	User user = new User("Xiaoyu", 22, "NEU", "2067908367",accnt);
	    accnt.setCard(crd);
	    bank1.addCard(crd);
	    bank1.addUser(user);
	
            Transaction tr,tr1,tr2;
	    UserData udata = new UserData();
		
	    while(true){
                System.out.println("Nice to meet U! Are U come here for the first time? Enter 0 -- means Yes; Enter 1 means you have registed before; Enter 2 -- means you have registed before but forgot the password; Enter 9 -- means exit now.");
                try{
                    String string = scanner.nextLine();
                    if(string.equals("0")){
                        udata.newAtmCustomer();
                    }
                    else if(string.equals("2")){
                        tr1=new PasswordChange();
                    }   
                    
                    else if(string.equals("1")){
                        System.out.println("Please enter your account card number: ");
                        int s1=scanner.nextInt();
                        System.out.println("Please enter your password: ");
                        int s2=scanner.nextInt();  
                        
                        tr=new PasswordValidation(s1,s2,bank1.accountCard(s1));
			udata.setTransaction(tr);
			udata.identifies();
                        System.out.println("\n\n\n");
                        
                        while(s!='e'){
                            System.out.println("Welcome! Enter a -- means you want to check your available balance; Enter w -- means you want to withdraw; Enter d means you have check the deposit; Enter q -- means you want to set a query; Enter s -- means you want to exit!");
                            System.out.println();
                            s = scanner.next().toLowerCase().charAt(0);
                        
                            if(s=='a'){
                                System.out.println("Please wait, check your available balance...");
                                accnt.getBalance();
                            }
  
                            if(s=='w'){
                                System.out.println("Please wait, withdraw...");
                                double s3 = scanner.nextDouble();
                                tr1=new Withdraw(s3,bank1.accountCard(s1));
                                udata.setTransaction(tr1);
                                udata.identifies();
                                tr1=null;
                                continue;
                            }
                    
                            else if(s=='d'){
                                System.out.println("Please wait, check deposit...");
                                double s4 = scanner.nextDouble();
		                tr1=new Deposit(s4,bank1.accountCard(s1));
			        udata.setTransaction(tr1);
			        udata.identifies();
			        tr1=null;
		 	        continue;
                            }
                    
                            else if (s=='q'){
                                tr1=new Query(bank1.accountCard(s1));
			        udata.setTransaction(tr1);
			        udata.identifies();
			        tr1=null;
			        continue;
                            }
                    
                            else if (s=='e'){
                                System.out.println("The info is as follows: " + bank1.accountCard(s1).getOwner());
                            }
                            else
                                System.out.println("Error! Invalid, please try again!");                           
                        }
                    }
                    else
                        System.out.println("Error! Invalid, please try again!");                     
                }catch (IllegalStateException e){
                            System.out.println("Error!");
                            e.printStackTrace();
                }
                s=scanner.next().charAt(0);
            }
    }
}   
