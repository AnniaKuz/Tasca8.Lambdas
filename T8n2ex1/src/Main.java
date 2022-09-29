import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Gog", "Apple", "Hello", "Age", "Add","Kitchen", "Ash", "Teakettle");
        Word wordWithA3 = () ->{
            return myList.stream().filter(w -> w.length() == 3 && w.startsWith("A")).toList();
        };

        wordWithA3.myWords().forEach(w -> System.out.println(w));

    }
}

@FunctionalInterface
interface Word{
    List<String> myWords();
}