package org.cgoro.camundaloanbroker.banks;

public enum Bank {
    BANK_RECIPIENT_UNIVERSAL(70000, 500, "Universal", 4),
    BANK_RECIPIENT_PAWNSHOP(50000, 400, "Pawnshop", 5),
    BANK_RECIPIENT_PREMIUM(900000, 600, "Premium", 3);

    Bank(int maxLoanAmount, int minCreditScore, String bankId, int baseRate) {
        this.maxLoanAmount = maxLoanAmount;
        this.minCreditScore = minCreditScore;
        this.bankId = bankId;
        this.baseRate = baseRate;
    }

    int maxLoanAmount;
    int minCreditScore;
    String bankId;
    int baseRate;
}
