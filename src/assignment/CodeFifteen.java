package assignment;

public class CodeFifteen {

    public static void main(String[] args) {
        int index = 0;
        // Use post increment in while-loop expression
        while(index++ < 10) {

            // Continue if even number
            if((index % 2) == 0) {
                continue;
            }
            System.out.println("Element:" + index);

        }
    }
}
