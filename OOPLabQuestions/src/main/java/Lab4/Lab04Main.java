package Lab4;

public class Lab04Main {
   public static void main(String[] args){
       
      StaffMember.showSystemName(); 
      UniversityPolicy.showPolicyHeader();
      
      Lecturer Lec1 = new Lecturer("Kamal","L001","COST",3,50000);
      Lecturer Lec2 = new Lecturer("Nimal","L002","COST",2,60000);
      
      LabAssistant LabAssistant1= new LabAssistant("Lahiru","A001","COST",120,500);
      
      Lec1.changeDepartment("IT");
      
      double total=0;
      
      Lec1.displayLecturerDetails();
      System.out.println("Monthly Payment:" +Lec1.calculateMonthlyPayment());
      Lec1.showCommonNotice();
      total+=+Lec1.calculateMonthlyPayment();
      System.out.println();
     
      
      Lec2.displayLecturerDetails();
      System.out.println("Monthly Payment:" +Lec2.calculateMonthlyPayment());
      Lec2.showCommonNotice();
      total+=+Lec2.calculateMonthlyPayment();
      System.out.println();
      
      
      LabAssistant1.displayLabAssistantDetails();
      System.out.println("Monthly Payment:" +LabAssistant1.calculateMonthlyPayment());
      LabAssistant1.showCommonNotice();
      total+=+LabAssistant1.calculateMonthlyPayment();
      System.out.println();
      
      System.out.println("Total Monthly Payment: " + total);
      System.out.println("Total Staff created: "+StaffMember.getstaffCount());
    } 
}
