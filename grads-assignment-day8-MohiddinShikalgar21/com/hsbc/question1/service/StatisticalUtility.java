package com.hsbc.question1.service;

import exception.InvalidRangeException;

public class StatisticalUtility {
    public int getAverageValue(int data[], int min, int max) throws InvalidRangeException {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        int average = sum / data.length;
        if (average < min || average > max) {
            throw new InvalidRangeException("Average value is out of the specified range.");
        }
        return average;
    }
}

