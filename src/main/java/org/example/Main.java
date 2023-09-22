package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        scan.close();

        int L1 = A * x1 + B * y1 + C;
        int L2 = A * x2 + B * y2 + C;

        if (L1 == 0 && L2 == 0) {
            System.out.println("YES");
        }
        else if ((L1 > 0 && L2 < 0) || (L1 < 0 && L2 > 0)) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}