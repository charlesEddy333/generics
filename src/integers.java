import java.util.List;
import java.util.ArrayList;

public class integers {
    public static void main(String[] args) {
        int[] numbers = {6, 24, 34, 18, 14, 58, 6, 5, 34, 12, 14, 58, 56, 24, 22};
        List<Integer> list = new ArrayList<Integer>();

        for (int number : numbers) {
            if (!list.contains(number)) {
                list.add(number); 
            }
        }

        displayList(list);
    }

    private static void displayList(List<Integer> list) {
        System.out.println("ArrayList:");
        for (int number : list) {
            System.out.printf("%d ", number);
        }
    }
}