package study;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2018/4/27.
 */
public class SortTest {
    static String[] players = {"Rafael Nadal", "Novak Djokovic","Stanislas Wawrinka", "David Ferrer","Roger Federer", "Andy Murray",
            "Tomas Berdych", "Juan Martin Del Potro","Richard Gasquet", "John Isner"};

    public static void main(String args[]) {
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
        Arrays.asList(players).stream().forEach(x -> System.out.println(x));

        Arrays.sort(players, (s1, s2) -> (s2.compareTo(s1)));
        Arrays.asList(players).forEach(System.out::println);

        Arrays.sort(players, String::compareToIgnoreCase);

        Arrays.asList( "a", "b", "d" ).forEach(System.out::println);
        System.out.println("\n\n"+Arrays.asList(players).stream().filter((p) -> p.equals("Richard Gasquet")).findFirst().get());
//        Arrays.asList(players).stream().

        for (String s : Arrays.asList("a", "b", "d")) {
            System.out.println(s);
        }
    }

}
