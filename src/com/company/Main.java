package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int size = inp.nextInt();
        int [] mas = new int [size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++){
            mas[i] = inp.nextInt();
        }
        System.out.println("Ответ: " + Solution(mas));
    }

    static int count(int[]mas){
        int max = 0, str = 0, num = 0;
        for(int i = 0; i < mas.length; i++){
            num = mas[i];
            str = 0;
            for(int j = 0; j < mas.length; j++){
                if (num == mas[j]) str++;
            }
            if (str > max) max = str;
        }
        return max;
    }
}
