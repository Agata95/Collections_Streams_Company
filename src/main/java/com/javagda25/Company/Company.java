package com.javagda25.Company;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@AllArgsConstructor
@Data

public class Company {
    private String name;                    // nazwa firmy
    private String cityHeadquarters;        // siedziba firmy
    private int employees;                  // ilość pracowników
    private List<Purchase> purchaseList;    // lista zakupów wykonanych przez firmę (co firma kupiła)
}
