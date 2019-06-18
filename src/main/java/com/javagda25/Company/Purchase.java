package com.javagda25.Company;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor

public class Purchase {
    private Product product;        // produkt zakupiony
    private LocalDate purchaseDate; // data dokonania zakupu
    private double quantity;        // zakupiona ilość produktu
    private UNIT unit;              // jednostka zakupu (np. w gramach)
}