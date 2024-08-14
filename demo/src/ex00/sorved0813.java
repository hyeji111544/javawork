package ex00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class sorved0813 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // BigInteger로 초기화
        BigInteger pack = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            pack = pack.multiply(BigInteger.valueOf(i));
        }

        bw.write(pack.toString());
        bw.flush();
    }
}

