package arrayQuiz;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz05 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[x];
        int max = 0;
        int total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        double avg = (double) ( total * 100 / max ) / x;

        bw.write(avg + " \n");
        bw.flush();
        bw.close();
    }
}
