public class Max{
  public static void main(String[] args) {
    System.out.println(recursiveMaxDigit(578));
    System.out.println(recursiveMaxDigit(10));
    System.out.println(iterativeMaxDigit(9999));
    System.out.println(iterativeMaxDigit(13442 ));
  }


  public static int recursiveMaxDigit(int num){
    return helperMaxDigit(num, 0);
    }

  public static int helperMaxDigit(int num, int big){
    if (num == 0) {
      return big;
    } else if (num%10 > big) {
        big = num%10;
        return helperMaxDigit(num/10, big);
    } else{
        return helperMaxDigit(num/10, big);
    }
  }

  public static int iterativeMaxDigit(int num){
    int big = num%10;
    for (int test = num; test > 0; test = test/10) {
      if (test%10 > big) {
        big = test%10;
      }
      }
    return big;
    }
  }
