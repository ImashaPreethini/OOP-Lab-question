package Lab4;

final class UniversityPolicy {
    public static final String UNIVERSITY_NAME= "Kelaniya University";
    public static final double BONUS_RATE =0.10;
    
    public static void showPolicyHeader(){
      System.out.println("---University Policy---"); 
    }
    
    public static double calculateBonus(double monthlyPayment){
        return monthlyPayment*BONUS_RATE ;
     
    } 
}
      
/*
A final class should not be inherited to prevent modification of fixed rules.
*/
