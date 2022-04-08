package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2015;

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 3
        int year = 2022;

        switch (year) {
            case 2000:
                System.out.println(" ...год является високосным");
                break;
            case 2001:
            case 2002:
            case 2003:
                System.out.println(" ...год не является високосным");
                break;
            case 2004:
                System.out.println(" ...год является високосным");
                break;
            case 2005:
            case 2006:
            case 2007:
                System.out.println(" ...год не является високосным");
                break;
            case 2008:
                System.out.println(" ...год является високосным");
                break;
            case 2009:
            case 2010:
            case 2011:
                System.out.println(" ...год не является високосным");
                break;
            case 2012:
                System.out.println(" ...год является високосным");
                break;
            case 2013:
            case 2014:
            case 2015:
                System.out.println(" ...год не является високосным");
                break;
            case 2016:
                System.out.println(" ...год является високосным");
                break;
            case 2017:
            case 2018:
            case 2019:
                System.out.println(" ...год не является високосным");
                break;
            case 2020:
                System.out.println(" ...год является високосным");
                break;
            case 2021:
            case 2022:
            case 2023:
                System.out.println(" ...год не является високосным");
                break;
            case 2024:
                System.out.println(" ...год является високосным");
                break;
            case 2025:
            case 2026:
            case 2027:
                System.out.println(" ...год не является високосным");
                break;
            case 2028:
                System.out.println(" ...год является високосным");
                break;
            case 2029:
            case 2030:
            case 2031:
                System.out.println(" ...год не является високосным");
                break;
            case 2032:
                System.out.println(" ...год является високосным");
                break;
            case 2033:
            case 2034:
            case 2035:
                System.out.println(" ...год не является високосным");
                break;
            case 2036:
                System.out.println(" ...год является високосным");
                break;
            default:
                System.out.println("Неправильное значение");
        }

        // Задание 4
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + (deliveryDays));
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки не будет :)");
        }

        // Задание 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }



















        }
    }

