package org.example;

import org.example.currency.CurrencyService;
import org.example.currency.dto.Currency;
import org.example.currency.PrivatBankCurrencyService;

import java.io.IOException;

public class TelegramBotApp {
    public static void main(String[] args) throws IOException {
        CurrencyService currencyService = new PrivatBankCurrencyService();
        double rate = currencyService.getRate(Currency.USD);
        System.out.println("rate: " + rate);
    }
}
