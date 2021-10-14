/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: An employee database for the law firm
*/

public class EmployeeDB {
   public static void main(String[] args)   {
      // Polymorphism: Create an Employee database
      Employee[] empDB = {new Secretary(40, 50000, 10), new LegalSecretary(30, 60000, 10), new Lawyer(40, 50000), new Lawyer(40, 50000), new Marketer(40, 50000, 10)};
      
      // Loop through the Employee Database and display their informatiom
      for(Employee e: empDB)  {
         System.out.println("Employee details:");
         System.out.println(e);
         System.out.println();
         
         /*A Secretary can take dictation: Compiler Error and Polymorphism 
         if(((Secretary)e) instanceof Secretary)
            e.takeDictation("This is a test string");
        */
      }
      
      // Display total employees in the law firm
      System.out.println("Total Employee count in the Law Firm: " + Employee.employeeCount());
   }
}