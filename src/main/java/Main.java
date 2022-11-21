import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Задание №1
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (s.nextInt() > 7) {
            System.out.println("Привет");
        }



        //Задание №2
       /* Scanner sс = new Scanner(System.in);
        System.out.println("Введите имя: ");
        if(Objects.equals(sс.nextLine(), "Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }*/


        //Задание №3
        int[] a = new int[50];
        for(int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            if (a[i] % 3 == 0){
                System.out.print(a[i]);
            }
        }


        //Задание №4
        /*
        Дана скобочная последовательность: [((())()(())]]
        Она неверная, вот правильная скобочная последовательность [[((()))()(())]]
         */
    }


}
