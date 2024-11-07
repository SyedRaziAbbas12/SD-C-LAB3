import java.util.Scanner;

class Student {
    private String name;
    private double totalMarks;
    private double obtainedMarks;

    public Student(String name, double totalMarks, double obtainedMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public double calculatePercentage() {
        return (obtainedMarks / totalMarks) * 100;
    }

    public String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public double calculateGPA() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return 4.0;
        } else if (percentage >= 80) {
            return 3.7;
        } else if (percentage >= 70) {
            return 3.0;
        } else if (percentage >= 60) {
            return 2.0;
        } else if (percentage >= 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public void displayResults() {
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Obtained Marks: %.2f%n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.printf("Grade: %s%n", determineGrade());
        System.out.printf("GPA: %.2f%n", calculateGPA());
    }
}

public class MARKSHEET_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        Student student = new Student(name, totalMarks, obtainedMarks);
        student.displayResults();

        scanner.close();
    }
}