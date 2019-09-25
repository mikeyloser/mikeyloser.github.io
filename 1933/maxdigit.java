public class Max{
  public static void main(String[] args) {}


  public static int recursiveMaxDigit(int num){
    return helperMaxDigit(num, 0);
    }

  public static int helperMaxDigit(int num,int big){
    if (num < 10) {
      return big;
    } else if (num%10 > big) {
      big = num%10;
      return recursiveMaxDigit(num/10, big);
    } else{
        return recursiveMaxDigit(num/10, big);
    }
  }
  public static int iterativeMaxDigit(int num){}
}
