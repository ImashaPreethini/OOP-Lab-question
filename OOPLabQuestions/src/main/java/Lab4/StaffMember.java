package Lab4;
    
public abstract class StaffMember {
    
    private String fullName; 
    private final String staffid; 
    protected String department; 

   
    public StaffMember(String fullName, String staffid, String department) {
        this.fullName = fullName;
        this.staffid = staffid;
        this.department = department;
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
}  

