/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Law Firm Employee
*/

public class Employee {
   //Instance Fields: Encapulation
   private int workHours = 40;
   private double salary = 40000;
   private int vacDays = 10;
   private String form = "yellow";
   
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
   //Instance Methods
   /*
      Method: Return number of vacation days
      Param: None
      Return: int
   */
   public int getVacDays(){
      return this.vacDays;
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