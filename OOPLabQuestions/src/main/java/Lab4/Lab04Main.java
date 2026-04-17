package Lab4;

public class Lab04Main {
   public static void main(String[] args){
      Lecturer Lec = new Lecturer("Nimal silva","L001","COST",3,50000);
      
      Lec.displayLecturerDetails();
      
      System.out.println("Monthly Payment: "+Lec.calculateMonthlyPayment());
      
   } 
}
