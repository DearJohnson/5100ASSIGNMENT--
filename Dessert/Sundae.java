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
public class Sundae extends IceCream {
    private String toppingName;
    private double toppingCost;
    
    public Sundae(){ 
    }
    public Sundae(String name, int cost, String toppingName, int toppingCost){
        super(name, cost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }
    
    @Override
    public double getCost() {
        return super.getCost() + this.toppingCost;
    }
    
}
