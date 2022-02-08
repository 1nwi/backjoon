package arrayQuiz;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int[] arr;
//        int a = Integer.parseInt(br.readLine());
//        double[] result = new double[a];
//
//        for (int i = 0; i < a; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int N = Integer.parseInt(st.nextToken());
//            arr = new int[N];
//
//            double sum = 0;
//
//            for (int j = 0; j < N; j++) {
//                arr[j] = Integer.parseInt(st.nextToken());
//                sum = arr[j];
//            }
//
//            double avg = (sum / N);
//            double cnt = 0;
//
//            for (int j = 0; j < N; j++) {
//                if(arr[j] > avg) {
//                    cnt++;
//                }
//            }
//            result[i] = (cnt / N) * 100;
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            bw.write(result[i] + "\n");
//            bw.flush();
//        }
//
//        bw.close();
        int[] arr;

        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0 ; i < testcase ; i++) {

            st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력


            int N = Integer.parseInt(st.nextToken());	//학생 수
            arr = new int[N];

            double sum = 0;	// 성적 누적 합 변수

            // 성적 입력부분
            for(int j = 0 ; j < N ; j++) {
                int val = Integer.parseInt(st.nextToken());	// 성적 저장
                arr[j] = val;
                sum += val;	// 성적 누적 합
            }

            double mean = (sum / N) ;
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/N)*100);


        }

    }
}
