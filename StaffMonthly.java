public class StaffMonthly extends staff {
  private double hour;
  private double rate;
  
  public StaffMonthly() {
    super();
    this.hour = 0;
    this.rate = 0;
  }
  
  public StaffMonthly(String firstName, String lastName, double hour, double rate) {
    super(firstName, lastName);
    this.hour = hour;
    this.rate = rate;
  }
  
  public void setHours(double hour) {
    this.hour = hour;
    
  }
  public double getHours() {
    return this.hour;
    
  }
  public void setRate(double rate) {
    this.rate = rate;
    
  }
  public double getRate() {
    return this.rate;
  }
  public double getPayment() {
    double payment = rate * hour;
    return payment;
  }
  public void displayStaff() {
       System.out.println("Staff Info: ");
       System.out.println("FIirst Name: " + getfirstName());
       System.out.println("Last Name: " + getlastName());
       
       System.out.println("Hours Worked: " + this.hour);
       System.out.printf("Rate Worked: %.2f" , this.rate);
       System.out.printf("\nPayment: %.2f", getPayment());
  }
}
