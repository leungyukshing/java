public class MyIntegerDemo {
  public static void main(String[] args) {
    MyInteger number1 = new MyInteger(10);
    System.out.println("7 is even? " + MyInteger.isEven(7));
    System.out.println("7 is odd? " + MyInteger.isOdd(7));
    System.out.println("7 is prime? " + MyInteger.isPrime(7));
    
    System.out.println("10 is even? " + MyInteger.isEven(number1));
    System.out.println("10 is odd? " + MyInteger.isOdd(number1));
    System.out.println("10 is prime? " + MyInteger.isPrime(number1));
    
    System.out.println("7 and 10 are equal? " + number1.equals(7));  
  }
}