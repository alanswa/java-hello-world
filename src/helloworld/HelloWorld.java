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
}
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hi this is simple program for git-hub
        System.out.println("helloworld.HelloWorld.main()");
        //i am creating object of the complex number and call the function of complex number.
        complex c = new complex();
        c.accept();
        c.display();
    }
    
}
