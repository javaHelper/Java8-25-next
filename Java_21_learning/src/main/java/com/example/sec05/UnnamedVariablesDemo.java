package com.example.sec05;

import java.util.List;

public class UnnamedVariablesDemo {
    public static void main(String[] args) {
        List<String> items = List.of("1", "2", "3");
        var basketTotal = 0;
        for (String _ : items) {
            basketTotal++;
        }
        System.out.println(STR."Basket Total : \{basketTotal}");

        String lastItem = items.getLast();
        try {
            int i = Integer.parseInt(lastItem);
            System.out.println(STR."Last Item: \{i}");
        } catch (NumberFormatException e) {
            System.out.println(STR."Bad Number: \{lastItem}");
        }
    }
}
