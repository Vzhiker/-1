import java.util.Comparator;

public class App {
public static void main(String[] args) {
        ArrayList_Egor<String> list = new ArrayList_Egor<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Pineapple");
        list.add("Lemon");
        list.add("Waterlemon");

        Comparator <String> byLength = (s1, s2) -> s2.length() - s1.length();
        Comparator <String> naturalComp = Comparator.naturalOrder();
        Comparator <String> comparator = byLength.thenComparing(naturalComp);
        list.quickSort(comparator);
        printList(list);
        list.quickSort(comparator);
        
        
    }

    // Утилитарный метод для вывода списка
    private static void printList(ArrayList_Egor<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
