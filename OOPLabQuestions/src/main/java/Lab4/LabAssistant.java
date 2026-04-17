
package Lab4;

class LabAssistant extends StaffMember{
    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffid, String department,int hoursWorked,double hourlyRate) {
        super(fullName, staffid, department);
        this.hoursWorked= hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateMonthlyPayment(){
       return hoursWorked*hourlyRate;
    }
    
    public void displayLabAssistantDetails() {
        displayBasicDetails();
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Hourly Rate: "+hourlyRate);
    }
     
}
/*
Because department is protected, so child classes can directly access it.
*/