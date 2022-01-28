package arrayQuiz;

import java.io.*;
import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) throws IOException {
/* BufferReader 이용해서 푼 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max = 0;
        int maxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i + 1;
            }
        }


        bw.write(max +"\n" + maxIdx);
        bw.flush();
        bw.close();

 */

        //Scanner 이용
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int maxIdx = 0;
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i + 1;
            }
        }
        System.out.print(max + "\n" + maxIdx);
    }
}
