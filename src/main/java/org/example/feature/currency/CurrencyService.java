package org.example.feature.currency;

import java.io.IOException;

interface CurrencyService {
    double getRate(Currency currency) throws IOException;
}
