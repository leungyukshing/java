public class DiscountRate {
  public static final double serviceDiscountPremium = 0.2;
  public static final double serviceDiscountGold = 0.15;
  public static final double serviceDiscountSilver = 0.1;
  public static final double productDiscountPremium = 0.1;
  public static final double productDiscountGold = 0.1;
  public static final double productDiscountSilver = 0.1;
  
  public static double getServiceDiscountRate(String type) {
    if (type == "Premium")
      return serviceDiscountPremium;
    else if (type == "Gold")
      return serviceDiscountGold;
    else if (type == "Silver") 
      return serviceDiscountSilver;
    return 0;
  }

  public static double getProductDiscountRate(String type) {
    if (type == "Premium")
      return productDiscountPremium;
    else if (type == "Gold")
      return productDiscountGold;
    else if (type == "Silver") 
      return productDiscountSilver;
    return 0;
  }
}