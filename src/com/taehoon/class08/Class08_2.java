package com.taehoon.class08;

import java.util.*;
import java.util.stream.IntStream;

/**
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 *
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때,
 * 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 *
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class Class08_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    // (3 * x) + (5 * y) = N;
    // y = (N - (3 * x)) / 5
    int maxX = N / 3, maxY = N / 5;
    Map<Integer, Integer> result = new HashMap<>();
    int totalCount = 0;
    for (int i = 0; i <= maxX; i++) {
      for (int j= 0; j <= maxY; j++) {
        totalCount++;
        if ((double) j == (double) (N - (3 * i)) / 5) {
          result.put(totalCount, i+j);
        }
      }
    }
    IntStream intStream = result.entrySet().stream().mapToInt(item -> {
      return item.getValue();
    });
    int[] array = intStream.toArray();
    Arrays.sort(array);
    if (array.length < 1) {
      System.out.println(-1);
      return;
    }
    System.out.println(array[0]);
  }
}
