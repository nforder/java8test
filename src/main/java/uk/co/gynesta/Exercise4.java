package uk.co.gynesta;


import java.util.function.Predicate;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println("hi");

//        Predicate<Integer> votingEligibleBad = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer age) {
//                return age >= 18;
//            }
//        };

        Predicate<Integer> votingEligible = (age) -> age >= 18;

        System.out.println("Eligble to vote at 17 = " + votingEligible.test(17));
        System.out.println("Eligble to vote at 18 = " + votingEligible.test(18));
        System.out.println("Eligble to vote at 19 = " + votingEligible.test(19));

    }

}
