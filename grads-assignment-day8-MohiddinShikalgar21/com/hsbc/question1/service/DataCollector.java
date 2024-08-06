package com.hsbc.question1.service;

import exception.InvalidInputException;
import exception.InvalidRangeException;

public class DataCollector {
    private StatisticalUtility utility;

    public DataCollector() {
        this.utility = new StatisticalUtility();
    }

    public int getResult(int data[], int min, int max, int v1, int v2) throws InvalidInputException {
        try {
            int average = utility.getAverageValue(data, min, max);
            return (average * v1) / v2;
        } catch (InvalidRangeException e) {
            throw new InvalidInputException("Invalid input range provided.", e);
        }
    }
}

