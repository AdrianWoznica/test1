package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*zainicjuj tablice, która przechowuje 5 imion, do elementu o indeksie 2, przypisz imię Marek, do indeksu 4 przypisz Ola
        //wyświetl wszystkie elementy tablicy, wyświetl na talice rozmiar tablicy
        String[] imiona = new String[5];
        imiona[2] = "Marek";
        imiona[4] = "Ola";

        System.out.println(imiona.length);
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);
        System.out.println(imiona[3]);
        System.out.println(imiona[4]); */
        //stworz tablice przechowujaca 10 liczb calkowitych, do indeksu o numerze 1,3,5,9 przypisz dowolnie wybrane liczby
        //wyswietl jej wszystkie elementy i rozmiar tablicy
       /* int[] numbers = new int[10];
        numbers[1] = 7;
        numbers[3] = 14;
        numbers[5] = 2;
        numbers[9] = 12;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);
        System.out.println(numbers.length); */
        //stworz tablice przechowujace wartosci typu int o rozmiarze 10, wypelnij ja wartosciami pobranymi z konsoli
        //wewnarz petli for i wyswietl zawartosc tablicy

       /* int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj jakąś liczbę ");
        array[i] = sc.nextInt();

        }
        for (int x:array) {
            System.out.println(x);
        } */
     /*   String[] names = new String[4];
        names[0] = "Jan";
        names[3] = "Roman";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Elementy numer " + (i + 1) + " to: " + names[i]);
        } */
      /*  String[] names = new String[5]; // utworzenie tablicy jednowymiarowej o nazwie names z 5 elementami typu String
        names[0] = "Jan"; // przypisanie do elementu o indeksie 0 wartości "Jan"
        names[2] = "Grzegorz"; // przypisanie do elementu o indeksie 2 wartości "Grzegorz"
        names[4] = "Barbara"; // przypisanie do elementu o indeksie 4 wartości "Barbara"

        for (int i = 0; i < names.length; i++) { // deklaracja pętli for, żeby użyć iteracji (zdefiniowanie zmiennej i, żeby podstawić ją pod elementy tablicy, tak żeby można było wyświetlić każdy jej element
            System.out.println("Element o numerze " + (i+1) + " wynosi: " + names[i]); */
       /* String [][] myArray = new String[2][];
        myArray[0] = new String[]{"Ala", "ma", "kota"};
        myArray[1] = new String[]{"Kot", "ma", "Alę"};
        System.out.println(myArray[1][1]);
        System.out.println(myArray[0][0]);
        System.out.println(myArray[1][1]);
        } */
        // tablica 10 elementów, typu int; wypełnij ją losowymi wartościami w pętli for, zwróć sumę, średnią i największą z tych wartości, wypisz tylko liczby parzyste
       /* int[] numbers = new int[10];
        Random random = new Random();
        int suma = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
            suma += numbers[i];
        }
        System.out.println("Suma tych liczb to: " + suma);
        System.out.println("średnia tych liczb to: " + suma/numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Największa liczba z tych ");
        */

        // wyświetl imiona, które skladają się z 5 znaków,
        // tylko damskie
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Podaj imię");
            names[i] = sc.nextLine();
        }
//        for (String name : names) {
//            System.out.println(name);
//        }
        for (int i = 0; i < names.length ; i++) {
            if (names[i].length() < 5 ){
                System.out.println(names[i] + ", ");
        }

        }

    }
}
