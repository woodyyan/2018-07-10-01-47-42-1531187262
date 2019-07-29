package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        int divide = random.nextInt(3);
        List<Integer> result = new ArrayList<>();
        addNumber(number, divide, result);
        return result;
    }

    private void addNumber(int next, int divide, List<Integer> list) {
        int result = next - divide;
        if (result > 0) {
            list.add(result);
            addNumber(result, divide, list);
        }
    }
}
