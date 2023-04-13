package org.example.currency;

import org.example.currency.dto.Currency;

import java.io.IOException;

public interface CurrencyService {
    double getRate(Currency currency) throws IOException;
}
