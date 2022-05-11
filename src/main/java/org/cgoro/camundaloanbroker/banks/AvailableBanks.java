package org.cgoro.camundaloanbroker.banks;

/* Keeping the available Banks in memory */
public enum AvailableBanks {
    UNIVERSAL( new Bank(70000, 500, "UNIVERSAL", 4)),
    PAWNSHOP(new Bank(50000, 400, "PAWNSHOP", 5)),
    PREMIUM(new Bank(900000, 600, "PREMIUM", 3));

   Bank bank;

    AvailableBanks(Bank bank) {
        this.bank = bank;
    }

    Bank getBank() {
        return bank;
    }
}
