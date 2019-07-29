package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        } else {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        if (array.length > 0) {
            return array[array.length - 1];
        }
        return 0;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for (int first : firstArray) {
            for (int second : secondArray) {
                if (first == second) {
                    result.add(first);
                }
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>(Arrays.asList(firstArray));
        List<Integer> list = Arrays.stream(secondArray).filter(it -> !result.contains(it)).collect(Collectors.toList());
        result.addAll(list);
        return result;
    }
}
