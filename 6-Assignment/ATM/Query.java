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

public class Query extends Transaction{
    public Query(Account ac){
	account=ac;
    }
    
    @Override
	public void accountHandler(){
	    System.out.println( account.getBalance());
        }
        
    @Override
        public String transType() {
            return "Balance Query";
        }
}
