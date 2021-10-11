package assignment;

public class CodeOne {

    public static void main(String[] args) {
        // Code 1.
        byte b = 50;
        short s = 4125;
        int i = 800000;
        long l = 107343L;

        s = b;    // LINE A
        i = s;    // LINE B
        l = i;    // LINE C

        float f = 25.0f;
        double d = 327.98;

        f = i;
        d = f;

        System.out.println("b = " + b );
        System.out.println("s = " + s );
        System.out.println("i = " + i );
        System.out.println("l = " + d );
        System.out.println("f = " + f );

    }
}
