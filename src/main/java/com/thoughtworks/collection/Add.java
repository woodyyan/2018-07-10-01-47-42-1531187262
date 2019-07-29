package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder < rightBorder ? leftBorder : rightBorder;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder < rightBorder ? leftBorder : rightBorder;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(it -> it * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(it -> {
            if (it % 2 == 1) {
                return it * 3 + 2;
            }
            return it;
        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(it -> {
            if (it % 2 == 1) {
                return it * 3 + 5;
            }
            return 0;
        }).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(it -> it % 2 == 0).mapToDouble(it -> it).average().getAsDouble();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(it -> it % 2 == 0).mapToDouble(it -> it).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(it -> it % 2 == 0).anyMatch(it -> it.equals(specialElment));
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(it -> it % 2 == 0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        return Stream.concat(arrayList.stream().filter(it -> it % 2 == 0).sorted(), arrayList.stream().filter(it -> it % 2 == 1).sorted(Comparator.reverseOrder())).collect(Collectors.toList());
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            Integer left = arrayList.get(i);
            Integer right = arrayList.get(i + 1);
            result.add((left + right) * 3);
        }
        return result;
    }
}
