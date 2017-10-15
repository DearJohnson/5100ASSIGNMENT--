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
public class Candy extends DessertItem{
    
    private double weight;
    private double price;
    
    public Candy(String name, double weight, double pricePerPound){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    
    @Override
    public double getCost(){
        return (int)Math.round(weight * price);
    }
}
