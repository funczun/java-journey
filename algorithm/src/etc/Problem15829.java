package etc;// https://www.acmicpc.net/problem/15829

import java.io.*;
import java.math.BigInteger;

public class Problem15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine()); // 문자열 길이
        String w = br.readLine(); // 문자열

        BigInteger r = new BigInteger("31"); // r 고정
        BigInteger sum = BigInteger.ZERO; // sum 초기화

        for (int i = 0; i < l; i++) {
            sum = sum.add(r.pow(i).multiply(BigInteger.valueOf((int) w.charAt(i) - 96)));
        }
        System.out.println(sum.mod(BigInteger.valueOf(1234567891)));
    }
}
