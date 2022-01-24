package forQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            list.add(i , A + B);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
