package oose.dea;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(8);
        grades.add(3);
        grades.add(2);
        grades.add(5);
        grades.stream().forEach(grade -> System.out.println(grade));
        System.out.println("------------");
        grades = grades.stream()
                .map((grade) -> {
                    if(grade<10)
                        return grade + 1;
                    else
                        return grade;
                })
                .filter(grade -> grade <= 10)
                .collect(Collectors.toList());

        for (int grade:grades) {
            System.out.println(grade);

        }
        System.out.println("-------");
        int sum = grades.stream().reduce(0,(result, grade) -> grade + result);
        System.out.println(sum);

        System.out.println("-------");
        OptionalDouble average = grades.stream().mapToInt(x->x).average();
        if(average.isPresent())
            System.out.println(average.getAsDouble());

    }
}
