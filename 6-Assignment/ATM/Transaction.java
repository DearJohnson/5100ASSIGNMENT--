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

public abstract class Transaction {

    protected int transactionId; 
    protected int date;			
    protected Account account,transAc;

    public int getDate() {
	return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTransactionId() {
	return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }	
    abstract void accountHandler();	
    abstract String transType();
    
}
