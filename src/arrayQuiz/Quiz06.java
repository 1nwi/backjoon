package arrayQuiz;

import java.io.*;

public class Quiz06 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        String[] arr = new String[x];
        int[] sum = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
            int cnt = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                    sum[i] += cnt;
                } else {
                    cnt = 0;
                }
            }
        }
        for (int j : sum) {
            bw.write(j + "\n");
            bw.flush();
        }
        bw.close();
    }
}
