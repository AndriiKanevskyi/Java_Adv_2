import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
/*
Задание 3

Минимальное из N чисел(использовать LinkedList):

1.       Ввести с клавиатуры число N.

2.       Считать N целых чисел и заполнить ими список - метод getIntegerList.

3.       Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class HW_3 {
    public static LinkedList<Integer> getIntegerList (int n){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("введите целоє число");
        linkedList.add(scanner.nextInt());
        }
        return linkedList;
    }//getIntegerList

    public static int getMinimum (LinkedList list){
        Collections.sort(list);
        return (int) list.peekFirst();
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N");
        int n = scanner.nextInt();

        System.out.println("минимальное число из введеных : "+ getMinimum(getIntegerList(n)));

    }//main
}//class
