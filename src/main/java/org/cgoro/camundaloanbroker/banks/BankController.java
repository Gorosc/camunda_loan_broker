package org.cgoro.camundaloanbroker.banks;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static java.lang.Float.parseFloat;

@RestController
public class BankController {

    @GetMapping("/bank")
    public List<Bank> getBanks() {
        return Arrays.stream(AvailableBanks.values()).map(AvailableBanks::getBank).collect(java.util.stream.Collectors.toList());
    }

    @PostMapping("/bank/quote/{bank}")
    public Quote getQuote(@RequestBody QuoteRequest quoteRequest, @PathVariable AvailableBanks bank) {
        double rate = calcRate(bank, quoteRequest.getAmount(), quoteRequest.getCreditScore());
        return new Quote(bank.getBank().getBankId(), rate);
    }

    private double calcRate(AvailableBanks bank, int amount,int  score) {
        if (amount <= bank.getBank().getMaxLoanAmount() && score >= bank.getBank().getMinCreditScore()) {
            return bank.getBank().getBaseRate() + Math.random() * ((1000 - score) / 100.0);
        } else return -1.0; //Negative rate indicates that the loan cannot be approved
    }
}
