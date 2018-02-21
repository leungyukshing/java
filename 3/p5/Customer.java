public class Customer {
  private String name;
  private boolean member;
  private String memberType;

  public Customer(String name, String type) {
    this.name = name;
    memberType = type;
    if (type == "None") {
      member = false;
    }
    else {
      member = true;
    }

  }

  public String getName() { return name; }

  public boolean isMember() { return member; }

  public void setMember(boolean member) {
    this.member = member;
  }

  public String getMemberType() { return memberType; }

  public void setMemberType(String type) {
    this.memberType = type;
  }

  public String toString() {
    String str = "Customer information:\n"
                + "Name: " + name
                + "\nIs member? " + member
                + "\nMemberType: " + memberType;
    return str;
  }
}