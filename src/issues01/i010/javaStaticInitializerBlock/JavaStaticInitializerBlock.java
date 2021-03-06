package issues01.i010.javaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static boolean flag = true;
    static Scanner scanner = new Scanner( System.in );
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();

    static {
        try {
            if (B >= -100 && H >= -100 && B <= 100 && H <= 100) {
                if (B <= 0 || H <= 0) {
                    flag = false;
                    throw new Exception( "Breadth and height must be positive" );
                }
            }
        } catch (Exception e) {
            System.out.println( e );
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print( area );
        }
    }
}


/*
https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */