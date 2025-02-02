package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(it -> it * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(it -> letters[it - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(it -> {
            int index = it % 26;
            int count = it / 26;
            if (count > 0) {
                String first = letters[count - 1];
                return first + letters[index - 1];
            } else {
                return letters[it - 1];
            }
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
