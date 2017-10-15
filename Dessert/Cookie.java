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
public class Cookie extends DessertItem {
    
     private double price;
    private double weight;
   
    public Cookie(){
    }
    public Cookie(String name, double weight,double price){
        this.name=name;
        this.weight=weight;
        this.price=price;
    }
    
    @Override
    public double getCost(){
        return (int)Math.round(weight * price / 12); //4 * 399 / 12 = 133cents
    }
    
}
    
   

