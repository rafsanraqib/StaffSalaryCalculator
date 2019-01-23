# StaffSalaryCalculator
Java program that prints out the name, number of hours works, and the salary of employees.

Staff.java -
The java code in this file is responsible for printing out the first name and last name of the employee. The function displayStaff() prints out the first name, last name of the employee to the console. 

StaffMonthly.java -
The code in this file prints out the first name, last name, number of hours worked, the hourly rate and the payment that should be recieved by the employee. This file inherits everything from the staff.java file. The methods setHours() and setRate() takes in one argument and sets the value of hours and rate respectively to that argument. The methods getHours(), getRate() returns the rate and the hours worked by staff or employee in question. The method getPayment calculates the payment of the employee by multiplying the number of hours worked with the rate. The DisplayStaff() prints all the information about the employee to the console. 

StaffHourly.java -
The method setSalary() sets the salary to the arguments passed onto the method. Tis file also inherits everything from the Staff.java file The method getSalary() returns the current salary of the employee in question. The DisplayStaff() has similar functionality as the other two DisplayStaff() methods. 

StaffExample.java -
This file contains the main method which is responsible for running the program. Initially an instance of the StaffHourly object is created and then the setSalary method is invoked by passing on an argument which is then set as the salary. The DisplayStaff() method is then called which prints all the information about the staff including the salary which in this case is 4000.00 since this number was passed on as the argument. 
The next step is a much shorter way of doing the same task, that is by passing on the arguments in the constructor (StaffHourly staff5  = new StaffHourly("John", "Doe", 4000.00);) instead of calling the get and set methods. Calling the DisplayStaff() method after passing the arguments in the construct will print the same thing in the console. The next two cases do the same thing but with the StaffMonthly.java file. 

Inheritance -
Since StaffHourly.java and StaffMonthly.java inherits from the staff.java file all the variables in the Staff.java file will be available to them.
