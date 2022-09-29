import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Peter", 16, "Java", 4),
                new Student("Eva", 27, "Java", 6),
                new Student("Nataly", 26, "Python", 5),
                new Student("Kevin", 23, "Java", 9),
                new Student("Anna", 17, "PHP", 4),
                new Student("Alba", 29, "Java", 6),
                new Student("George", 36, "PHP", 7),
                new Student("Chris", 17, "Java", 8),
                new Student("Kelly", 27, "Python", 8),
                new Student("Sam", 28, "Python", 3));

        System.out.println("Name and age");
        System.out.println(nameAndAge(students));

        System.out.println("---------------------------------------------------\n"
        +"Students with name A....");
        List<Student> studentsWithA = nameWithA(students);
        studentsWithA.forEach(x-> System.out.println(x));

        System.out.println("---------------------------------------------------\n"
                +"Students with score 5 or 5+");
        System.out.println(scoreFivePlus(students));

        System.out.println("---------------------------------------------------\n"
                +"Students with score 5 or 5+, excludint Strudents from PHP");
        System.out.println(scoreFivePlusandNotPHP(students));

        System.out.println("---------------------------------------------------\n"
                +"Students from Java and age 18 or 18+");
        System.out.println(javaAndMajor(students));


/*

        System.out.println(students.stream().collect(Collectors.groupingBy(x->x.getCourse())));
        System.out.println(students.stream().collect(Collectors.groupingBy(x->x.getCourse(),
        Collectors.counting())));
        System.out.println(students.stream().collect(Collectors.groupingBy(x->x.getCourse(),
        Collectors.averagingInt(x->x.getScore()))));
*/
    }

    public static Map<String,Integer> nameAndAge(List<Student> students){
        return students.stream().collect(Collectors.toMap(x->x.getName(),x->x.getAge()));
    }

    public static List<Student> nameWithA(List<Student> students){
        return students.stream().filter(x->x.getName().startsWith("A")).toList();
    }

    public static List<Student> scoreFivePlus(List<Student> students){
        return students.stream().filter(x->x.getScore()>=5).toList();
    }

    public static List<Student> scoreFivePlusandNotPHP(List<Student> students){
        return students.stream().filter(x->x.getScore()>=5&&!x.getCourse().equals("PHP")).toList();
    }

    public static List<Student> javaAndMajor(List<Student> students){
        return students.stream().filter(x->x.getCourse().equals("Java")&&x.getAge()>=18).toList();
    }

    



}


