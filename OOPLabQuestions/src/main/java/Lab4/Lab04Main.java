package Lab4;

public class Lab04Main {
   public static void main(String[] args){
       
      StaffMember.showSystemName(); 
      Lecturer Lec1 = new Lecturer("Kamal","L001","COST",3,50000);
      Lecturer Lec2 = new Lecturer("Nimal","L002","COST",2,60000);
      
      LabAssistant LabAssistant1= new LabAssistant("Lahiru","A001","COST",120,500);
      
      Lec1.displayLecturerDetails();
      System.out.println();
      Lec2.displayLecturerDetails();
      System.out.println();
      LabAssistant1.displayLabAssistantDetails();
      System.out.println();
      
      System.out.println("Total Staff created: "+StaffMember.getstaffCount());
    } 
}
