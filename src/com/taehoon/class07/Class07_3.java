package com.taehoon.class07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class Class07_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    List<Integer> result = new ArrayList<>();
    for(int i=97; i< 123; i++) {
      for(int j=0; j<word.length(); j++) {
        if ((char) i == word.charAt(j)) {
          result.add(j);
          break;
        }
        if (j == word.length()-1) {
          result.add(-1);
        }
      }

    }
    for (int i : result) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
