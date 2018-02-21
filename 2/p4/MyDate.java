public class MyDate {
  private int year;
  private int month;
  private int day;

  private static String[] strMonths = {"None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                                        "Aug", "Sep", "Oct", "Nov", "Dec"};
  private static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                                      "Friday", "Saturday"};
  private static int[] daysInMonths = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /*
    Return true if the given year is a leap year. A year is a leap year 
    if it is divisible by 4 but not by 100, 
    or it is divisible by 400.
  */
  public static boolean isLeapYear(int y) {
    if (y % 4 == 0 && y % 100 != 0) {
      return true;
    }
    if (y % 400 == 0)
      return true;
    return false;
  }

  /*
    Returns true if the given year, month, and day constitute a valid date.
  */
  public static boolean isValidDate(int y, int m, int d) {
    if (y < 1 || y > 9999)
      return false;
    if (m < 1 || m > 12)
      return false;
    if (d < 1)
      return false;

    if (m == 2) {
      boolean isLeap = MyDate.isLeapYear(y);
      if (isLeap) {
        if (d > 29) {
          return false;
        }
      }
      else {
        if (d > daysInMonths[m]) {
          return false;
        }
      }
    }
    else {
      if (d > daysInMonths[m]) {
        return false;
      }
    }
    return true;
  }

  /*
    Returns the day of the week.
  */
  public static int getDayOfWeek(int y, int m, int d) {
    int _year = y;
    int _m = m;
    int _d = d;
    if (m == 1) {
      _m = 13;
      _year--; 
    }
    else if (m == 2) {
      _m = 14;
      _year--;
    }

    int _y = _year % 100;
    int _c = _year / 100;
    int day = (int)(_y + Math.floor(_y / 4) + Math.floor(_c / 4) - 2 * _c + Math.floor((26 * (_m + 1)) / 10) + _d - 1);
    day = (day % 7 + 7) % 7;
    return day;
  }

  /*
    It shall invoke setDate() method to set the instance variables.
  */
  MyDate(int _year, int _month, int _day) {
    setDate(_year, _month, _day);
  }
  
  /*
    It shall invoke ValidDate() to verify that the date.
  */
  public void setDate(int y, int m, int d) {
    if (MyDate.isValidDate(y, m, d)) {
      setYear(y);
      setMonth(m);
      setDay(d);
      System.out.println("Date object constructor for date: " + this);
    }
    else {
      System.out.println("Invalid date!");
    }
  }

  /*
    It shall verify that the given year is between 1 and 9999.
  */
  public void setYear(int y) {
    if (1 <= y && y <= 9999)
      year = y;
  }

  /*
    It shall verify that the given month is between 1 and 12.
  */
  public void setMonth(int m) {
    if (1 <= m && m <= 12)
      month = m;
  }

  /*
    It shall verify that the given day is between 1 and dayMax.
  */
  public void setDay(int d) {
    if (d < 1) 
      return;

    boolean isLeap = MyDate.isLeapYear(year);
    if (month == 2 && isLeap) {
      if (d <= 29) {
        day = d;
      }
    }
    else {
      if (d <= daysInMonths[month]) {
        day = d;
      }
    }
  }

  public int getYear() { return year; }

  public int getMonth() { return month; }

  public int getDay() { return day; }

  /*
    Returns a date string in the format "xxxxday d mmm yyyy"
    e.g., "Tuesday 14 Feb 2012".
  */
  public String toString() {
    String date;
    date = strDays[MyDate.getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month] + " " + year;
    return date;
  }

  /*
    Update this instance to the next day and return this instance.
  */
  public MyDate nextDay() {
    if (month == 2) {
      if (isLeapYear(year)) {
        if (day == 29) {
          day = 1;
          month++;
        }
        else {
          day++;
        }
      }
      else {
        if (day == 28) {
          day = 1;
          month++;
        }
        else {
          day++;
        }
      }
    }
    else {
      if (day == daysInMonths[month]) {
        day = 1;
        month++;
      }
      else {
        day++;
      }
    }
    
    if (month == 13) {
      month = 1;
      year++;
    }
    return this;
  }

  /*
    Update this instance to the next month and return this instance.
  */
  public MyDate nextMonth() {
    if (month == 12) {
      month = 1;
      year++;
    }
    else {
      month++;
    }

    if (month == 1 && isLeapYear(year)) {
      if (day >= 29) {
        day = 29;
      }
    }
    else if (day > daysInMonths[month]) {
      day = daysInMonths[month];
    }
    return this;
  }

  /*
    Update this instance to the next year and return this instance.
  */
  public MyDate nextYear() {
    if (isLeapYear(year) && month == 2 && day == 29) {
      day--;
    }
    year++;
    return this;
  }

  public MyDate previousDay() {
    if (month == 3 && isLeapYear(year)) {
      month = 2;
      day = 29;
    }
    else {
      if (day == 1) {
        month--;
        if (month == 0) {
          month = 12;
          year--;
        }
        day = daysInMonths[month];
      }
      else {
        day--;
      }
    }

    return this;
  }

  public MyDate previousMonth() {
    if (month == 1) {
      month = 12;
      year--;
    }
    else {
      month--;
    }

    if (month == 3 && isLeapYear(year)) {
      if (day >= 29) {
        day = 29;
      }
    }
    else if (day > daysInMonths[month]) {
      day = daysInMonths[month];
    }
    return this;
  }

  public MyDate previousYear() {
    if (isLeapYear(year) && month == 2 && day == 29) {
      day--;
    }
    year--;
    return this;
  }
}