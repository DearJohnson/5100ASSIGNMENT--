/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments7;

public class ReverseHello extends Thread {

    int number;

    public ReverseHello() {
    }

    public ReverseHello(int number) {
        this.number = number;
    }

    public void createNext(int number) {
        ReverseHello t = new ReverseHello(number);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        if (number < 50) {
            this.createNext(number + 1);
        }
        System.out.println("Hello from Thread " + this.number);
    }

}
