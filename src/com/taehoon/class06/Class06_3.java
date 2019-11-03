package com.taehoon.class06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */

public class Class06_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer inputNum = Integer.parseInt(sc.nextLine());
    int val = 1;
    int hansuCount = 0;
    while(val <= inputNum) {
      List<Integer> digits = returnNums(val);
      if (isHansu(digits)) {
        hansuCount++;
      }
      val++;
    }
    System.out.println(hansuCount);
  }
  // 자리수 리스트 리턴
  public static List<Integer> returnNums (Integer val) {
    List<Integer> digits = new ArrayList<>();
    while (val > 0) {
      Integer temp = val % 10;
      digits.add(temp);
      val /= 10;
    }
    return digits;
  }
  // 각 자리수 등차수열인지 확인여부
  public static boolean isHansu (List<Integer> returnNums) {
    if (returnNums.size() < 2) {
      return true;
    }
    int diff = returnNums.get(1) - returnNums.get(0);
    for (int i = 1; i < returnNums.size(); i++) {
      if (diff != returnNums.get(i) - returnNums.get(i-1)) {
        return false;
      }
    }
    return true;
  }

}
