package com.datvutech.answer.bai13;

import java.util.Scanner;

import com.datvutech.util.AppScanner;
import com.datvutech.util.NumberUtils;

public class Bai13 {

    public static int[] result = new int[100001];

    public static void resetResult() {
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
    }

    public static int makeListOfOddDivisors(int x) {
        resetResult();
        result[0] = 1;
        int cnt = 1;
        for (int i = 3; i <= x / 2; i++) {
            if (x % i == 0) {
                if (NumberUtils.isOddNumber(i)) {
                    result[cnt++] = i;
                }
            }
        }
        return cnt++;
    }

    public static void main(String[] args) {
        int n = -1;
        Scanner scanner = AppScanner.getSystemScanner();
        System.out.print("n = ");
        n = scanner.nextInt();
        int cnt = makeListOfOddDivisors(n);
        System.out.print("List of odd divisors: ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
