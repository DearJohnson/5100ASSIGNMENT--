/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtest;

/**
 *
 * @author apple
 */
public class Deposit extends Transaction {
    private double amount;
    public double getAmount() {
	return amount;
    }
    public Deposit(double amount) {
	this.amount = amount;
    }
    public Deposit(double a,Account ac){
	account=ac;
	amount=a;
    }
    
    @Override
	public void accountHandler() {
	    account.setBalance(account.getBalance()+amount);
	}
    @Override
	public String transType() {
	    return amount +" Deposited";
	}
}