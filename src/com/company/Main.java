package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        String[] massivS = c.split(" ");
        int a = Integer.valueOf(massivS[0]);
        int b = Integer.valueOf(massivS[1]);
        int res = a*a+b*b;
        System.out.println(res);



        /*int y1 = n % 10;// цифра 1ого разряда
        int b = n/10;//48
        int y2 = b % 10;
        int y3 = b / 10;
        System.out.println(y1+y2+y3);*/

        //#1 task
        /*int n = in.nextInt();
        n = n % 10;
        System.out.println(n);*/
    }
}
