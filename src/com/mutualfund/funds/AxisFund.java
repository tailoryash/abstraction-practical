package com.mutualfund.funds;

import com.mutualfund.schemes.MutualFundScheme;

public class AxisFund implements MutualFundScheme {
    public void smallCapFund() {
        System.out.println("1 - Axis Bank Mutual Fund : Small-cap fund");
        System.out.println("Expense ratio : 0.4%");
        System.out.println("Minimum amount to start invest : Rs.1000");
    }

    public void technologyFund() {
        System.out.println("2 - Axis Bank Mutual Fund : Technology fund");
        System.out.println("Expense ratio : 0.78%");
        System.out.println("Minimum amount to start invest : Rs.2000");
    }
}
