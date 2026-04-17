package Lab4;

public class Lab04Main {
   public static void main(String[] args){
      Lecturer Lec = new Lecturer("Nimal silva","L001","COST",3,50000);
      
      LabAssistant LabAssistant1= new LabAssistant("Lahiru","A001","COST",120,500);
      UniversityPolicy.showPolicyHeader();
      System.out.println(UniversityPolicy.UNIVERSITY_NAME);
      System.out.println("Bonus of Lecture:"+UniversityPolicy.calculateBonus(Lec.calculateMonthlyPayment()));
      System.out.println("Bonus of Lab Assistant:"+UniversityPolicy.calculateBonus(LabAssistant1.calculateMonthlyPayment()));
    } 
}
