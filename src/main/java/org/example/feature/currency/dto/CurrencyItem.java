package org.example.feature.currency.dto;

import lombok.Data;
import org.example.feature.currency.Currency;

@Data
public class CurrencyItem {
    private Currency ccy;
    private Currency base_ccy;
    private float buy;
    private float sale;
}
