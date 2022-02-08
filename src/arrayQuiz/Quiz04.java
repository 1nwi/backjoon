package arrayQuiz;

import java.io.*;
import java.util.HashSet;

public class Quiz04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> h = new HashSet<>();


        int a = 42;
        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % a);
        }
        bw.write(h.size() + "\n");
        bw.flush();
        bw.close();
    }
}
