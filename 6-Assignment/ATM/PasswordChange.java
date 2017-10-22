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
public class PasswordChange extends Transaction{
    
    private int newPasswd;
    PasswordChange(){       
    }
    
    public PasswordChange(int p, Account ac){
        account = ac;
        newPasswd = p;
    }
    
    @Override
    public void accountHandler() {
       account.passwordChange(newPasswd);
    }

    @Override
    public String transType() {
        return "Password succesfully changed";
    }
}
