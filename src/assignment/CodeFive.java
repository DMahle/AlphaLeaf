package assignment;

public class CodeFive {

    public static void main(String[] args) {
        // Code 5.
        int marks = 50;
        int bonus = marks > 60 ? 5 : 2;
        int total_marks = marks + bonus;
        char grade = total_marks > 75 ? 'A' : 'B';

        System.out.println("Marks = " + marks);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Marks " + total_marks);
        System.out.println("Grade = " + grade);
    }
}
