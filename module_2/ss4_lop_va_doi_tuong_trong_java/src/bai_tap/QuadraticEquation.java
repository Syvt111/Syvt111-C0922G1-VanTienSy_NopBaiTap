package bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a , b , c ;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c ){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b ;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a , b ,c ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if (equation.getDiscriminant()>0){
            System.out.println("The equation has two roots :" + (-equation.getB() + Math.pow(equation.getDiscriminant(),0.5))/2/equation.getA()+ " and " + (-equation.getB() - Math.pow(equation.getDiscriminant(),0.5))/2/equation.getA() );
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has one root :" + (-equation.getB()/2/equation.getA()));
        }else {
            System.out.println("The equation has no real roots");
        }
        {
            
        }

    }
}
