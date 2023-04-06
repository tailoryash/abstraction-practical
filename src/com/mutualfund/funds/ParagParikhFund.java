package com.mutualfund.funds;

import com.mutualfund.schemes.MutualFundScheme;

public class ParagParikhFund implements MutualFundScheme {

    public void smallCapFund() {
        System.out.println("1 - Parag parikh Mutual Fund : Small-cap fund");
        System.out.println("Expense ratio : 0.8%");
        System.out.println("Minimum amount to start invest : Rs.500");
    }


    public void technologyFund() {
        System.out.println("2 - Parag Parikh Mutual Fund : Technology fund");
        System.out.println("Expense ratio : 1.1%");
        System.out.println("Minimum amount to start invest : Rs.2000");
    }
}
