package com.github.vasiljeu95.tmslesson4;

import java.util.Scanner;

public class TMSLesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = sc.nextInt();
//        System.out.println("Вы ввели "+a);

//        System.out.println("Введите строку");
//        String str = sc.nextLine();
//        System.out.println("Вы ввели "+str);

        System.out.println("Введите целое число");
        while (sc.hasNextInt()){
            int a=sc.nextInt();
            System.out.println("Вы ввели "+a);
            if (a == 10) {
                break;
            }
        }
    }
}
