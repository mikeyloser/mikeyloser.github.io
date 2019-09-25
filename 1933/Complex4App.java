// Complex4App.java
// Revised 1/2019

// This driver program uses the Complex4.java class.
// Tests the toString() and equals() methods
// Make sure that you understand the difference between
// equals() and == .  
// Also, remember that an unimplemented equals() is ==. 

public class Complex4App {
  
    public static void main (String[] args) {

        Complex4 c1, c2;
        double realSum, imaginarySum;
  
        c1 = new Complex4(0, 0);  // create an instance of Complex
        c2 = new Complex4(0, 0);  // create another instance of Complex

        System.out.println(c1.toString());
        System.out.println(c2);

        if (c1.equals(c2))
          System.out.println("They are equal");
        else System.out.println("They are NOT equal");


        c1.setRealPart(1.0);  
        c1.setImaginaryPart(2.0);
        c2.setRealPart(3.0);
        c2.setImaginaryPart(4.0);

        System.out.println(c1.toString());
        System.out.println(c2);

        if (c1.equals(c2))
          System.out.println("They are equal");
        else System.out.println("They are NOT equal");

    }  // main

}  // Complex4App class
