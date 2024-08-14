import java.io.*;

public class Main {

    public static int N;
    public static int M;
    public static int [] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        N = Integer.parseInt(input.split(" ")[0]);
        M = Integer.parseInt(input.split(" ")[1]);

        arr = new int[M];
        solve(0);
        bw.write(sb.toString());
        bw.flush();
    }

    public static void solve(int depth) {
        if (depth == M) {
            for(int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(arr[depth] != i+' ') {
                arr[depth] = i;
            }
            solve(depth+1);
        }
    }
}