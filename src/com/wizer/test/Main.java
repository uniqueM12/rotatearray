package com.wizer.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(ints));

        ints = rearrange(new ArrayList<Integer>(Arrays.asList(ints)), 2);

        System.out.println(Arrays.toString(ints));
    }

    private static Integer[] rearrange(List<Integer> integers, Integer times) {

        for (int i = times; i > 0; i--){
            Integer current = integers.get(integers.size() -1);
            integers.add(0, current);
            integers.remove(integers.size() - 1);
        }
        return Arrays.copyOf(integers.toArray(), integers.toArray().length, Integer[].class);
    }
}
