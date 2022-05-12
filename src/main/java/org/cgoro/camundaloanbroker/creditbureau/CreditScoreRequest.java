package org.cgoro.camundaloanbroker.creditbureau;

public class CreditScoreRequest {
    int taxNumber;
    int amount;
    int term;

    public CreditScoreRequest(int taxNumber, int amount, int term) {
        this.taxNumber = taxNumber;
        this.amount = amount;
        this.term = term;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
