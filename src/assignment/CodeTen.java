package assignment;

public class CodeTen {

    public static void main(String[] args) {
        int marks = 65;
        if(marks > 75 ){      // Condition A
            System.out.println("Distinction"); // LINE A

        }
        else if(marks > 60) {      // Condition B

            System.out.println("First Class");  // LINE B
        }
        else if(marks > 50) {      // Condition

            System.out.println("Second Class");  // LINE C

        }
        else {
            System.out.println("Fail");   // LINE D
        }

    }
}
