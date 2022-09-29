
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 8, 20, 15, 13, 9, 24);
        System.out.println(numbers.stream().map(x -> x % 2 == 0 ? "e" + x : "o" + x).toList());
    }
}

