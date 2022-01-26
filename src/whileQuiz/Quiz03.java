package whileQuiz;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz03 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        int xx = x;
        while (true) {
            x = ((x % 10) * 10) + (((x / 10) + (x % 10)) % 10);
            cnt++;

            if (x == xx) {
                break;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();

    }
}

