/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessertshoppe;

/**
 *
 * @author asus
 */

public abstract class DessertItem {
    protected String name;
    
    public abstract double getCost();
    
    public DessertItem(){   
    }
    
    public DessertItem(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public double getTax(double price,double TaxRate){
       double tax=Math.round(price*TaxRate);
       return tax;
    } 
    
}
