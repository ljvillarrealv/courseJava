package org.lvillareal.java8.models;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num>10;
        boolean r = test.test(7);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = (a,b) -> a.equals(b);
        System.out.println(t3.test("andres","andres"));

        BiPredicate<Integer, Integer> t4 = (x,y) -> x>y;
        boolean r2 = t4.test(5, 2);
        System.out.println(r2);
    }

}
