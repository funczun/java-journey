// https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        printAverage(arr);
        printMedian(arr);
        printMode(arr);
        printRange(arr);
    }

    static void printAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(Math.round((float) sum / arr.length));
    }

    static void printMedian(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);
    }

    static void printMode(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            // num = key, map.getOrDefault(i, 0) + 1 = value
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); // (값, 빈도)
        }
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        freqList.sort((e1, e2) -> {
            // 빈도 내림차순
            int valueCompare = Integer.compare(e2.getValue(), e1.getValue());
            if (valueCompare != 0) {
                return valueCompare;
            }
            // 빈도 같은 경우, 값 오름차순
            return Integer.compare(e1.getKey(), e2.getKey());
        });
        // 최빈값 출력
        if (freqList.size() > 1 && freqList.get(0).getValue().equals(freqList.get(1).getValue())) {
            System.out.println(freqList.get(1).getKey());
        } else {
            System.out.println(freqList.get(0).getKey());
        }
    }

    static void printRange(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] - arr[0]);
    }
}
