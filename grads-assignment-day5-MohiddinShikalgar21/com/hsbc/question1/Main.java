package com.hsbc.question1;

import com.hsbc.question1.view.CustomerView;

public class Main {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();

        customerView.addPizzaDetailsAndStore();
        customerView.displayPizzaDetailsByName();
        customerView.printPizzaNamesBySize();
    }
}
