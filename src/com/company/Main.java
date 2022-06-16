package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*
        Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
         */
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(50));
        }
        arrayList.stream().filter(x->x%2==0).map(x->x*x).max(Integer::compare).ifPresent(System.out::println);
        
        System.out.println("*******");

        Integer[] arr = {2,3,4,5,6,7,8,9,10};
        Stream.of(arr).filter(x->x%2==0).map(x->x*x).max(Integer::compare).ifPresent(System.out::println);
    }
}
