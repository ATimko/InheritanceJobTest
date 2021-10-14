/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Marketer class
*/

public class Marketer extends Employee{
   //@override getSalary()
   public double getSalary(){
      super.salary += 10000;
      return super getSalary(); //+ 10000;   
   }
   
   /*
   Method: Marketer can advertise
   Param: None
   Return: Void
   */
   public void advertise(){
      System.out.println("I can advertise for this law firm.");
   }
}
class MarketerMain{
   public static void main(String[] args){
      //Create an instance of Marketer      
      Marketer m = new Marketer(); // Default contructor
      
      //Inherited Behavior      
      System.out.println("Marketer work hours: " + m.getWorkHours());
      System.out.println("Marketer salary: " + m.getSalary());
      System.out.println("Marketer vacation days: " + m.getVacDays());
      System.out.println("Marketer nneds to fill: " + m.getForm() + " form for leave application.");
      
      //Unique Behavior
      m.advertise();
   }
}