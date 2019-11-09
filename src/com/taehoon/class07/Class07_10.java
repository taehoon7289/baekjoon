package com.taehoon.class07;

import java.util.Scanner;

/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Class07_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] caseString = new String[N];
    for (int i=0; i<N; i++) {
      caseString[i] = sc.nextLine();
    }
    for (int i=0; i<caseString.length; i++) {
      int[] alpabetCount = new int[26];
      for (int j=0; j<caseString[i].length(); j++) {
        if (j > 0) {
          if (caseString[i].charAt(j-1) != caseString[i].charAt(j) && alpabetCount[(int)caseString[i].charAt(j)-97] > 0) {
            N--;
            break;
          }
        }
        alpabetCount[(int)caseString[i].charAt(j)-97]++;
      }
    }
    System.out.println(N);
  }
}
