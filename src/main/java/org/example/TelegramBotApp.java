package org.example;

import org.example.UI.PrettyPrintCurrencyService;
import org.example.currency.CurrencyService;
import org.example.currency.dto.Currency;
import org.example.currency.PrivatBankCurrencyService;

import java.io.IOException;

public class TelegramBotApp {
    public static void main(String[] args) throws IOException {
        CurrencyService currencyService = new PrivatBankCurrencyService();

        Currency currency = Currency.USD;
        double rate = currencyService.getRate(currency);

        String prettyText = new PrettyPrintCurrencyService().convert(rate, currency);

        System.out.println(prettyText);
    }
}
