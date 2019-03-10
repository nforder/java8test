package uk.co.gynesta;


import java.util.function.Predicate;

public class PrtedicateTest {

    public static void main(String[] args) {
        System.out.println("hi");

        Predicate<String> startsWith = new Predicate<String>() {
            public boolean test(String s) {
                return false;
            }
        };

        boolean b = startsWith.test("A");
        System.out.println("b = " + b);

    }

}
