package uk.co.gynesta;


import java.util.function.Predicate;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("hi");

        Predicate<Integer> votingEligible = new Predicate<Integer>() {
            @Override
            public boolean test(Integer age) {
                return age >= 18;
            }
        };

        System.out.println("Eligble to vote at 17 = " + votingEligible.test(17));
        System.out.println("Eligble to vote at 18 = " + votingEligible.test(18));
        System.out.println("Eligble to vote at 19 = " + votingEligible.test(19));

    }

}
