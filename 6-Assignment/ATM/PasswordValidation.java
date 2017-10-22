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
public class PasswordValidation extends Transaction{
    private int cardno;
    private int psw;
    private boolean flag=false;
	
    public PasswordValidation(int cardn,int p,Account ac){
	account=ac;
	psw=p;
	cardno=cardn;
	}
    
    public boolean getFlag(){
	return flag;
    }

    @Override
    public void accountHandler() {
        flag=account.passwordValidation(cardno,psw);
    }

    @Override
    String transType() {
        if (flag)
	    return "Authenticated";
	else
            return "Not Authenticated";
    }
}