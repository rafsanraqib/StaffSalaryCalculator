public class staff {
    private String firstName;
     private String lastName;
     
     public  staff() {
       this.firstName = "John";
       this.lastName = "Doe";
       
     }
     public staff(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
       
     }
     public void setfirstName(String firstName) {
       this.firstName = firstName;
       
       
     }
     public String getfirstName() {
       return this.firstName;
       
     }
     public void setlastName(String lastName) {
       this.lastName = lastName;
       
     }
     public String getlastName() {
       return this.lastName;
     }
     public void displayStaff() {
       System.out.println("Staff Info: ");
       System.out.println("FIirst Name: " + this.firstName);
       System.out.println("Last Name: " + this.lastName);
       
     }
  
}
