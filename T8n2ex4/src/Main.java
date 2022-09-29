import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"samsung", "0", "nokia", "bread", "milk", "17e", "kefir", "20", "5"});

        //Sorted alphabetically
        System.out.println(words.stream().sorted(Comparator.comparing(x -> x.charAt(0))).toList());

        //First String that contain "e", then the rest ofStrings
        Comparator<String> comparator = (String s1, String s2) -> {
            if (!s1.contains("e") && s2.contains("e")) {
                return 1;
            } else if (s1.contains("e") && !s2.contains("e")) {
                return -1;
            }
            return s1.compareTo(s2);
        };
        words.sort(comparator);
        System.out.println(words);

        //"A/a" replaced for "4"
        System.out.println(words.stream().map(x->x.replaceAll("A|a","4")).toList());

        //Only numeric String
        System.out.println(words.stream().filter(x->x.matches("[0-9]*")).toList());

    }
}