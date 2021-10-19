/*
   Author: Ashley Timko
   Date: 10/12/21
   Description: Practice with Inheritance - Marketer class
*/

public class Marketer extends Employee{
   // Constructor 1
   public Marketer(int days, double salary, int vacDays) {
      super(days,salary,vacDays);
   }
   
   // Constrcutor 2
   public Marketer() {
      super();
   }
   
/*   //@override getSalary()
   public double getSalary(){
      super.salary += 10000;
      return super getSalary() + 10000;   
   }
*/
   //@override: getSalary() 
   public double getSalary()  {
      // Update salary 
      super.setSalary(super.getSalary() + 10000);
      return super.getSalary();
   }
   
   /*
   Method: Marketer can advertise
   Param: None
   Return: Void
   */
   public void advertise(){
      System.out.println("I can advertise for this law firm.");
   }
   //@verride: toString() method
   public String toString()   {
      return "Marketer:\n" + super.toString();
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