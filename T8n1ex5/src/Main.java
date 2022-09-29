public class Main {
    public static void main(String[] args) {
        piValue pi = () -> {
            double piNumber = 3.1415;
            return piNumber;
        };

        System.out.println(pi.getPiValue());
    }
}

@FunctionalInterface
interface piValue{
    double getPiValue();
}

