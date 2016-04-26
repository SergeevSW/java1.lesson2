import java.util.Scanner;

/**
 * Created by serg on 23.04.16.
 */
public class MainClass {
    public static void main(String[] args) {

    // Создать массив состоящий из элементов 0 и 1, например int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0 };
    // В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)  array[i] = 0;
            else array[i] = 1;
        }
    // Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
        int[] arr8 = new int[8];
        int counter = 1;
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = counter;
            counter += 3;
        }
    // Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа которые меньше 6 умножить на 2.
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) mas[i] *= 2;
        }
    // Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        int[] mas2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int min = mas2[0];
        int max = mas2[0];
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] < min ) min = mas2[i];
            if (mas2[i] > max ) max = mas2[i];
        }
        /* Написать простой консольный калькулятор. Пользователь вводит два числа и операцию которую хочет выполнить,
                программа вычисляет результат и выводит в консоль; */

        Scanner sc = new Scanner(System.in);
        System.out.println("укажите 2 числа:");
        float x = sc.nextInt();
        float y = sc.nextInt();
        System.out.println("укажите действие");
        String znak = sc.next();
        System.out.println(znak);

        System.out.print("Результат ");
        switch (znak){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            default:
                System.out.println("невозможно посчитать, операция не распознана");
        };


    }
}
