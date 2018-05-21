/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author BRACT-Admin
 */
class complex
{
    double real,imag;
    //Using accept method we are assign value for the real and imag part of complex number.
    public void accept()
    {
        real = 10;
        imag = 20;
    }
    //Here i am display real and imag part of the complex number.
    public void display()
    {
        System.out.println("Real part is"+real);
        System.out.println("Imag part is"+imag);
    }
    //Addition of two complex number for that purpose we want to pass one object in addition function.
    public void additionOfComplexNumber(complex num1)
    {
        complex result = new complex();
        result.imag = imag + num1.imag;
        result.real = real + num1.real;
        result.display();
    }
}
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hi this is simple program for git-hub
        System.out.println("helloworld.HelloWorld.main()");
        //i am creating object of the complex number and call the function of complex number.
        complex num1 = new complex();
        num1.accept();
        //num2 is the second complex number.
        complex num2 = new complex();
        num2.accept();
        num1.additionOfComplexNumber(num2);
        
    }
    
}
