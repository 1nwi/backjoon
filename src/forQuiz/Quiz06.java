package forQuiz;
import java.util.*;
import java.io.*;

public class Quiz06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());
        for (int i = T; i > 0; i--) {

            bw.write(i + "\n");
        }
        bw.close();
    }
}
