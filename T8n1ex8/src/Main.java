public class Main {
    public static void main(String[] args) {
        Method myText = (str) -> {
            String newStr = "";
                newStr += new StringBuilder(str).reverse();
            return newStr;
        };

        String str = "Hello, how is it going?";
        System.out.println(myText.reverse(str));
    }
    }

@FunctionalInterface
interface Method{
String reverse(String str);
}

