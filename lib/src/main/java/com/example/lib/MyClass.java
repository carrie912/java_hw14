package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("�п�J�T���");

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

            System.out.print("�i�H�Φ��T����");

        }

        else {

            System.out.print("����Φ��T����");

        }

    }

}
