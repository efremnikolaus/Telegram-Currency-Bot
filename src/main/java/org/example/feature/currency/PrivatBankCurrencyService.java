package org.example.feature.currency;

public class PrivatBankCurrencyService implements CurrencyService{

    @Override
    public double getRate(Currency currency) {
        return 0;
    }
}
