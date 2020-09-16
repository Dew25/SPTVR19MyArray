/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarray;

import java.util.Random;

/**
 *
 * @author sillamae kutsekool
 */
class App {
    public void run(){
        System.out.println("--- MyArray ---");
        System.out.println("Задание:");
        System.out.println("Создайте массив из 20 случайных четных целых чисел.");
        System.out.println("Вычислите среднее арифметическое элементов массива");
        System.out.println("без учета минимального и максимального элементов массива.");
        System.out.println("Решение:");
        Random random = new Random();
        int rnum = 0;
        int min = 100;
        int max = 0;
        int sum = 0;
        //Создаем массив целых четных чисел
        int[] numbers = new int[20];
        System.out.println("Массив целых четных чисел:");
        for (int i = 0; i < numbers.length; i++) {
        //вычисляем четное из случайных 
            while (true) {            
                rnum = random.nextInt(99-0+1)+0;
                if(rnum % 2 == 0){
                    numbers[i] = rnum;
                    break;
                }
            }
            // максимальное, минимальное число 
            // и сумма всех чисел массива
            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
            sum += numbers[i];
            //выводим очередной элемент массива в консоль
            System.out.printf("%4d",numbers[i]);
        }
        System.out.println();
        System.out.print("Среднее арифметическое");
        System.out.print(" без учета минимального (");
        System.out.print(min);System.out.println(")");
        System.out.print("и максимального (");
        System.out.print(max);
        System.out.print(") числа: ");
        System.out.printf("%.2f%n",(double)(sum-min-max)/(numbers.length - 2));
        System.out.println("--- end MyArray ---");
    }
}
