package com.taehoon.class01;

import java.io.IOException;
import java.util.Scanner;

public class Class01_11 {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
      System.out.println(digitMultiple(1, input1, input2));
      System.out.println(digitMultiple(2, input1, input2));
      System.out.println(digitMultiple(3, input1, input2));
      System.out.println(input1*input2);
    }

  /**
   * 자리수 확인하여 곱
   * @param digit
   * @param a
   * @param b
   * @return
   */
    public static int digitMultiple(int digit, int a, int b) {
      while (digit != 1) {
        b /= 10;
        digit--;
      }
      return a * (b%10);
    }
}

