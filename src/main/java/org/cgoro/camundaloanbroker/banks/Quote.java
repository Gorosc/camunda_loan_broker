package org.cgoro.camundaloanbroker.banks;

public class Quote {
    double rate;
    String bankId;

    public Quote(String bankId, double rate) {
        this.bankId = bankId;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}
