import java.util.Scanner;
public class Histogram {
  int low;
  int high;
  static int[] array;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("---Histogram Console---");
    System.out.println("Options");
    System.out.println("add - used to add members to the histogram");
    System.out.println("print - prints the histogram to the screen");
    System.out.println("quit - leaves the program");
    System.out.println();
    System.out.println();
    System.out.println("Enter Range to get started:");
    Histogram h = new Histogram(scan.nextInt(), scan.nextInt());
    array = new int[h.high-h.low+1];

  }

  public Histogram(int lowerbound, int upperbound){
    if (lowerbound > upperbound){
      low = upperbound;
      high = lowerbound;
    }
    else {
      low = lowerbound;
      high = upperbound;
    }

  }

  public boolean add(int i){
    if (i < low || i > high){
      return false;
    } else {
      return true;
    }
  }


  public String toString(){
    for (int i = 0; i <= (high-low); i++){
      return (low+i) + ":";
      for (int x = array[i]; x > 0; x--){
        return "*";
      } return "\r\n";
    }
}
}
