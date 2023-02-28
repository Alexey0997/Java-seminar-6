import java.util.*;

/*
1.	Создайте HashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. Распечатайте содержимое множества.
2.	Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. Распечатайте содержимое множества.
3.	Создайте TreeSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. Распечатайте содержимое множества.
 */
public class Sem_6_Task1 {
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.printf("\nКоллекция HashSet:       %s", set1);
        System.out.printf("\nКоллекция LinkedHashSet: %s", set2);
        System.out.printf("\nКоллекция TreeSet:       %s", set3);
    }
}
