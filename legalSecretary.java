/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Legal Secretary class
*/

public class legalSecretary extends Employee {
   //@override getSalary
   public double getSalary(){
      return super getSalary() + 5000;
   }
   /*
      Method: Legal Secretary can file briefs
      Parameter: String
      Return: Void
   */
   
   public void fileBriefs(String text) {
      System.out.println("I can file legal briefs for the lawyer");
   }
}

class LegalSecretaryMain {
   public static void main(String[] args){
      //Creates an instance of secretary
      Secretary s = new Secretary(); // Deault Constructor
      
      // Inherited Behavior
      System.out.println("Legal Secretary work hours: " + s.getWorkHours());
      System.out.println("Legal Secretary salary: " + s.getSalary());
      System.out.println("Legal Secretary vacation days: " + s.getVacDays());
      System.out.println("Legal Secretary nneds to fill: " + s.getForm() + " form for leave application.");
      
      //Unique Behavior
      s.fileBriefs("Schedule a meeting at 10am on Tuesday.");
   }
}