/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Secretary class
*/

public class Secretary extends Employee {
   /*
      Method: Secretary can take dictation
      Parameter: String
      Return: Void
   */
   
   public void takeDication(String text) {
      System.out.println(text);
   }
}

class SecretaryMain {
   public static void main(String[] args){
      //Creates an instance of secretary
      Secretary s = new Secretary(); // Deault Constructor
      
      // Inherited Behavior
      System.out.println("Secretary work hours: " + e.getWorkHours());
      System.out.println("Secretary salary: " + e.getSalary());
      System.out.println("Secretary vacation days: " + e.getVacDays());
      System.out.println("Secretary nneds to fill: " + e.getForm() + " form for leave application.");
      
      //Unique Behavior
      s.takeDication("Schedule a meeting at 10am on Tuesday.");
   }
}