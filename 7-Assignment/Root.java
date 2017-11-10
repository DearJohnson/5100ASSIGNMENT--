/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments7;

public class Root {
    public static void main(String[] args) {
       
	Device device = new Device();
	Sensor heat = new Sensor(device);
	Sensor pressure = new Sensor(device);
	
        Controller controller = new Controller(device, heat, pressure);
	
        controller.start();
	heat.start();
	pressure.start();
    }
}