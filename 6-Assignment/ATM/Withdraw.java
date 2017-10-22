/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmoperate;

/**
 *
 * @author asus
 */

public class Withdraw extends Transaction {
    private double amou;
    public double getAmount() {
	return amou;
    }

    public void setAmount(double amou) {
        this.amou = amou;
    }
    
    public Withdraw(double a,Account ac){
	account=ac;
	amou=a;
    }
    
    @Override
	public void accountHandler(){
	    if(account.getBalance()>=amou)
		account.setBalance(account.getBalance()-amou);
        }
   
    @Override
        public String transType() {
	    return amou+" Withdrawed";
	}
}
