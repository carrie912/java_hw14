package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入三邊長");

        int a,b,c,d;

        a = scanner.nextInt();

        b = scanner.nextInt();

        c = scanner.nextInt();

        for(int i = 0;i<2;i++){

            if(a>b){

                d=a;

                a=b;

                b=d;

            }

            if (b>c){

                d=b;

                b=c;

                c=d;

            }

        }

        if((a+b)>c){

            System.out.print("可以形成三角形");

        }

        else {

            System.out.print("不能形成三角形");

        }

    }

}
