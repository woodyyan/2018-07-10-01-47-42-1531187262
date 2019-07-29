package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Comparator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max(Comparator.naturalOrder()).get();
    }

    public double getMinimum() {
        return arrayList.stream().min(Comparator.naturalOrder()).get();
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(it -> it).sum() / (double) arrayList.size();
    }

    public double getOrderedMedian() {
        if (arrayList.size() % 2 == 0) {
            return (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2.0;
        }
        return arrayList.get(arrayList.size() / 2 + 1) / 2.0;
    }

    public int getFirstEven() {
        for (Integer item : arrayList) {
            if (item % 2 == 0) {
                return item;
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        Integer result = 0;
        for (Integer item : arrayList) {
            if (item % 2 == 0) {
                result = item;
                break;
            }
        }
        return arrayList.indexOf(result);
    }

    public boolean isEqual(List<Integer> arrayList) {
        return arrayList.containsAll(this.arrayList);
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        if (arrayList.size() % 2 == 0) {
            Integer left = (Integer) singleLink.getNode(arrayList.size() / 2);
            Integer right = (Integer) singleLink.getNode(arrayList.size() / 2 + 1);
            return (left + right) / 2.0;
        }
        return ((Integer) singleLink.getNode(arrayList.size() / 2 + 1)).doubleValue();
    }

    public int getLastOdd() {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int item = arrayList.get(i);
            if (item % 2 != 0) {
                return item;
            }
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        int result = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int item = arrayList.get(i);
            if (item % 2 != 0) {
                result = item;
                break;
            }
        }
        return arrayList.indexOf(result);
    }
}
