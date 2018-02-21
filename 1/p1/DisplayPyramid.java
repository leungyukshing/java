import java.util.Scanner;

public class DisplayPyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int height = input.nextInt();
    for (int i = 1; i <= height; i++) {
      for (int a = 0; a < 2 * (height-i); a++) {
        System.out.print(" ");
      }
      for (int j = i; j > 1; j--) {
        System.out.print(j + " ");
      }
      System.out.print(1 + " ");
      for (int k = 2; k < i; k++) {
        System.out.print(k + " ");
      }
      if (i != 1) {
        System.out.print(i + "\n");
      }
      else {
        System.out.print("\n");
      }
    }
    return;
  }
}