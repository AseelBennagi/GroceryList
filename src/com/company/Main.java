package com.company;

import java.util.Scanner;

public class Main {
    private static final GroceryList groceryList = new GroceryList();
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printList();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0 -> printList();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> quit = true;

            }
        }


    }

    private static void addItem() {
        System.out.print("Please add an item to your grocery list: ");
        groceryList.addItem(sc.nextLine());
    }

    private static void removeItem() {
        System.out.print("Please type the item you want to remove: ");
        String item = sc.nextLine();
        groceryList.removeItem(item);
    }

    private static void modifyItem() {
        System.out.print("Please type the item you want to modify: ");
        String currentItem = sc.nextLine();
        System.out.print("Please type the new item: ");
        String newItem = sc.nextLine();
        groceryList.modifyItem(currentItem, newItem);
    }

    private static void searchItem() {
        System.out.print("Item to search for: ");
        String item = sc.nextLine();
        if (groceryList.onFile(item)) {
            System.out.println("Found " + item + " in the grocery list");
        } else {
            System.out.println(item + " is not in the shopping list");
        }
    }

    private static void printList() {
        System.out.println("\nPress ");
        System.out.println("\n 0 - To print choice options");
        System.out.println("\n 1 - To print the list of grocery item");
        System.out.println("\n 2 - To add an item to the list");
        System.out.println("\n 3 - To modify an item in the list");
        System.out.println("\n 4 - To remove an item from the list");
        System.out.println("\n 5 - To search for an item in the list");
        System.out.println("\n 6 - To quit the application");
    }
}
