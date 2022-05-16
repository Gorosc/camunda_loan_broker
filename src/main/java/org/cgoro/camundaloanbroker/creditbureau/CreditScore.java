package org.cgoro.camundaloanbroker.creditbureau;

public class CreditScore {
    int taxNumber;
    int creditScore;
    int history;

    public CreditScore() {}

    public CreditScore(int taxNumber, int creditScore, int history) {
        this.taxNumber = taxNumber;
        this.creditScore = creditScore;
        this.history = history;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }


}
