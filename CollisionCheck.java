import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input: number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Array to store grade points for each subject
        double[] gradePoints = new double[numSubjects];
        
        // Input grade points for each subject
        double totalGradePoints = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade point for subject " + (i + 1) + ": ");
            gradePoints[i] = scanner.nextDouble();
            totalGradePoints += gradePoints[i];
        }
        
        // Calculate CGPA
        double cgpa = totalGradePoints / numSubjects;
        
        // Output the CGPA
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
        
        // Close the scanner
        scanner.close();
    }
}

