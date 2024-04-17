import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for (String color : colors) {
            list.add(color); // Add color to the end of the list
        }

        // Add elements to the removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String color : removeColors) {
            removeList.add(color);
        }

        // Output the contents of list
        System.out.println("ArrayList:");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println();

        // Remove colors from the list that are contained in removeList
        removeColors(list, removeList);

        System.out.println("ArrayList after calling removeColors:");

        // Output the modified contents of list
        for (String color : list) {
            System.out.printf("%s ", color);
        }

    }
    {System.out.println();}

    // Remove colors from Collection1 that are contained in Collection2
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        // Iterate through collection1
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove(); // Remove the color
            }
        }
    }
}