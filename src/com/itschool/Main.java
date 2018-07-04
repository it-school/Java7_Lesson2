package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Пример 1
//        Scanner in = new Scanner(System.in);
//        int mark;
//
//        //System.out.println("Введите оценку по 100-бальной шкале :");
//        while (true) {
//            System.out.println("Введите оценку : ");
//            mark = in.nextInt();
//            if (mark >= 60 && mark <= 100){
//                break;
//            }
//            System.out.println("Ошибка! Введите другое значение!");
//        }
//
//
//          if (mark < 75){
//            System.out.println("Оценка = 3");
//        } else if (mark < 90){
//            System.out.println("Оценка = 4");
//        } else if (mark <= 100){
//            System.out.println("Оценка = 5");
//        }

        System.out.println("Программа завершилась успешно");


//        c = (a > b) ? (c = 1) : (c = 2);
//
//        if (a > b) {
//            c = 1;
//        }
//        else {
//            c = 2;
//        }


// Пример 2
//            int price;
//            int discount = 0;
//            Scanner in = new Scanner(System.in);
//
//            while (true) {
//                System.out.println("Введите цену покупки : ");
//                price = in.nextInt();
//                if (price > 0){
//                    break;
//                }
//            }
//
//        if (price >= 5000){
//            discount = 10;
//        } else if (price >= 2000){
//            discount = 7;
//        } else if (price >= 1000){
//            discount = 5;
//        } else if (price >= 500) {
//            discount = 3;
//        } else {
//            System.out.println("Скидки не будет!!!");
//        }
//
//        System.out.println("Total price = " + result(discount, price)  + " Discount : " + discount + "%");
//
//            Scanner in = new Scanner(System.in);
//            double x;
//            double y;
//            System.out.print("Х равен : ");
//            x = in.nextDouble();
//            System.out.println("Y равен : ");
//            y = in.nextDouble();
//            int coordinateSpace = sector (x, y);
//            System.out.println("Сектор : " + coordinateSpace);


// Пример 3
            String monthNumber;
            int value;
            Scanner in = new Scanner(System.in);
            while (true) {
                System.out.println("Введите номер месяца: ");
                monthNumber = in.next();
                try {
                    value = Integer.parseInt(monthNumber);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Exception " + e);
                }
            }
            funcMonthNumber(value);




        }

//        public static double result (int discount, int price){
//            return (((100 - discount)* price)/100);
//        }



        public static int sector (double x, double y){
            if (x > 0 && y > 0){
                return 1;
            } else if (x < 0 && y > 0){
                return 2;
            } else if (x < 0 && y < 0 ){
                return 3;
            } else if (x > 0 && y < 0){
                return 4;
            } else {
                return 0;
            }

        }

        public static void funcMonthNumber (int monthNumber){
            switch (monthNumber){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("Semtember");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Неправильный номер месяца");
            }
        }
    }


