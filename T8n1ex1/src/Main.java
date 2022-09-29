import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Berries", "Orange", "Banana", "Tomato", "Onion");

        List<String> wordsWithO = searchForLetter(list);

        wordsWithO.forEach(word -> System.out.println(word));

    }

    public static List<String> searchForLetter(List<String> list){
        String letter = "o";
        return list.stream().filter(word->word.toLowerCase().contains(letter)).toList();
    }

}