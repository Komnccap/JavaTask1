package HomeWork1;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.io.IOException;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        // 1-Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int enter = scan.nextInt();
        int numAd = 0, numMu = 0, count = 0;
        for(int i = 0; i < enter; i++){
            count++;
            numAd += count;
            if(i == 0){
                numMu += 1;
            }
            else{
                numMu *= count;
            }
        }
        System.out.printf("Сложение чисел равно: %d \nПеремножение чисел равно: %d", numAd, numMu);
        System.out.println(" ");

        // 2-Вывести все простые числа от 1 до 1000
        System.out.println(" ");
        int nums = 100;
        System.out.printf("Простые числа в диапазоне от 1 до %d:\n", nums);
        System.out.print("2 3 5 7 ");
        for(int i = 0; i < nums; i++){
            if(i != 1 && i % 2 != 0 && i % 3 != 0  && i % 4 != 0 && i % 5 != 0 && i % 6 != 0 && i % 7 != 0 &&  i % 8 != 0){
                System.out.print(i + " ");
            }
        }System.out.println(" ");

        // 3-Реализовать простой калькулятор
        System.out.println(" ");
        System.out.print("Введите перове число ");
        int firstNum = scan.nextInt();
        System.out.print("Введите опреацию(+ - * /) ");
        char ch;
        ch = (char) System.in.read();
        System.out.print("Введите второе число ");
        int secondNum = scan.nextInt();
        if(ch == '+'){
            System.out.println(firstNum + secondNum);
        }
        else if(ch == '-'){
            System.out.println(firstNum - secondNum);
        }
        else if(ch == '*'){
            System.out.println(firstNum * secondNum);
        }
        else if(ch == '/'){
            System.out.println(firstNum / secondNum);
        }
        else{
            System.out.print("ВВЕДЕНО НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ!!!");
        }

        // 4-Задано уравнение вида q + w = e, где q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
        Random random = new Random();
        int q = random.nextInt(11, 50), w = random.nextInt(11, 50); 
        int e = q + w;
        String firstSecret = Integer.toString(q);
        String secondSecret = Integer.toString(w);
        int counter = 0;
        System.out.printf("Дано уравнение %s + %s = %d\n",firstSecret,secondSecret,e);
        while(counter == 0){
            System.out.printf("Восстановите числа ?%s + %s? = %d\n",firstSecret.substring(1),secondSecret.substring(0,1),e);
            System.out.print("Введите первое число ");
            int entSec1 = scan.nextInt();
            System.out.print("Введите воторое число ");
            int entSec2 = scan.nextInt();
                if(entSec1 == q && entSec2 == w){
                    counter++;
                    System.out.println("Верно!");
                }
                else{
                    System.out.println("\nПопробуйте ещё раз\n");
                }
        }
        scan.close();
    }
}
