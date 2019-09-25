import java.util.Scanner;
public class Fib {

  public static void main(String[] args){
    System.out.println("Type n (type stop to stop):");
    Scanner myScanner = new Scanner(System.in);
    while (myScanner.hasNextInt()){
      int input = myScanner.nextInt();
      System.out.println(fibonacciRecursive(input));
    }
  }

  public static int fibonacciRecursive(int n) {
    if (n <= 1) {
      return n;
    }    else {
      return (fibonacciRecursive(n-1) + fibonacciRecursive(n-2));
    }
    }
  }
