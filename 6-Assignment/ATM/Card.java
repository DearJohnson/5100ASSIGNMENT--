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
public class Card {
    private int cardNo;
    private String OwnedBy;
    private int password;
    private int accountNo;
    public void setPassword (int p){
	password = p;
    }
    public int getPassword(){
	return password;
    }
    public void setOwnedBy(String n){
	OwnedBy=n;
    }
    public void setaccountNo(int a){
	accountNo=a;
    }
    public int getaccountNo(){
	return accountNo;
    }
	
    public Card() {
	cardNo=0;
	OwnedBy = " ";
	password = 0;	
    }
    public Card(int crdNo, int pw) {
	cardNo=crdNo;
	OwnedBy = " ";
	password = pw;
	accountNo=0;
    }
    public boolean passwordValidations(int num,int pws){
        if(password == pws && cardNo==num){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean access (int p){
	if(password==p)
	    return true;
	else
	    return false;
	}

	public int getCardNO() {
	    return cardNo;
	}
}
