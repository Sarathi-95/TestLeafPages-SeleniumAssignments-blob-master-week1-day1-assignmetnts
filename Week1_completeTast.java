package org.Week1;

public class Week1Task {
    static int number = 35;
    static int negativeNumber = -40;
    public void positiveOrNegative() {
        if (number>= 0) {
            System.out.println("The given number " + number + " is Positive  ");
        } else
            System.out.println("The given number " + number + " is Negative ");
    }
    public void convertNegativetoPositive() {
        if (negativeNumber< 0) {
            System.out.println("\n The given number  is Negative ====>"+negativeNumber);
            int postiveNumber =negativeNumber*(-1);
            System.out.println("The given number converted into  Positive ===>"+postiveNumber);
        } else
            System.out.println("The given number " + number + " is Positive ");
    }
    public void fibonacciSeries() {
        int a=0;        int b=1;        int c=0;        int rangre=5;
        System.out.println("\n The Fibonacci series: ");
        for (int i = a; i <=rangre ; i++) {
            if(c<=rangre){
                    c=a+b;
                //System.out.println("The Fibonacci series: ");
                    System.out.print( c +" " );
                    a=b;
                    b=c;
            }   }  }
    public void factorialNo() {

        int n=5; int fact=1;
        for (int i = 1; i <=n; i++)
        {		fact=fact*i;
        }
        System.out.println("\n Factorial of "+n+" is: "+fact);
    }
    public static void main(String[] args) {
           Week1Task week1Task=new Week1Task();
           week1Task.positiveOrNegative();
           week1Task.convertNegativetoPositive();
           week1Task.fibonacciSeries();
           week1Task.factorialNo();
    }
}
