import java.util.Date;
public class TestDemo {
  public static void main(String[] args) {
    Visit v1 = new Visit("John", "Gold", new Date());
    v1.setServiceExpense(100);
    v1.setProductExpense(200);
    System.out.println(v1);
    System.out.println("Total: $" + v1.getTotalExpense());
  }
}