/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Legal Secretary class
*/

public class legalSecretary extends Secretary {
   //Constrcutor 1: We only want to accept salary and vacation days as parameter 
   public LegalSecretary(double salary, int vacDays) {
      super(); // Note: Superclass is Secretary & super() should match constructor in Secretary
      // Use set methods to update salary & vacDays 
      super.setSalary(salary);
      super.setVacDays(vacDays);
   }
   //@override getSalary
   public double getSalary(){
      // Update salary
      //return super getSalary() + 5000;
      super.setSalary(super.getSalary() + 5000);
      return super.getSalary();
   }
   /*
      Method: Legal Secretary can file briefs
      Parameter: String
      Return: Void
   */
   
   public void fileBriefs() {
      System.out.println("I can file legal briefs for the lawyer.");
   }
   
   //@override toString() method
   public String toString() {
      //return "Legal Secretary: \n" + super.toString();
        return "Legal " + super.toString();
   }
}

class LegalSecretaryMain {
   public static void main(String[] args){
      //Creates an instance of secretary
      //Secretary s = new Secretary(); // Default Constructor
      LegalSecretary s = new LegalSecretary(50000, 15);   // default constructor
      
      // Inherited Behavior
      System.out.println("Legal Secretary work hours: " + s.getWorkHours());
      System.out.println("Legal Secretary salary: " + s.getSalary());
      System.out.println("Legal Secretary vacation days: " + s.getVacDays());
      System.out.println("Legal Secretary nneds to fill: " + s.getForm() + " form for leave application.");
      s.takeDictation("Schedule a meeting at 10am on Tuesday.");
      
      //Unique Behavior
      s.fileBriefs();
      
      System.out.println(s);
   }
}