import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        double pi = 3.1415;
        FunctionalInterface numberPI = new FunctionalInterface() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return null;
            }

            public double getPiValue(Double pi) {
                return 0;
            }
        };



    }
}
