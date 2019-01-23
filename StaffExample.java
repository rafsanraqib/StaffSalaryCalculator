public class staffexample {
  public static void main(String[] args) {
    StaffHourly staff4 = new StaffHourly();
    staff4.setSalary(4000.00);
    staff4.displayStaff();
    
    StaffHourly staff5  = new StaffHourly("John", "Doe", 4000.00);
    staff5.displayStaff();
    
    StaffMonthly staff6 = new StaffMonthly();
    staff6.setfirstName("Adam");
    staff6.setlastName("K.");
    staff6.setHours(40);
    staff6.setRate(15.50);
    System.out.println("Hours Worked: " + staff6.getHours() );
    System.out.println("Rate: " + staff6.getRate());
    double paymentForStaff6 = staff6.getHours() * staff6.getRate();
    System.out.printf("Salary : $%.2f\n", paymentForStaff6);
    
    StaffMonthly staff7 = new StaffMonthly("John", "Smith", 40, 20);
    staff7.displayStaff();
  }
  
  
  
}
