/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmoperate;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ATMOperate {
	
    public static void main(String[] args) {
        
        char c='z';
	Scanner scanner = new Scanner(System.in);
	
        Bank bank1=new Bank();
	Card crd = new Card(135632,666666);
	Card crd1 = new Card(9857342,888888);
	Card crd2 = new Card(7656293,999999);
	
        Account accnt = new Account(56743289124, 9889);
	User user = new User("Ze", 23, "ILLUMINA", "2067654321",accnt);
	    accnt.setCard(crd);
	    bank1.addCard(crd);
	    bank1.addUser(user);
	
            Transaction tr,tr1,tr2;
	    UserData udata = new UserData();
		
	    while(true){
                System.out.println("Are U come here for the first time? Enter 0: Yes; Enter 1: have registed before; Enter 2: forgot password; Enter 9: exit");
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
                        
                        System.out.println("Please choose. Enter a: check available balance; Enter w: withdraw; Enter d: check the deposit; Enter q: set a query; Enter s: exit");
                            System.out.println();
                            s = scanner.next().toLowerCase().charAt(0);
                        
                            if(c =='a'){
                                System.out.println("Please wait, check your available balance...");
                                accnt.getBalance();
                            }
  
                            if(c =='w'){
                                System.out.println("Please wait, withdraw...");
                                double s3 = scanner.nextDouble();
                                tr1=new Withdraw(s3,bank1.accountCard(s1));
                                udata.setTransaction(tr1);
                                udata.identifies();
                                tr1=null;
                                continue;
                            }
                    
                            else if(c =='d'){
                                System.out.println("Please wait, check deposit...");
                                double s4 = scanner.nextDouble();
		                tr1=new Deposit(s4,bank1.accountCard(s1));
			        udata.setTransaction(tr1);
			        udata.identifies();
			        tr1=null;
		 	        continue;
                            }
                    
                            else if (c =='q'){
                                tr1=new Query(bank1.accountCard(s1));
			        udata.setTransaction(tr1);
			        udata.identifies();
			        tr1=null;
			        continue;
                            }
                    
                            else if (c =='e'){
                                System.out.println("The info is as follows: " + bank1.accountCard(s1).getOwner());
                            }
                            else
                                System.out.println("Error! Invalid, please try again!");                           
                       
                    }
                    else
                        System.out.println("Error! Invalid, please try again!");                     
                }catch (IllegalStateException e){
                            System.out.println("Error!");
                            e.printStackTrace();
                } 
                c =scanner.next().charAt(0);
            }
    }
}    
