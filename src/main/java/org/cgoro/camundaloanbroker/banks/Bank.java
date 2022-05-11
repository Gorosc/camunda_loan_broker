package org.cgoro.camundaloanbroker.banks;

public class Bank {

    private int maxLoanAmount;
    private int minCreditScore;
    private String bankId;
    private int baseRate;

    Bank(int maxLoanAmount, int minCreditScore, String bankId, int baseRate) {
        this.maxLoanAmount = maxLoanAmount;
        this.minCreditScore = minCreditScore;
        this.bankId = bankId;
        this.baseRate = baseRate;
    }

    public int getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(int maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public int getMinCreditScore() {
        return minCreditScore;
    }

    public void setMinCreditScore(int minCreditScore) {
        this.minCreditScore = minCreditScore;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}
