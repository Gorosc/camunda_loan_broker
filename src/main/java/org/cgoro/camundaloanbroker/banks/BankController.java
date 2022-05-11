package org.cgoro.camundaloanbroker.banks;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static java.lang.Float.parseFloat;

@RestController
public class BankController {

    @GetMapping("/bank")
    public List<Bank> getBanks() {
        return Arrays.asList(Bank.values());
    }

    @PostMapping("/bank/quote/{bank}")
    public Quote getQuote(@RequestBody QuoteRequest quoteRequest, @PathVariable Bank bank) {
        double rate = calcRate(bank, quoteRequest.getAmount(), quoteRequest.getTerm(), quoteRequest.getCreditScore());
        return new Quote(bank.bankId, rate);
    }

    private double calcRate(Bank bank, int amount,int term,int  score) {
        if (amount <= bank.maxLoanAmount && score >= bank.minCreditScore) {
            return bank.baseRate + Math.random() * ((1000 - score) / 100.0);
        } else return -1.0; //Negative rate indicates that the loan cannot be approved
    }
}
