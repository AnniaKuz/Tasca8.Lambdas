public class Main {
    public static void main(String[] args) {
        Calculator calc = (a,b,sign)->{
            float result = 0;
           switch (sign){
               case "+":
                   result = a+b;
                   break;
               case "-":
                   result = a-b;
                   break;
               case "*":
                   result = a*b;
                   break;
               case "/":
                   result = a/b;
                   break;
                 default:
                   System.out.println("Sign is not correct");
           }

        return result;
        };


        System.out.println(calc.operation(1,2,"*"));
        System.out.println(calc.operation(1,2,"+"));
        System.out.println(calc.operation(1,2,"-"));
        System.out.println(calc.operation(1,2,"/"));
        System.out.println(calc.operation(1,2,"="));

    }
}

@FunctionalInterface
interface Calculator{
    float operation(float a,float b,String sign);
}