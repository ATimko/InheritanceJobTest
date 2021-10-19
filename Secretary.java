/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Secretary class
*/

public class Secretary extends Employee {
   // Constrcutor: Let's say Secretary can only be created with defaul values of employee
   public Secretary() {
      super();
   }
   /*
      Method: Secretary can take dictation
      Parameter: String
      Return: void
   */
   public void takeDictation(String text) {
      System.out.println(text);
   }
   
   //@override: toString() method
   public String toString() {
      return "Secretary:\n" + super.toString();
   }
}

class SecretaryMain {
   public static void main(String[] args){
      //Creates an instance of secretary
      Secretary s = new Secretary(); // Default Constructor
      
      // Inherited Behavior
      System.out.println("Secretary work hours: " + s.getWorkHours());
      System.out.println("Secretary salary: " + s.getSalary());
      System.out.println("Secretary vacation days: " + s.getVacDays());
      System.out.println("Secretary nneds to fill: " + s.getForm() + " form for leave application.");
      
      //Unique Behavior
      s.takeDication("Schedule a meeting at 10am on Tuesday.");
   }
}