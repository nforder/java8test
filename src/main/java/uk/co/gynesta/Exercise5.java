package uk.co.gynesta;


import java.util.function.Predicate;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("hi");

        Predicate<String> validName1 = name1 -> name1.length() >= 10;

        System.out.println(validName1.negate().test("Kannan") ? "Valid name " : "Sorry name is too long ");
        System.out.println(validName1.negate().test("Gnanasigamani") ? "Valid name " : "Sorry name is too long ");

    }
}
