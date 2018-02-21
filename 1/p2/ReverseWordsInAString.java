import java.util.Scanner;

public class ReverseWordsInAString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    String array[] = sentence.split(" ");

    for (int i = 0; i < array.length; i++) {
      for (int j = array[i].length() - 1; j > -1; j-- ) {
        System.out.print(array[i].charAt(j));
      }
      System.out.print(" ");
    }
  }
}