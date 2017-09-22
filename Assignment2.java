/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;

/**1. Write a java function to calculate the salary of an employee based on the following rules.
    i. function takes input of number of hours an employee worked and returns the salary.
    ii.  The first 36 hours worked are paid at a rate of 15.0,
     then the next 5 hours are paid at a rate of 15 * 1.5.
     Hours after that up to a max of 48 are paid at a rate of 15 * 2.**/

public class SalarySum {
    public static void main(String[] args) {
        // TODO code application logic here
         //SalarySum a=new  SalarySum();
         Scanner in = new Scanner(System.in);
                double hours=in.nextDouble();
         employeeSalary.employeeSalary(hours);
     }
}
public class employeeSalary {
    public static void employeeSalary( double hours){
		// Scanner in = new Scanner(System.in);
                // hours=in.nextDouble();
               // hours=15;
                double salary;
                if(hours<=36.0){
                salary=hours*15;
        System.out.println(salary);
    }
                else if(hours<=41.0){
                salary=15*36+(hours-15)*15*1.5;
                System.out.println(salary);
                }
                else if(hours<=48.0){
                salary=15*36+5*15*1.5+(hours-41)*15*2;
                System.out.println(salary);
                }
                else{
                System.out.println("超过限定时间，请重试！");
                }
		}
}


/**2. Write a java function that adds all the digits of an integer until it is single digit.
    i. function takes an integer as input and returns its sum of digits.
    ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.**/

public class DigitsInteger {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
                int a=in.nextInt();
                addDigits(a);
    }
    public static void addDigits( int a){
                int f=0;
                for(int i=0;(a/Math.pow(10,i))>=1;i++)
                {
                int d=(int) ((a/Math.pow(10,i))%10);
                f=d+f;
                }
		System.out.println(f);
		}
}


/**3. Write a java function to print all perfect number between 1 and n.
    i. Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    ii. For example: 6 is the first perfect number, Proper divisors of 6 are 1, 2, 3.
     Sum of its proper divisors = 1 + 2 + 3 = 6.**/

public class PrintPerfectNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner in = new Scanner(System.in);
                int n=in.nextInt();
                printPerfectNumbers(n);
    }
    public static void printPerfectNumbers( int n){
		//int sum=0;
                for(int j=1;j<=n;j++){
                    int sum=0;
                for(int i=1;i<j;i++){
                int a=j%i;
                    if(a==0){
                    sum=sum+i;
                   // System.out.println(sum);
                    }
                    
                }
                if(sum==j){
                System.out.println(j);
                }
		}
    }
}


/**4. Write a java class called pizza with (Add detail as needed) :
     i. Create at least 3 attributes :pizza type , unit price and loyalty points. More attributes are welcome to have.
     ii. Create constructors . Extra-credit of 0.5 point if you write more than 1 right constructor to this class**/


public class Pizza {
    String pizzaType="regular";
    double unitPrice=10.00;
    int loyaltyPoints=10;
    String evaluation="Empty";

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pizza Number:");
        Scanner in = new Scanner(System.in);
                int n=in.nextInt();
        System.out.println("Pizza Evaluation:");
        Scanner ha = new Scanner(System.in);
                String m=ha.nextLine();
                orderPizza(n);
                evaluation(m);
    }
    public static void orderPizza(int n){
        Pizza a=new Pizza();
        
    switch(n){
        case 1:
            a.pizzaType="Hawaii";
            a.unitPrice=11.50;
            a.loyaltyPoints++;
            System.out.println(a.pizzaType);
            System.out.println(a.unitPrice);
            System.out.println(a.loyaltyPoints);
            break;
        case 2:
            a.pizzaType="Chicago";
            a.unitPrice=15.85;  
            a.loyaltyPoints++;
            System.out.println(a.pizzaType);
            System.out.println(a.unitPrice);
            System.out.println(a.loyaltyPoints);
            break;
        default:
            System.out.println("Error");
            
    }
    }
    public static void evaluation(String m){
        System.out.println(m);
    }
}


/**5. Write a java class called customer (Add detail as needed) :
     i. Create Attributes: customer name and which pizzas customer has ordered.
     ii. Think about what kind of data structure can be used to record the pizza name and number of each kind of pizza.( Give me your thought, Extra credit of 1 point)
     iii. In main method , sum up how much money the customer spent.**/

import java.util.HashMap;

public class Customer {
    String customer="Ze";
    String pizza="Hawaii";
    
    public static void main(String[] args) {
        HashMap<String, Integer> cp=new HashMap<String ,Integer>();
                cp.put("Hawaii",11);
                cp.put("Chicago",15);
        System.out.println("Customer:");
        Scanner in = new Scanner(System.in);
                String n=in.nextLine();
        System.out.println("Pizza Type(Hawaii or Chicago):");
        Scanner ha = new Scanner(System.in);
                String m=ha.nextLine();
                int a=cp.get(m);
        System.out.println("Number:");
        Scanner liu = new Scanner(System.in);
                int b=ha.nextInt();
                int c=a*b;
                System.out.println("Price:");
                System.out.println(c);
        // TODO code application logic here
    }
}


// EXTRA CREDIT
     /**6. Write a Java program that generates an isosceles right angled triangle made of asterisks.
     i. function should take input of one equal side as integer. Other than the edges the inner part of the triangle should be empty.
     ii. For example input is 6. the function should print—
     *
     **
     * *
     *  *
     *   *
     ******/

public class PrintIsoscelesTriangle {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printIsoscelesTriangle(n);
    }
    public static void printIsoscelesTriangle( int n){
		
		for(int i=1;i<n;i++){
                    
                    for(int j=1;j<=i;j++){
                    if(j==1){
                    System.out.print("*");
                    }
                    else if(j==i){
                    System.out.print("*");
                    }
                    else{
                    System.out.print(" ");
                    }
                    }
                    System.out.println();
                   
                        
                        }
                    for(int k=1;k<=n;k++){
                    System.out.print("*");
                    }
		}
}

