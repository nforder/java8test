package uk.co.gynesta;

import java.util.function.IntFunction;

/**
 * Created by fordern on 10/03/2019.
 */
public class Example2 {

    public static void main(String[] args) {

        int[] values = {2,3,4};

        IntFunction getCubed = (value) -> Math.round(Math.pow(value, 3));

        for (int value : values) {
            System.out.println(value + " cubed is " + getCubed.apply(value));
        }

    }

}
