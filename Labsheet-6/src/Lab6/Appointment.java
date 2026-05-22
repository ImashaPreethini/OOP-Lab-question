/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author imash
 */
public class Appointment {
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;
    
    public Appointment(String patientName,String appointmentType,String patientCategory,double baseFee){
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }
    
    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }
    
    public double calculateFinalFee(){
        double finalFee = baseFee;
        
        if (appointmentType.equals("Specialist")) {
            finalFee = finalFee + 1500;
        }
        else if (appointmentType.equals("Online")) {
            finalFee = finalFee - 500;
        }
           
        
        if (patientCategory.equals("Child")) {
            finalFee = finalFee - 300;
        }
        else if (patientCategory.equals("Senior")) {
            finalFee = finalFee - 500;
        }

        return finalFee;
        }
    
     public String getAppointmentMessage() {

        if(appointmentType.equals("General")) {
            return "General appointment selected";
        }
        else if (appointmentType.equals("Specialist")) {
            return "Specialist appointment selected";
        }
        else {
            return "Online appointment selected";
        }
     }
    
}
