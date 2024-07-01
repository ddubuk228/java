import java.util.*;

public class ListEx1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("abc");

        /*for (String str : list) {
            System.out.println(str);
        }*/

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
