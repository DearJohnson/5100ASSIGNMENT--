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

import java.util.ArrayList;

public class UserData {
    
    private ArrayList <Transaction> transaction=new ArrayList<Transaction>();

    public void setTransaction(Transaction tr){
	transaction.add(tr);
    }
    
    public UserData() {
    }
	
    public void identifies() {
	if(isAuthenticated())
            transaction.get(transaction.size()-1).accountHandler();
	else
	    System.out.println("User Not authenticated");
    }
    
    public void newAtmCustomer(){
	transaction.clear();
        transaction.add(null);
    }    
	
    public boolean isAuthenticated(){
	transaction.get(1).accountHandler();
	if(transaction.get(1).transType().equals("Authenticated"))
	    return true;
	else
	    return false;
    }
}
