/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments7;

public class Sensor extends Thread {
    private final Device device;
    private double value;
    public Sensor(Device device) {
	this.device = device;
    }
    public double getValue() {
	return value;
    }
    public void updateValue() {
	this.value += 0.001; /// check with other values here and see how it works
    }
    
    public void run() {
	while (true) {
            synchronized (device) {
		this.updateValue();
		device.notify();
            }
        }
    }
    
}