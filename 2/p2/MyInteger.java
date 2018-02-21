public class MyInteger {
  private int value;

  MyInteger(int _value) {
    value = _value;
  }

  public int getValue() {
    return value;
  }

  public static boolean isEven(int num) {
    return (num % 2 == 0);
  }

  public static boolean isOdd(int num) {
    return !isEven(num);
  }

  public static boolean isPrime(int num) {
    if (num == 1)
      return false;
    if (num == 2)
      return true;

    int i;
    boolean flag = false;
    for (i = 2; !flag && i < num; i++) {
      if (num % i == 0)
        flag = true;
    }
    if (flag)
      return false;
    else
      return true;
  }

  public static boolean isEven(MyInteger num) {
    return num.getValue() % 2 == 0;
  }

  public static boolean isOdd(MyInteger num) {
    return !isEven(num);
  }

  public static boolean isPrime(MyInteger num) {
    return isPrime(num.value);
  }

  public boolean equals(int num) {
    return value == num;
  }

  public boolean equals(MyInteger num) {
    return value == num.getValue();
  }
}