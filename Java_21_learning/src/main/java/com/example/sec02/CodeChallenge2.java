package com.example.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SequencedCollection;

public class CodeChallenge2 {
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Bread", "Milk", "Eggs", "Butter"));
        System.out.println(getFirstAndLastElements(list));
    }

    public static String getFirstAndLastElements(SequencedCollection<String> collection) {
        return collection.getFirst() + " " + collection.getLast();
    }
}
