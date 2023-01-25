import java.util.ArrayList;
import java.util.Scanner;

/*
Задание 2

Используя коллекцию удвойте слово:

1.       Введите с клавиатуры 5 слов в список строк.

2.       Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.

3.       Используя цикл for выведите результат на экран, каждое значение с новой строки.
 */

public class HW_2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку номер "+(i+1));
            list.add(sc.nextLine());
        }
        doubleValues(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void doubleValues(ArrayList list){
        for (int i = 0; i < list.size(); i+=2) {
            list.add(i,list.get(i));
        }
    }
}
