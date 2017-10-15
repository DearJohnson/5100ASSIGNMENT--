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
public class IceCream extends DessertItem{
    private double cost;
    
    public IceCream(){
    }
    public IceCream(String name, double cost){
        this.name=name;
        this.cost=cost;
    }
    
    @Override
    public double getCost() {
	return cost;
    }
    
}
