package com.datvutech.answer;

import java.util.Scanner;

import com.datvutech.util.AppScanner;

// 3. Nhập vào 2 số nguyên, in ra màn hình số nhỏ hơn và số lớn hơn.
public class Bai03 {

    public static int max(int a, int b) {
        
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = AppScanner.getSystemScanner();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.println("So lon hon: " + max(a, b));
    }
}
