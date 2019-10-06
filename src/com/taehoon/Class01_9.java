package com.taehoon;

import java.io.IOException;
import java.util.Scanner;

public class Class01_9 {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] strArray = inputLine.split(" ");
        System.out.println(add(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1])));
        System.out.println(sub(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1])));
        System.out.println(multiple(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1])));
        System.out.println(divide(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1])));
        System.out.println(remain(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1])));

    }

    /**
     * 합
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a+b;
    }

    /**
     * 차
     * @param a
     * @param b
     * @return
     */
    public static int sub(int a, int b) {
        return a-b;
    }

    /**
     * 곱
     * @param a
     * @param b
     * @return
     */
    public static int multiple (int a, int b) {
        return a*b;
    }

    /**
     * 나누기
     * @param a
     * @param b
     * @return
     */
    public static int divide (int a, int b) {
        return a/b;
    }

    /**
     * 나머지
     * @param a
     * @param b
     * @return
     */
    public static int remain (int a, int b) {
        return a%b;
    }
}

