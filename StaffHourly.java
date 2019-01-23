
public class StaffHourly extends staff {
  
  public StaffHourly() {
    super();
    this.salary = 0; 
    
  }
  
  public StaffHourly(String firstName, String lastName, double salary) {
    super(firstName, lastName);
    this.salary = salary;
    
  }
  private double salary;
  
  public void setSalary(double salary) {
    this.salary = salary;
    
  }
  
  public double getSalary() {
    return this.salary;
    
  }
  public void displayStaff() {
       System.out.println("\nStaff Info: ");
       System.out.println("FIirst Name: " + getfirstName());
       System.out.println("Last Name: " + getlastName());
       System.out.println("Salary: " + this.salary);
     }
}
