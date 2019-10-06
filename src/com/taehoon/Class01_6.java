package com.taehoon;

import java.util.Scanner;

public class Class01_6 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] strArray = inputLine.split(" ");
        int sum = 0;
        for(int i=0; i < strArray.length; i++) {
            sum += Integer.parseInt(strArray[i]);
        }
        System.out.println(sum);
    }
}

