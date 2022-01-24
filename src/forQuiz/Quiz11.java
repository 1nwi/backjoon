package forQuiz;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());



        int X = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < X; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (min > number) {
                bw.write(number + " ");

            }

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
