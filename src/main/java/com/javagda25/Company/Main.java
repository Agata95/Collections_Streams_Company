package com.javagda25.Company;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product productFiat = new Product("Fiat Fullback", 82000);
        Product productSkoda = new Product("Skoda Octavia", 45000);
        Product productAudi = new Product("Audi A4", 90000);
        Product productFord = new Product("Ford mustang", 20000);
        Product productFiatTipo = new Product("Fiat Tipo", 52000);
        Product productCatering = new Product("Catering for event", 1300);
        Product productOfficeRent = new Product("Office rent", 25000);
        Product productFuelGasoline = new Product("Fuel, gasoline 95", 5.13);
        Product productFuelON = new Product("Fuel, oil", 5.02);
        Product productScrew = new Product("Screw", 3.2);
        Product productHammer = new Product("Hammer", 15.99);
        Product productPowerbank = new Product("Power bank", 15.99);
        Product productPhoneSamsung = new Product("Samsung Phone", 999.0);
        Product productPhoneApple = new Product("Apple Phone", 1299.99);
        Product productLaptopDell = new Product("Laptop, Dell Latitude", 1399.0);
        Product productLaptopApple = new Product("Laptop, Apple MacBook Pro", 1799.0);
        Product productServerDellPrecision = new Product("Server, Server Dell Precision", 2490.0);
        Product productPC = new Product("PC, Asus", 790.0);
        Product productCase = new Product("Case", 500.0);
        Product productSwitch = new Product("Network Switch", 130.0);
        Product productCoffeA = new Product("Coffe, Arabica", 29.99);
        Product productCoffeR = new Product("Coffe, Robusta", 39.99);
        Product productMug = new Product("Mug", 5.00);
        Product productPen = new Product("Pen", 0.99);
        Product productPencil = new Product("Pencil", 0.50);
        Product productClip = new Product("Clip", 2.49);
        Product productPuncher = new Product("Puncher", 0.79);
        Product productPaper = new Product("Paper", 9.99);
        Product productScisors = new Product("Scisors", 0.99);
        Product productFlour = new Product("Flour", 1.39);
        Product productSugar = new Product("Sugar", 1.87);
        Product productChocolate = new Product("Chocolate", 1.99);

        Company companyFallen = new Company("Fallen", "Detroit", 320, new ArrayList<>(Arrays.asList(
                new Purchase(productFiat, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 4), 18.1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 23.9, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 18), 41.8, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 37.2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 7.3, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 29), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 2), 21.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 43.3, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 10), 13.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 25.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 38.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 111.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 59.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 230.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 26), 18.3, UNIT.UNIT),

                new Purchase(productCoffeA, LocalDate.of(2018, 2, 15), 10.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 20), 10.0, UNIT.UNIT)
        )));

        Company companyPetersWifesCookies = new Company("Peters wifes cookies", "London", 12, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 25, UNIT.KILOGRAM),

                new Purchase(productFlour, LocalDate.of(2018, 1, 7), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 14), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 21), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 21), 25, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 7), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 14), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 21), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 28), 7, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 15), 25, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 28), 25, UNIT.KILOGRAM)
        )));

        Company companyTheOffice = new Company("Dunder Mifflin", "Detroit", 17, new ArrayList<>(Arrays.asList(
                new Purchase(productPaper, LocalDate.of(2018, 1, 1), 20.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 4), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 5), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 6), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 7), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productScisors, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 11), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 12), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 14), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 18), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 19), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 13.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 1, 21), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 25), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 26), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 27), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 28), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 29), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 30), 20.0, UNIT.UNIT),

                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 4), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 5), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 6), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 7), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 10), 20.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 2, 11), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 12), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 13), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 14), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 18), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 19), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 20), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 21), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 25), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 26), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 27), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT)
        )));

        Company transporting = new Company("Take me home", "London", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productSkoda, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFiatTipo, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productAudi, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 330.32, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 5), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 7), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 325.13, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 29), 325.13, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 1), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 7), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 9), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 325.13, UNIT.UNIT)
        )));

        Company companyTonysHardware = new Company("Tony's hardware", "Detroit", 2, new ArrayList<>(Arrays.asList(
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productScrew, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productFord, LocalDate.of(2018, 2, 20), 2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 70.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 20.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 35.0, UNIT.UNIT)
        )));

        Company companyTailor = new Company("Tailor Swift", "New York City", 3, new ArrayList<>(Arrays.asList(
                new Purchase(productScisors, LocalDate.of(2018, 1, 1), 3, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 2, UNIT.KILOGRAM),

                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 13), 3, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 18), 3, UNIT.UNIT)
        )));

        Company companyGoogleDublin = new Company("Google", "Dublin", 91, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 91, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 91, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 3), 20, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 91, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 5, UNIT.UNIT)
        )));


        Company companyGoogleLondon = new Company("Google", "London", 76, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 20, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 76, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 76, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 4, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 4, UNIT.UNIT)
        )));


        Company companyGoogleKijev = new Company("Google", "Kijev", 23, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 23, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 30.0, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));


        Company companyFintech = new Company("Fintech", "London", 9, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 5), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));

        Company companyFintechNewYork = new Company("Fintech", "New York City", 19, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 7, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productPowerbank, LocalDate.of(2018, 1, 1), 10, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 15.0, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 10), 3, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 1, 15), 2, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT)
        )));

        Company bakeryDetroit = new Company("Detroit Bakery", "Detroit", 11, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 200, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 50, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 132.53, UNIT.UNIT),
                new Purchase(productFlour, LocalDate.of(2018, 2, 1), 190, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 62, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 1), 79, UNIT.KILOGRAM)
        )));

        Company baltimoreFishing = new Company("Fisz", "Baltimore", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 500, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 500, UNIT.UNIT)
        )));

        Company solwit = new Company("Solwit", "Kijev", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productAudi, LocalDate.of(2018, 1, 2), 2, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 2), 89, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 12), 73.13, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 29), 67.33, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 13), 91.44, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 2), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 3), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 4), 1, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT)

        )));

        Company solwitGda = new Company("Solwit", "Gdansk", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 7), 1.0, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT)
        )));

        Company intelD = new Company("Intel", "Detroit", 755, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 10), 10, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 23.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 2, 20), 10, UNIT.UNIT)
        )));

        Company intelGda = new Company("Intel", "Gdansk", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        Company intelKij = new Company("Intel", "Kijev", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        List<Company> companies = new ArrayList<>(Arrays.asList(
                companyFallen,
                companyPetersWifesCookies,
                companyTheOffice,
                transporting,
                companyTonysHardware,
                companyTailor,
                companyGoogleDublin,
                companyGoogleLondon,
                companyGoogleKijev,
                companyFintech,
                companyFintechNewYork,
                bakeryDetroit,
                baltimoreFishing,
                solwitGda,
                solwit,
                intelD,
                intelGda,
                intelKij
        ));

//        System.out.println(companies);

        System.out.println("\n----------------- 1 ----------------- Wylistuj wszystkie firmy. \n");
        exercise1(companies);
        System.out.println("\n----------------- 2 ----------------- Wylistuj wszystkie firmy które są z Detroit. \n");
        exercise2(companies);
        System.out.println("\n----------------- 3 ----------------- Wylistuj wszystkie firmy z Londynu, posortuj je po" +
                " ilości pracowników (rosnąco). \n");
        exercise3(companies);
        System.out.println("\n----------------- 4 ----------------- Wylistuj wszystkie firmy z Warszawy. Posortuj je po" +
                " ilości zakupów (rosnąco) i ilości pracowników (malejąco). \n");
        exercise4(companies);
        System.out.println("\n----------------- 5 ----------------- Zwróć firmę z największą ilością pracowników, która" +
                " pochodzi z Kijowa. \n");
        exercise5(companies);
        System.out.println("\n----------------- 6 ----------------- Zwróć firmę z najkrótszą nazwą \n");
        exercise6(companies);
        System.out.println("\n----------------- 7 ----------------- Zwróć firmę która nie pochodzi z Kijowa, Londynu i" +
                " Detroit, która ma najmniej kupionych produktów. \n");
        exercise7(companies);
        System.out.println("\n----------------- x ----------------- xxx \n");
    }


    public static void exercise1(List<Company> companies) {
        companies.stream()
                .forEach(wyswietl -> System.out.println(wyswietl));
    }

    public static void exercise2(List<Company> companies) {
        companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("Detroit"))
                .forEach(wyswietl -> System.out.println(wyswietl));
    }

    public static void exercise3(List<Company> companies) {
        List<Company> listaFirm = companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("London"))
                .sorted(Comparator.comparingInt(Company::getEmployees))
                .collect(Collectors.toList());
        listaFirm.forEach(System.out::println);
    }

    public static void exercise4(List<Company> companies) {
        List<Company> listaFirmGdansk = companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("Gdansk"))
                .sorted(Comparator.comparingInt(o -> o.getPurchaseList().size()))
                .sorted(Comparator.comparingInt(Company::getEmployees)
                        .reversed())
                .collect(Collectors.toList());
        listaFirmGdansk.forEach(System.out::println);
    }

    public static Company exercise5(List<Company> companies) {
        List<Company> listaWszystkichFirm = companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("Kijev"))
                .collect(Collectors.toList());

        OptionalInt najwiecejPracownikow = listaWszystkichFirm.stream()
                .mapToInt(p -> p.getEmployees()).max();

        Optional<Company> listaWszystkichFirm2 = listaWszystkichFirm.stream()
                .filter(p -> p.getEmployees() == najwiecejPracownikow.getAsInt())
                .findFirst();

        if (najwiecejPracownikow.isPresent()) {
            System.out.println(listaWszystkichFirm2.get());
        }
        return listaWszystkichFirm2.get();
    }

    public static List<Company> exercise6(List<Company> companies) {
        List<Company> minNameList = new ArrayList<>();
        OptionalInt minName=companies.stream()
                .mapToInt(c -> c.getName().length()).min();
        if (minName.isPresent()){
            Optional<Company> optionalCompany = companies.stream()
                    .filter(c -> c.getName().length() == minName.getAsInt()).findAny();
            minNameList.add(optionalCompany.get());
            return minNameList;
        } else {
            return null;
        }
    }


    public static Company exercise7(List<Company> companies){
        List<Company> listaWszytskichFirm = companies.stream()
                .filter(p->!p.getCityHeadquarters().equals("London")&&!p.getCityHeadquarters().equals("Kijev")&&
                        !p.getCityHeadquarters().equals("Detroit"))
                .sorted(Comparator.comparingInt(o->o.getPurchaseList().size()))
                .collect(Collectors.toList());
        Optional<Company> najmniejProduktow = listaWszytskichFirm.stream()
                .findFirst();
        System.out.println(najmniejProduktow);

        return najmniejProduktow.get();
    }

}
