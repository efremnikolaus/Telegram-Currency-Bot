package org.example.UI;

import org.example.currency.dto.Currency;

public class PrettyPrintCurrencyService {
    public String convert(double rate, Currency currency){
        String template = "Exchange ${currency} => UAH = ${rate}";

        float roundedRate = Math.round(rate * 100d) / 100.f;

        return template
                .replace("${currency}", currency.name())
                .replace("${rate}", roundedRate + "");

    }
}
