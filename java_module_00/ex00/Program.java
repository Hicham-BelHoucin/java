public class Program {
  public static void main(String[] args) {
    int result = 0;
    int number = 479598;
    
    while (number > 0) {
      result += number % 10;
      number /= 10;
    }
    System.out.println(result);
  }
}