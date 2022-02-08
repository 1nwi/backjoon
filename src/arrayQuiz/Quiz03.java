package arrayQuiz;

import java.io.*;

public class Quiz03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];
        int[] arr2 = new int[10];
        int total = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total *= arr[i];
        }
        bw.write(total + "\n");


        while (total != 0) {
            arr2[total % 10]++;
            total /= 10;
        }

        for (int i = 0; i < arr2.length; i++) {
            bw.write(arr2[i] + "\n");
            bw.flush();
        }

        bw.close();

    }
}
