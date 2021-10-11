package assignment;

public class CodeTwo {

    public static void main(String[] args) {
        // Code 2.
        int x = 5;
        int y = 2;
        int z = 3;

        x += 6; // LINE A
        y *= 8; // LINE B
        z += y * x; // LINE C
        z %= 7; // LINE D

        System.out.println("x = " + x );
        System.out.println("y = " + y );
        System.out.println("z = " + z );

        // Code 3.
        int a = 5;
        int b = 2;
        int c;
        int d;
        c = ++b; // LINE A
        d = a++;  // LINE B
        c++; // LINE C
        System.out.println("a = " + a + "b = " + b + " c = " + c + "d = " + d );
    }
}
