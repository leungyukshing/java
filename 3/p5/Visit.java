import java.util.Date;
public class Visit {
  private Customer customer;
  private Date date;
  private double serviceExpense;
  private double productExpense;

  public Visit(String name, String type, Date date) {
    this.date = date;
    this.customer = new Customer(name, type);
  }

  public String getName() {
    return customer.getName();
  }

  public double getServiceExpense() { return serviceExpense; }

  public void setServiceExpense(double ex) {
    serviceExpense = ex;
  }

  public double getProductExpense() { return productExpense; }

  public void setProductExpense(double ex) {
    productExpense = ex;
  }

  public double getTotalExpense() {
    double total = 0;
    total = (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType())) * serviceExpense
            + (1 - DiscountRate.getProductDiscountRate(customer.getMemberType())) * productExpense;
    return total;
  }

  public String toString() {
    String str = "This is a visit by customer: " + customer.getName()
                + "\n customer information:\n"
                + customer.toString() + "\n"
                + "On " + date.toString();
    return str;
  }
}