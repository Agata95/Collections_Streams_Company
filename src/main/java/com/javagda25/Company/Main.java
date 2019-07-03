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
        System.out.println("\n----------------- 8 ----------------- Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi" +
                " z Kijowa lub Detroit. \n");
        exercise8(companies);
        System.out.println("\n----------------- 9 ----------------- Zwróć MAPĘ w której kluczem jest nazwa firmy, a " +
                "wartością ilość pracowników w tej firmie. \n");
        exercise9(companies);
        System.out.println("\n----------------- 10 ----------------- Zwróć Mapę w której kluczem jest miejscowość a " +
                "wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>). \n");
        exercise10(companies);
        System.out.println("\n----------------- 11 ----------------- Zwróć firmę która dokonała zakupów na" +
                " największą kwotę. \n");
        exercise11(companies);
        System.out.println("\n----------------- 12 ----------------- Zwróć firmę która kupiła najwięcej produktów " +
                "za kwotę wyższą niż 10 k. \n");
        exercise12(companies);
        System.out.println("\n----------------- 13 ----------------- Zwróć miejscowość która wydała najwięcej pieniędzy." +
                " Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość,\n" +
                " a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości. \n");
        exercise13(companies);
        System.out.println("\n----------------- 14 ----------------- Wypisz firmy które 15 stycznia 2018 " +
                "kupiły \"Network Switch\". \n");
        exercise14(companies);
        System.out.println("\n----------------- 15 ----------------- Znajdź firmę która kupuje najwięcej kawy. \n");
        exercise15(companies);
        System.out.println("\n----------------- 19 ----------------- Zwróć firmę która w styczniu kupiła najwięcej " +
                "paliwa (ropy) \n");
        exercise19(companies);
        System.out.println("\n----------------- 20 ----------------- Zwróć firmę której proporcja wydanych pieniędzy" +
                " do ilości pracowników jest najwyższa \n");
        exercise20(companies);
        System.out.println("\n----------------- 21 ----------------- Zwróć firmę która najwięcej wydaje na artykuły" +
                " biurowe \n");
        exercise21(companies);
        System.out.println("\n----------------- 22 ----------------- Zwróć firmy posortowane po ilości wydanych" +
                " pieniędzy na paliwo. \n");
        exercise22(companies);
        System.out.println("\n----------------- 23 ----------------- Zwróć wszystkie produkty które kupione były na" +
                " kilogramy. \n");
        exercise23(companies);
        System.out.println("\n----------------- 24 ----------------- Zwróć listę zakupów (obiektów purchase) kupionych " +
                "przez firmy z Detroit w miesiącu lutym. Posortuj je po kwocie. \n");
        exercise24(companies);
        System.out.println("\n----------------- 25 ----------------- Zwróć ilość biur które wynajęte były w " +
                "miesiącu lutym. \n");
        exercise25(companies);
        System.out.println("\n----------------- 26 ----------------- Zwróć Mapę (Map<Company, Integer>). W mapie umieść" +
                " wpisy Firma - > ilość biur które wynajęły w dowolnym okresie. \n");
        exercise26(companies);
        System.out.println("\n----------------- 27 ----------------- Wypisz \"Nazwa firmy: XYZ, ilość zakupionych " +
                "telefonów apple: X\" dla każdej firmy która kupiła telefon apple. Wypisy\n" +
                " powinny być posortowane (na szczycie powinna być firma która kupiła ich najwięcej). \n");
        exercise27(companies);
        System.out.println("\n----------------- 28 ----------------- Znajdź firme która posiada siedzibę w więcej niż " +
                "jednym mieście. Posortuj firmy po ilości siedzib, wypisz tylko te\n" +
                "które mają więcej niż 1 siedzibę. \n");
        exercise28(companies);
        System.out.println("\n----------------- 29 ----------------- Wypisz ilość kilogramów cukru zużywaną " +
                "przez \"Detroit Bakery\". \n");
        exercise29(companies);
        System.out.println("\n----------------- 30 ----------------- Wypisz wszystkie zakupy firmy \"Solwit\". \n");
        exercise30(companies);
        System.out.println("\n----------------- x ----------------- xxx \n");
    }

    private static void exercise30(List<Company> companies) {
        companies
                .stream()
                .filter(c -> c.getName().equalsIgnoreCase("solwit"))
                .flatMap(c -> c.getPurchaseList().stream())
                .forEach(System.out::println);
    }

    private static void exercise29(List<Company> companies) {
        double sum = companies
                .stream()
                .filter(c -> c.getName().equalsIgnoreCase("Detroit Bakery"))
                .mapToDouble(c -> c.getPurchaseList()
                        .stream()
                        .filter(p -> p.getProduct().getName().equalsIgnoreCase("sugar"))
                        .mapToDouble(Purchase::getQuantity)
                        .sum())
                .sum();

        System.out.println("Sum of sugar used by Detroit Bakery equals: " + sum);
    }

    private static void exercise28(List<Company> companies) {
        // groupingBy gdy kluczy jest więcej
        // Collectors.mapping - zgrupowanie np. miast na listę
        Map<String, List<String>> companyIntegerMap = companies
                .stream()
                .collect(Collectors.groupingBy(
                        c -> c.getName(),
                        Collectors.mapping(c -> c.getCityHeadquarters(), Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(value -> value.size())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

        companyIntegerMap
                .entrySet()
                .stream()
                .filter(s -> s.getValue().size() > 1)
                .forEach(s -> System.out.println("Firma " + s.getKey() + " " + s.getValue().size()));
    }

    private static void exercise27(List<Company> companies) {
        Map<Company, Double> sortedByApple = companies.stream()
                .filter(c -> c.getPurchaseList()
                        .stream()
                        .anyMatch(p -> p.getProduct().getName().equalsIgnoreCase("Apple Phone")))
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(p -> p.getProduct().getName().equalsIgnoreCase("Apple Phone"))
                                .mapToDouble(p -> p.getQuantity())
                                .sum()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

        sortedByApple.entrySet().forEach(c -> System.out.println("Nazwa firmy: " + c.getKey().getName() + ", ilość zakupionych " +
                "telefonów apple:  " + c.getValue()));
    }

    private static void exercise26(List<Company> companies) {
        Map<Company, Integer> comps = companies.stream()
                .collect(Collectors.toMap(
                        company -> company,
                        company -> company.getPurchaseList()
                                .stream()
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                                .mapToInt(purchase -> (int) purchase.getQuantity())
                                .sum()));

        // żeby wykorzystać binaryoperator (merger)
        // zmieniliśmy trochę stream.
        // kluczem jest nazwa firmy (która jest nieunikalna!) więc pod ten sam klucz trafi kilka wartości
        // to, czego dokonujemy w ostatniej linii:
        //        (o, o2) -> o + o2));
        // to kryterium "co zrobić z wartościami jeśli pod tym samym kluczem będzie więcej niż tylko jedna wartość
        // nasze kryterium dokonuje sumowania - ponieważ chcę dowiedzieć się ile firma Intel wynajęła w sumie biur.
        Map<String, Integer> compsNames = companies.stream()
                .collect(Collectors.toMap(
                        company -> company.getName(),
                        company -> company.getPurchaseList()
                                .stream()
                                // filtr nazwy produktu
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                                // każdy purchase jest zamieniany na ilość wykupionych produktów (odfiltrowanych)
                                .mapToInt(purchase -> (int) purchase.getQuantity())
                                .sum(),
                        (o, o2) -> o + o2));

//        comps.forEach((company, iloscBiurWDowolnymOkresie) -> System.out.println(company.getName() + " biur: " + iloscBiurWDowolnymOkresie));
        compsNames.forEach((companyName, iloscBiurWDowolnymOkresie) -> System.out.println(companyName + " biur: " + iloscBiurWDowolnymOkresie));
    }

    private static void exercise25(List<Company> companies) {
        Double result = companies.stream()
                .mapToDouble(company -> company.getPurchaseList()
                        .stream()
                        // filtry miesiac i nazwa produktu
                        .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2)
                        .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                        // każdy purchase jest zamieniany na ilość wykupionych produktów (odfiltrowanych)
                        .mapToDouble(purchase -> purchase.getQuantity())
                        // sumowanie ilości
                        // wynik (suma) poniżej to ilość wynajętych przez każdą kolejną firmę
                        .sum())
                .sum();


        System.out.println("Wynik: " + result);
    }

    private static void exercise24(List<Company> companies) {
        List<Purchase> products = companies
                .stream()
                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("detroit"))
                .flatMap(c -> c.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2))
                .sorted(Comparator
                        // sortujemy po wartości - price * quantity
                        .comparingDouble(
                                pur -> pur.getProduct().getPrice() * pur.getQuantity()))
                .collect(Collectors.toList());

        products.forEach(p -> System.out.println(p.getProduct().getName() + " na kwotę " + p.getQuantity()));
    }

    private static void exercise23(List<Company> companies) {
        Set<Product> products = companies.stream()
                .map(co -> co.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getUnit() == UNIT.KILOGRAM)
                        .map(purchase -> purchase.getProduct()).collect(Collectors.toSet()))
                .flatMap(productList -> productList.stream())
                .collect(Collectors.toSet());

        products.forEach(product -> System.out.println(product.getName()));
    }

    private static void exercise22(List<Company> companies) {
        Map<Company, Double> moneyForNothing = companies.stream().collect(Collectors.toMap(
                co -> co,
                co -> co.getPurchaseList()
                        .stream()
                        .filter(p -> p.getProduct().getName().startsWith("Fuel"))
                        .mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        moneyForNothing.entrySet().forEach(companyDoubleEntry -> System.out.println(companyDoubleEntry.getKey().getName()
                + " " + companyDoubleEntry.getValue()));
    }

    private static void exercise21(List<Company> companies) {
        Optional<Company> oc = companies
                .stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(purchase ->
                                        purchase.getProduct().getName().equalsIgnoreCase("pen") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("pencil") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("paper") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("clip") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("scisors") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("puncher"))
                                .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                                .sum()));
        if (oc.isPresent()) {
            Company c = oc.get();
            System.out.println(c.getName());
        }
    }

    private static void exercise20(List<Company> companies) {
        Optional<Company> company = companies.stream()
                .max(Comparator.comparingDouble(p -> p.getPurchaseList()
                        .stream()
                        .mapToDouble(purchase -> purchase.getQuantity() * purchase.getProduct().getPrice())
                        .sum() / p.getEmployees()));

        System.out.println(company);
    }

    private static Optional<Company> exercise19(List<Company> companies) {
        Optional<Company> oc = companies.stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(p -> p.getProduct().getName().equalsIgnoreCase("Fuel, oil"))
                                .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 1).mapToDouble(
                                        p -> p.getQuantity()).sum()));
        if (oc.isPresent()) {
            return oc;
        } else {
            return null;
        }
    }

    private static void exercise15(List<Company> companies) {

    }

    private static void exercise14(List<Company> companies) {
        companies.stream()
                .filter(p -> p.getPurchaseList().stream()
                        .anyMatch(c -> c.getPurchaseDate().isEqual(LocalDate.of(2018, 1, 15)) &&
                                c.getProduct().getName().equalsIgnoreCase("network switch")))
                .forEach(c -> System.out.println(c.getName() + " " + c.getCityHeadquarters()));
    }

    private static void exercise13(List<Company> companies) {
        Set<String> company = companies.stream()
                .map(p -> p.getCityHeadquarters()).collect(Collectors.toSet());

        Map<String, Double> minMoney = company.stream().collect(Collectors.toMap(
                m -> m,
                m -> companies.stream()
                        .filter(p -> p.getCityHeadquarters().equals(m))
                        .mapToDouble(c -> c.getPurchaseList().stream()
                                .mapToDouble(d -> d.getProduct().getPrice() * d.getQuantity()).sum()).sum()));

        System.out.println(minMoney);
    }

    private static void exercise12(List<Company> companies) {
        Optional<Company> company = companies.stream()
                .max(Comparator.comparingDouble(
                        p -> p.getPurchaseList().stream()
                                .filter(c -> c.getProduct().getPrice() > 10000)
                                .mapToDouble(Purchase::getQuantity).sum()));
        System.out.println(company);
    }

    private static void exercise11(List<Company> companies) {
        Optional<Company> company = companies.stream()
                .max(Comparator.comparingDouble(
                        p -> p.getPurchaseList().stream()
                                .mapToDouble(c -> c.getProduct().getPrice() * c.getQuantity()).sum()));
        System.out.println(company);
    }

    private static void exercise10(List<Company> companies) {
        Set<String> city = companies.stream()
                .map(Company::getCityHeadquarters).collect(Collectors.toSet());

        Map<String, List<Company>> mapOfCompany = city.stream().collect(Collectors.toMap(
                m -> m,
                m -> companies.stream()
                        .filter(p -> p.getCityHeadquarters().equals(m))
                        .collect(Collectors.toList())));

        for (Map.Entry<String, List<Company>> s : mapOfCompany.entrySet()) {
            System.out.println(s.getKey() + ": " + s.getValue());
        }

    }

    private static void exercise9(List<Company> companies) {
        Set<String> companyName = companies.stream()
                .map(p -> p.getName()).collect(Collectors.toSet());

        Map<String, Integer> map = companyName.stream().collect(Collectors.toMap(
                m -> m,
                m -> companies.stream()
                        .filter(p -> p.getName().equals(m))
                        .mapToInt(c -> c.getEmployees()).sum()));

        System.out.println(map);
    }

    private static void exercise8(List<Company> companies) {
        List<Company> companyDetroitKijev = companies.stream()
                .filter(p -> p.getCityHeadquarters().equalsIgnoreCase("Detroit") ||
                        p.getCityHeadquarters().equalsIgnoreCase("Kijev"))
                .collect(Collectors.toList());
        for (Company company : companyDetroitKijev) {
            company.setEmployees(company.getEmployees() + 1);
        }

        for (Company company : companyDetroitKijev) {
            System.out.println(company);
        }
    }

    public static Company exercise7(List<Company> companies) {
        List<Company> allComapniesList = companies.stream()
                .filter(p -> !p.getCityHeadquarters().equals("London") && !p.getCityHeadquarters().equals("Kijev") &&
                        !p.getCityHeadquarters().equals("Detroit"))
                .sorted(Comparator.comparingInt(o -> o.getPurchaseList().size()))
                .collect(Collectors.toList());
        Optional<Company> minProducts = allComapniesList.stream()
                .findFirst();
        System.out.println(minProducts);

        return minProducts.get();
    }

    public static List<Company> exercise6(List<Company> companies) {
        List<Company> minNameList = new ArrayList<>();
        OptionalInt minName = companies.stream()
                .mapToInt(c -> c.getName().length()).min();
        if (minName.isPresent()) {
            Optional<Company> optionalCompany = companies.stream()
                    .filter(c -> c.getName().length() == minName.getAsInt()).findAny();
            minNameList.add(optionalCompany.get());

            System.out.println(minNameList);

            return minNameList;
        } else {
            return null;
        }
    }

    public static Company exercise5(List<Company> companies) {
        List<Company> allComapniesList = companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("Kijev"))
                .collect(Collectors.toList());

        OptionalInt employeesMax = allComapniesList.stream()
                .mapToInt(p -> p.getEmployees()).max();

        Optional<Company> allCompaniesList2 = allComapniesList.stream()
                .filter(p -> p.getEmployees() == employeesMax.getAsInt())
                .findFirst();

        if (employeesMax.isPresent()) {
            System.out.println(allCompaniesList2.get());
        }
        return allCompaniesList2.get();
    }

    public static void exercise4(List<Company> companies) {
        List<Company> companyGdanskList = companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("Gdansk"))
                .sorted(Comparator.comparingInt(o -> o.getPurchaseList().size()))
                .sorted(Comparator.comparingInt(Company::getEmployees)
                        .reversed())
                .collect(Collectors.toList());
        companyGdanskList.forEach(System.out::println);
    }

    public static void exercise3(List<Company> companies) {
        List<Company> companiesList = companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("London"))
                .sorted(Comparator.comparingInt(Company::getEmployees))
                .collect(Collectors.toList());
        companiesList.forEach(System.out::println);
    }

    public static void exercise2(List<Company> companies) {
        companies.stream()
                .filter(p -> p.getCityHeadquarters().equals("Detroit"))
                .forEach(p -> System.out.println(p));
    }

    public static void exercise1(List<Company> companies) {
        companies.stream()
                .forEach(p -> System.out.println(p));
    }

}
