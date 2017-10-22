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

public class User {
    private String name;
    int age;
    private String address;
    private String phoneNum;
    private Account bankAccount;
    
    public User(){   
    }
    public User(String name, int age, String address, String phoneNum, Account bkAccount){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNum =phoneNum;
        bankAccount = bkAccount;
        bankAccount.setOwner(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public Account getAccount(){
	return bankAccount;
    }
    
    public String toString(){
        return name+", "+age+", "+address+", "+phoneNum+", "+bankAccount;
    }
}
