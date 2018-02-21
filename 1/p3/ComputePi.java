public class ComputePi {
  public static void main(String[] args) {
    double Pi, tmp;
    double sum = 0;
    for (int index = 1; index <= 10; index++) {
      sum = 0;
      for (int i = 1; i <= index * 10000; i++) {
        tmp = Math.pow(-1, i + 1) * 1.0 / (2 * i - 1);
        sum += tmp;
      }
      Pi = sum * 4;
      System.out.println("Pi = " + Pi + " when i = " + index);
    }
  }
}