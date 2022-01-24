package ifQuiz;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X <= 1000 && X > 0) {
            if (Y <= 1000 && Y > 0) {
                System.out.println("1");
            } else if (Y >= -1000 && Y < 0) {
                System.out.println("4");
            }
        } else if (X >= -1000 && X < 0) {
            if (Y <= 1000 & Y > 0) {
                System.out.println("2");
            } else if (Y >= -1000 && Y < 0) {
                System.out.println("3");
            }
        }

    }
}
