/*
Задание 5
Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':

1.Создать список строк.

2.Ввести строки с клавиатуры и добавить их в список.

3.Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.

4.Вывести строки на экран, каждую с новой строки.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите строки. Что бы остановить ввод впишите слоко \"end\"");
        while(true){
            String temp = sc.nextLine();
            if (temp.equals("end")) break;
            list.add(temp);
        }
        System.out.println(list);

    }//main
}//class
