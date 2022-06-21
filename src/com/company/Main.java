package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

       Random random = new Random();
       Integer[] array = new Integer[10];
       for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(20);
           System.out.print(array[i] + " ");
       }
       System.out.println("\nThe largest square: ");
       Stream.of(array).filter(x -> x % 2 == 0).map(x -> (int)Math.pow(x,2)).max(Integer::compareTo).ifPresent(System.out::print);
       System.out.println("\nThe largest square root: ");
       Stream.of(array).filter(x -> x % 2 == 0).map(x -> (int)Math.sqrt(x)).max(Integer::compareTo).ifPresent(System.out::print);

    }
}

