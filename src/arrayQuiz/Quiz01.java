package arrayQuiz;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz01 {
    /* Scanner를 이용한 방법
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[x - 1]);
    }
    */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[x];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[x - 1]);
        bw.flush();
        bw.close();


    }



}
