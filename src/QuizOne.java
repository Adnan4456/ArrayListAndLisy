import java.util.ArrayList;
import java.util.List;


public class QuizOne {

    public static void main(String[] args) {

            ArrayList<String> blist = new ArrayList<>(List.of("A", "B", "C", "D"));  // Line 1
            String[] bArray = blist.toArray(new String[5]);   // string  size is greater then list so all
        //values are filled with null .
            ArrayList<String> clist = new ArrayList<String>(List.of(bArray));   // null values can not copies give null pointer exception .

            clist.add("E");
            System.out.println(clist);
        }
}
