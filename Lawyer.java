/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Lawyer class
*/

public class Lawyer extends Employee {
   //@override: getVacDays()
   public int getVacDays(){
      return super getVacDays() + 5;
   }
   //@override: getForm()
   public int getForm(){
      return "pink";
   }
   /*
   Method: A lawyer can sue
   Param: None
   Return: void
   */
   public void sue(){
      System.out.println("see you in court !");
   }
}
class LawyerMain{
   public static void main(String[] args){
      //Create an instance of Lawyer
      Lawyer 1 = new Lawyer(); // Default contructor
      
      //Inherited Behavior      
      System.out.println("Lawyer work hours: " + 1.getWorkHours());
      System.out.println("Lawyer salary: " + 1.getSalary());
      System.out.println("Lawyer vacation days: " + 1.getVacDays());
      System.out.println("Lawyer nneds to fill: " + 1.getForm() + " form for leave application.");
      
      //Unique Behavior
      l.sue();
   }
}