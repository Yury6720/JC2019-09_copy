package ilyaSakalouski;

import java.util.Scanner;

public class lesson_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ЧИСЛО");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i +"\t");
            }
        }
    }
}
