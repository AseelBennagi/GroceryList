package com.company;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private final List<String> groceryList = new ArrayList<>();

    public List<String> getGroceryList() {
        return groceryList;

    }

    public void addItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            System.out.println(item + " is already in the grocery list");
        } else {
            groceryList.add(item);
            System.out.println("you have added " + item + " to your grocery list");

        }
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            groceryList.remove(position);
            System.out.println("you have removed " + item + " to your grocery list");
        }
    }

    public void modifyItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            if (!onFile(newItem)) {
                groceryList.set(position, newItem);
                System.out.println("you have modified " + currentItem + " to be " + newItem + " in your grocery list");
            } else {
                System.out.println(newItem + " is already in the list");
            }
        }

    }


    public int findItem(String item) {
        return groceryList.indexOf(item);
    }

    public boolean onFile(String searchedItem) {
        int position = findItem(searchedItem);
        return position >= 0;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

}
