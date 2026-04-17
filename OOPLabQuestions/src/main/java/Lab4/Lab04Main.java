package Lab4;

public class Lab04Main {
   public static void main(String[] args){
      Lecturer Lec = new Lecturer("Nimal silva","L001","COST",3,50000);
      
      LabAssistant LabAssistant1= new LabAssistant("Lahiru","A001","COST",120,500);
      Lec.displayLecturerDetails();
      
      System.out.println("Monthly Payment: "+Lec.calculateMonthlyPayment());
      System.out.println();
      
      LabAssistant1.displayLabAssistantDetails();
      System.out.println("Monthly Payment: "+LabAssistant1.calculateMonthlyPayment());
       
   } 
}
