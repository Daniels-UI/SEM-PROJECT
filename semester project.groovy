import java.time.LocalDate;

class Student {
    String name;
    String id;
    int[] scores = new int[5];
    double average;
    char grade;
    String recommendation;

    void calculateGrade() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        average = total / 5.0;

        if (average >= 70) {
            grade = 'A';
            recommendation = "Excellent";
        } else if (average >= 60) {
            grade = 'B';
            recommendation = "Very Good";
        } else if (average >= 50) {
            grade = 'C';
            recommendation = "Good";
        } else if (average >= 40) {
            grade = 'D';
            recommendation = "Fair";
        } else {
            grade = 'F';
            recommendation = "Fail";
        }
    }

    void displayReportCard(String[] subjects) {
        System.out.println("=========================================");
        System.out.println("Report Card - Viewed on: " + LocalDate.now());
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + id);
        System.out.println("Subjects and Scores:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("  " + subjects[i] + ": " + scores[i]);
        }
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("=========================================\n");
    }
}

public class UniversityExamination {
    public static void main(String[] args) {
        int numberOfStudents = 10;
        String[] subjects = {"Calculus", "French", "Software Engineering", "Economics", "Accounting"};

        Student[] students = new Student[numberOfStudents];

        // Sample data for 10 students
        String[] names = {
            "Jacob James", "Alicia Keys", "Bob Marley", "Lebron James", "Michael Jordan",
            "Hendricks Future", "Rico Lewis", "Diego Maradona", "Lionel Ronaldo", "Daniel Muchiri"
        };
        String[] ids = {
            "SU01", "SU02", "SU03", "SU04", "SU05",
            "SU06", "SU07", "SU08", "SU09", "SU10"
        };
        int[][] scoresList = {
            {85, 78, 90, 88, 84}, // Jacob James
            {65, 70, 72, 60, 68}, // Alicia Keys
            {55, 58, 62, 53, 57}, // Bob Marley
            {90, 92, 95, 88, 91}, // Lebron James
            {45, 50, 48, 52, 46}, // Michael Jordan
            {60, 65, 63, 64, 61}, // Hendricks Future
            {75, 73, 70, 76, 72}, // Rico Lewis
            {80, 82, 79, 85, 81}, // Diego Maradona
            {40, 38, 35, 42, 39}, // Lionel Ronaldo
            {68, 66, 70, 69, 67}  // Daniel Muchiri
        };

        // Populate student data
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].name = names[i];
            students[i].id = ids[i];
            students[i].scores = scoresList[i];
            students[i].calculateGrade();
        }

        // Display report cards
        for (Student student : students) {
            student.displayReportCard(subjects);
        }
    }
}
