package com.taehoon.class07;

import java.util.Scanner;

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
public class Class07_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine().toUpperCase();
    int[] viewCount = new int[26];
    for (int i=0; i<word.length(); i++) {
      viewCount[(int) word.charAt(i) - 65]++;
    }
    int maxViewIndex = 0;
    for (int i=1; i<viewCount.length; i++) {
      if (viewCount[maxViewIndex] < viewCount[i]) {
        maxViewIndex = i;
      }
    }
    for (int i=0; i<viewCount.length; i++) {
      if (maxViewIndex == i) {
        continue;
      }
      if (viewCount[maxViewIndex] == viewCount[i]) {
        System.out.println("?");
        return;
      }
    }
    System.out.println((char)(maxViewIndex + 65));
  }
}
