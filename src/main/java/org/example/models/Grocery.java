package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        boolean cikis = false;
        while (!cikis) {
            System.out.println("0 cikis 1 eleman ekle 2 eleman cikar");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 0:
                    cikis = true;
                    break;
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String addItemsInput = scanner.nextLine();
                    addItems(addItemsInput);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String removeItemsInput = scanner.nextLine();
                    removeItems(removeItemsInput);
                    printSorted();
                    break;
                default:
                    System.out.println("Gecersiz secim 0-1-2 den birini secmeliydiniz.");
                    break;
            }
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!groceryList.contains(item)) {
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (groceryList.contains(item)) {
                groceryList.remove(item);
            }

        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Grocery List: " + groceryList);
    }
}
