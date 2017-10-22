/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtest;

/**
 *
 * @author asus
 */

public class AmountTransfer extends Transaction{
	
    private double amount;
    private int accountNumber;
    private double transactionFee;
    private double availableAmountInMachine;
    
    public AmountTransfer(double amou,double transactionFee, double availableAmountInMachine, Account originalAccount,Account TransferAccount){
	amount=amou;
        transactionFee = transactionFee;
        availableAmountInMachine = availableAmountInMachine;
	account=originalAccount;
	transAc=TransferAccount;
    }
    
    @Override
	public void accountHandler() {
	    double temp=0;
	    if(account.getBalance()>=amount){
		account.setBalance(account.getBalance()-amount-transactionFee);
		temp=amount;
            }
	    transAc.setBalance(transAc.getBalance()+amount);
            availableAmountInMachine -= amount;
        }
        
    @Override
        public String transType() {
           return amount+" Transfered to"+transAc.getAccountNumber(); 
        }
}
