package com.taehoon.class01;

import java.io.IOException;
import java.util.Scanner;

public class Class01_10 {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] strArray = inputLine.split(" ");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);
        int c = Integer.parseInt(strArray[2]);
        System.out.println(formula1(a,b,c));
        System.out.println(formula2(a,b,c));
        System.out.println(formula3(a,b,c));
        System.out.println(formula4(a,b,c));
    }

  /**
   * (A+B)%C
   * @param a
   * @param b
   * @param c
   */
    public static int formula1 (int a,int b,int c) {
      return (a+b)%c;
    }

  /**
   * (A%C + B%C)%C
   * @param a
   * @param b
   * @param c
   */
  public static int formula2 (int a,int b,int c) {
    return (a%c + b%c)%c;
  }

  /**
   * (A×B)%C
   * @param a
   * @param b
   * @param c
   */
  public static int formula3 (int a,int b,int c) {
    return (a*b)%c;
  }

  /**
   * (A%C × B%C)%C
   * @param a
   * @param b
   * @param c
   */
  public static int formula4 (int a,int b,int c) {
    return (a%c * b%c)%c;
  }
}

