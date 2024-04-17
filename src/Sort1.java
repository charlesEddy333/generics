
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1 {
      public static void main (String[]args){
          String [] suits={"Diamond","Spade","Clubs","Hearts"};
          List <String> list=Arrays.asList(suits);

          System.out.printf("Unsorted list of elements:%s\n", list);

          Collections.sort(list);



      }

}