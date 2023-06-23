import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        list.remove(1);
        list.remove(0);
        list.remove(list.size() -1);
        System.out.println(list);
    }
}
