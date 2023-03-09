import Lesson1.Lesson1;
import Lesson2.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
/*
        Lesson1 lesson1 = new Lesson1();

        Stream<Integer> stream = new ArrayList<>(Arrays.asList(15, 2, 3, 6, 9, 13, 30)).stream();

       lesson1.findMinMax(
                stream,
                (x, y) -> x.compareTo(y),
                (x, y) -> System.out.println(String.format("min: %s, max: %s", x, y))
        );

        stream.close();
*/


       String email = "Chicky@bombony.com";
        char check[] = email.toCharArray();
        char dot = '.';
        /*System.out.println(Arrays.asList(check).contains('@'));*/
        System.out.println(Arrays.asList(check).contains(dot));

    }


}