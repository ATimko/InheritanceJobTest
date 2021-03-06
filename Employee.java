/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Law Firm Employee
*/

public class Employee {
   //Instance Fields: Encapulation
   private int workHours = 40;
   private double salary = 50000;
   private int vacDays = 10;
   private String form = "yellow";
   private static int empCount = 0;     //Static field part of class not object
   
   //Constructor 1
   public Employee(int hours, double salary, int days) {
      this.workHours = hours;
      this.salary = salary;
      this.vacDays = days;
      empCount++;
   }
   //Constructor 2
   public Employee(){
      this(40,50000, 10);
   }
   //Instance Methods
   /*
      Method: Return number of work hours
      Param: None
      Return: int
   */
   public int getWorkHours(){
      return this.workHours;
   }
   //Instance Methods
   /*
      Method: Return employee salvary
      Param: None
      Return: double
   */
   public int getSalary(){
      return this.salary;
   }
   /*
      Method: Update salary for leave application 
      Param: double
      Return: void
   */
   public void setSalary(double salary)   {
      this.salary = salary;
   }
   //Instance Methods
   /*
      Method: Return number of vacation days
      Param: None
      Return: int
   */
   public int getVacDays(){
      return this.vacDays;
   }
  /*
     Method: Update vacation days for leave application 
     Param: int
     Return: void
  */
   public void setVacDays(int days) {
      this.vacDays = days;
   }
   //Instance Methods
   /*
      Method: Return form for leave application
      Param: None
      Return: String
   */
   public int getForm(){
      return this.form;
   }
   /*
      Method: Update form for leave application 
      Param: String
      Return: void
   */
   public void setForm(String form) {
      this.form = form;
   }
   //@override toString() method
   public String toString() {
      return "Work Hours: " + this.workHours + "\nSalary: " + this.salary + "\nVacation Days: " + this.vacDays;
   }
   /*
      Method: Return Employee Count
      Parameter: None
      Return: Static int
   */
   public static int employeeCount(){
      return empCount;
   }
}

class EmployeeMain{
   public static void main(String[] args){
      //Create an instance of Employee
      Employee e = new Employee(); // Default Java contructor
      
      // Test behavior of the Employee
      System.out.println("Employee work hours: " + e.getWorkHours());
      System.out.println("Employee salary: " + e.getSalary());
      System.out.println("Employee vacation days: " + e.getVacDays());
      System.out.println("Employee nneds to fill: " + e.getForm() + " form for leave application.");
   }
}