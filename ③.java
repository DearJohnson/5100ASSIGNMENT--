//Q1

// 1. super():it does not have parent class to extend
// 2. two Structures can not contain same type 
// 3. construct does not have return value or void
// 4. setName actually is getName


//Q2

// 1. void can not coexist with return(time) 


//Q3

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omit.vowel;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class OmitVowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        removeVowelsFromString(a);
        
    }
    public static String removeVowelsFromString(String a){
	// Consider upper case vowels
        String a1;
        a1 = a.replace("a","");
        
        String e;
        e = a1.replace("e", "");
        
        String i;
        i = e.replace("i", "");
        
        String o;
        o = i.replace("o", "");
        
        String u;
        u = o.replace("u", "");
        
        System.out.println(u);
       

    return u;
    
    }
}


//Q4

package anagram;
import java.util.Scanner;

public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a1=new Scanner(System.in);
        String a=a1.nextLine();
        Scanner a2=new Scanner(System.in);
        String b=a2.nextLine();
        checkIfTwoStringsAreAnagram(a,b);
        
    }
       public static String removeAt(String l, int pos) {
      return l.substring(0, pos) + l.substring(pos + 1);
      }
       public static boolean checkIfTwoStringsAreAnagram(String s1, String s2){
       int c=s1.length();
       int d=s2.length();
       if(c!=d){
       return false;
       }
       else{
         for(int i=0;i<c;i++){
         char item=s1.charAt(i);
           for(int j=0;j<d;j++){
           // Did I miss anthing? i should be j? (-1.5)
           char item1=s2.charAt(i);
             if(item==item1){
                 s1=removeAt(s1,i);
                 s2=removeAt(s2,i);
             break;
             }else if(j==c-1){
             return false;
             }
           }
         }
         return true;
       }
    }
}


//Q5

package Calculator;
import.java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
    
public class Calculator {
	
   /**
    * @param args the command line arguments
    */
    private double[] equation;
    private double value;
    public Calculator(double x, double y, String c){
        Scanner input = new Scanner(System.in);
        double firstnum;
        double secondnum;
        String operation;
        System.out.println("Please enter your first number: ");  
        firstnum = input.nextDouble();
        System.out.println("Please enter the operation you want to execute: ");
        operation = input.next();
        System.out.println("Please enter your second number: ");  
        secondnum = input.nextDouble();
        Map<String, Double> results = new HashMap<>();
        results.put("+", firstnum + secondnum);
        results.put("-", firstnum - secondnum);
        results.put("*", firstnum * secondnum);
        if (secondnum != 0){
            results.put("/", firstnum / secondnum);
        }
        else 
            System.out.println("Please enter a positive second number: ");
        if (results.get(operation) == null) {
            System.out.println("Your operation was not recongized.");
        }
        else
            System.out.println("=" + results.get(operation).toString());
    }
    
    public Calculator (double m, String n){
        double output;
	if(n.equals("squareRoot")){
            if (m > 0){
                output = Math.sqrt(m);
                System.out.println("=" + output);
            }
            else
                System.out.println("Please enter a positive number: ");
        }
        else if(n.equals("square")){
            output = m * m;
            System.out.println("=" + output);
        }
        else if(n.equals("cube")){
            output = m * m * m;
            System.out.println("=" + output);
        }
        else if (n.equals("Fahrenheit")){
            output = (m - 32) / 1.8;
            System.out.println("the Celsius is: " + output);           
        }
        else if(n.equals("Celsius")){
            output = m * 1.8 + 32; 
            System.out.println("the Fahrenheit is: "+ output);
        }
        else if(n.equals("feet")){
            output = m * 12;
            System.out.println("the inch is: "+ output);
        }
        else if(n.equals("inch")){
            output = m * 0.083;
            System.out.println("the feet is: "+ output);
        }
        else
            System.out.println("Error: The operation or transformation cannot be recongized!");
    }
    
    public Calculator(double a, double b, double c){
        Scanner input = new Scanner(System.in);
        double value = 0;
        double[] equation = new double[2];
        System.out.println("Please enter your first number: ");  
        a = input.nextDouble();
        System.out.println("Please enter your second number: "); 
        b = input.nextDouble();
        System.out.println("Please enter your third number: ");  
        c = input.nextDouble();
        if (a != 0 && b != 0){
            double k = Math.sqrt(b * b - 4 * a * c);
            double k1 = (-b + k) / (2 * a);
            double k2 = (-b - k) / (2 * a);
            this.equation[0] = k1;
            this.equation[1] = k2;
            System.out.println("the result of this equation is: ");
            for (int i = 0; i < 2; i++){
                System.out.println(equation[i]);
            }
        }
        else if(a == 0 && b != 0){
            this.value = -c / b;
            System.out.println("the result of this equation is:" + value);      
        }
        else if(a == 0 && b == 0)
            System.out.println("Error: The equation cannot be recongized!");
    }
    
    public static void main(String[] args) {
        Calculator c1 = new Calculator(9,16,35);
        Calculator c2 = new Calculator(144,"squareRoot");
        Calculator c3 = new Calculator(21,"cube");
        Calculator c4 = new Calculator(80,"Fahrenheit"); 
        Calculator c5 = new Calculator(345,"feet");  
    }
}
