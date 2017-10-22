/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtest;

/**
 *
 * @author asus
 **/

public class Account {
    private String owner;
    private int AccountNumber;
    private double balance;
    private Card card;
	
    public String getOwner() {
	return owner;
    }
    public void setOwner(String owner) {
	this.owner = owner;
    }
    public int getAccountNumber() {
	return AccountNumber;
    }
    public void setAccountNumber(int AccountNumber) {
	this.AccountNumber = AccountNumber;
    }
    public double getBalance() {
	return balance;
    }
    public void setBalance(double balance) {
	this.balance = balance;
    }
	
    public void setCard(Card c){
	card=c;
	card.setaccountNo(AccountNumber);
    }	
    public int getCard(){
	return card.getCardNO();
    }
	
	
    public Account() {
	owner = " ";
	AccountNumber = 0;
	balance = 0.0;
	card = new Card();
    }
    
    public Account(int AccNum, double bal) {
	owner = " ";
	AccountNumber = AccNum;
	balance = bal;
	card = new Card();
	card.setOwnedBy(owner);
	card.setaccountNo(AccountNumber);
    }
	
    public boolean passwordValidation(int num,int psw){
	return card.passwordValidations(num, psw);
    }	
	
    public void passwordChange(int psw){
	card.setPassword(psw);
    }
}

