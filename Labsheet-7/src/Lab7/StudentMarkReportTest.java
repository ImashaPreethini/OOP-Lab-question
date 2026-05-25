/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author imash
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {

        String[] marks = {"78","82","absent","90"};

        StudentMarkReport report = new StudentMarkReport(marks);

        // getMarkAt(6) causes an exception because index 6 does not exist in the array
        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark: "+ mark);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");

        } finally {
            System.out.println("Array access checking completed.\n");
        }

         // getMarkAt(2) causes an exception because "absent" cannot be converted into an integer
        try {
            int mark = report.getMarkAt(2);
            System.out.println("Mark: " + mark);

        } catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");

        } finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
    
}
