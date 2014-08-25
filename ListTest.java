import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<int> bag = Arrays.asList(1, 3, 5, 2, 4);
        bag.sort();
        System.out.println(bag.get(3));
    }
}
