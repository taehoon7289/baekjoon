package com.taehoon.class07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고,
 * 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */
public class Class07_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNum = Integer.parseInt(sc.nextLine());
    List<String> results = new ArrayList<>();
    for(int i=0; i<caseNum; i++) {
      int R = sc.nextInt();
      String S = sc.next();
      results.add(execute(R,S));
    }
    for (String result : results) {
      System.out.println(result);
    }
  }

  private static String execute(int R, String S) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<S.length(); i++) {
      for (int j=0; j<R; j++) {
        sb.append(S.charAt(i));
      }
    }
    return sb.toString();
  }
}
