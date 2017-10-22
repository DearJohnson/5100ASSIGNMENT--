/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmoperate;

import java.util.ArrayList;

/**
 *
 * @author asus
 */

public class Bank {
    private ArrayList <UserData> atm=new ArrayList();
    private ArrayList <User> user=new ArrayList();
    private ArrayList <Card> card=new ArrayList();
	
    public void addCard(Card c){
	card.add(c);
    }
		
    public void addUser(User u){
	user.add(u);
    }

    public void addATM(UserData a){
	atm.add(a);
    }

    public Account accountCard(int n){
	int i;
	for(i=0;i<user.size();i++){
	    if(user.get(i).getAccount().getCard()==n){
		break;
            }
        }
        return user.get(i).getAccount();
	}
	public Account accountAccountNo(int n){
	    int i;
	    for(i=0;i<user.size();i++){
		if(user.get(i).getAccount().getAccountNumber()==n){
		    break;
                }
            }
            return user.get(i).getAccount();
        }
}
