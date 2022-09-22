package com.codeninja.Solution;

import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<String> Bbmk = new java.util.ArrayList<>(List.of("Bbmk"));

        Bbmk.add("me");

        String name = Bbmk.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("B"))
                .findFirst()
                .orElse("Not found");
        System.out.println(name);


        int i = 0;
        while (i < name.length()) {
            System.out.print(name.charAt(i));
            i--;
        }
    }


}




