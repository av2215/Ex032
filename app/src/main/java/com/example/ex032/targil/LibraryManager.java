package com.example.ex032.targil;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LibraryManager {
    public static void main(String[] args)
    {
        Map<UUID, LibraryItem> inventory = new HashMap<>();
        Book book1 = new Book("Avatar kora", 2019, 80, "Michael Dante DiMartino");
        inventory.put(book1.getItemId(),book1);
        Magazine magazine1 = new Magazine("Time square", 1970, "Yoav Shpigler", 25867);
        inventory.put(magazine1.getItemId(),magazine1);
        Book book2 = new Book("Avatar ang", 2018, 60, "Michael");
        inventory.put(book2.getItemId(),book2);
        Magazine magazine2 = new Magazine("Windows", 2000, "Steve Jobs", 52955);
        inventory.put(magazine2.getItemId(),magazine2);
        Book book3 = new Book("Iron Man", 1997, 200, "Yahav");
        inventory.put(book3.getItemId(),book3);
        UUID book1ItemId = book1.getItemId();
        ((Book) inventory.get(inventory.get(book1ItemId))).displayFullDetails();
        UUID uu = UUID.randomUUID();
        if (inventory.get(uu) == null)
        {
            System.out.println("doesn't found");
        }
        else
        {
            ((Book) inventory.get(inventory.get(uu))).displayFullDetails();
        }
        inventory.get(book1.getItemId()).borrow();
        inventory.get(book2.getItemId()).borrow();
        for (LibraryItem libraryItem : inventory.values()) {
            if (libraryItem.isBorrowed() == true)
            {
                System.out.println(libraryItem.calculateLateFee(10));
            }
        }
        String search = "הארי פוטר";
        for (LibraryItem libraryItem : inventory.values()) {
            if (libraryItem instanceof Searchable)
            {
                if (((Searchable) libraryItem).matches(search)) {
                    System.out.println(libraryItem);
                }
            }
        }
    }
}
