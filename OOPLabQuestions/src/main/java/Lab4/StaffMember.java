package Lab4;
    
public abstract class StaffMember {
    
    private String fullName; 
    private final String staffid; 
    protected String department; 
    
     private static int staffCount= 0;

   
    public StaffMember(String fullName, String staffid, String department) {
        this.fullName = fullName;
        this.staffid = staffid;
        this.department = department;
        
        staffCount++;
    }

   
    public String getFullName() {
        return fullName;
    }

    public String getStaffid() {
        return staffid;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Staff ID: " + staffid);
        System.out.println("Department: " + department);
    }

  
    public abstract double calculateMonthlyPayment();
    
    
    public static void showSystemName(){
        System.out.println("---Campus Staff Payment System---");
    }
    
    public static int getstaffCount(){
        return staffCount;
    }
    
    public void changeDepartment(String newDepartment){
        if (newDepartment != null && !newDepartment.isEmpty()) {
        this.department = newDepartment;
    }
    }
    public final void showCommonNotice() {
        System.out.println("Notice: Salary payments are processed at the end of each month.");
}  
}

/*
staffCount is static because it is shared among all objects of StaffMember.
*/

/*
changeDepartment() is useful because it allows safe and controlled updating of the department
*/