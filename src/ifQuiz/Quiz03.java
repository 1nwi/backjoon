package ifQuiz;

import java.util.Scanner;

public class Quiz03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if(A >= 1 && A < 4000) {
            if ((A % 4 == 0 && A % 100 != 0 ) || A % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}