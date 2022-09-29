import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("Hello", "How's it going", "My name is Anna, nice to meet you", "Bye");
            System.out.println(sortByLenghtDESC(list));
        }

        public static List<String> sortByLenghtDESC(List<String> list){
            Collections.sort(list, (str1, str2)->Integer.compare(str2.length(), str1.length()));
            return list;
        }
    }
