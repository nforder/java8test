package uk.co.gynesta;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by fordern on 10/03/2019.
 */
public class Example1 {

    public static void main(String[] args) {

        Function<String, String> checkName = (name) -> (name.length() > 5 && name.length() < 8) ? name : "Not valid name";

        System.out.println(checkName.apply("Kannan"));
        System.out.println(checkName.apply("Gnanasigamani"));

    }

}
