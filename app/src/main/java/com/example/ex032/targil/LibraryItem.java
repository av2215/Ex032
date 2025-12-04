package com.example.ex032.targil;

import java.util.UUID;

public abstract class LibraryItem {
    private final UUID itemId;
    private String title;
    private int yearPublished;
    private boolean isBorrowed;

    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
        itemId = UUID.randomUUID();
        isBorrowed = false;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed=borrowed;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "itemId=" + itemId +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public void borrow()
    {
        if(isBorrowed)
        {}
        else
        {
            isBorrowed=true;
        }
    }
    public void returnItem()
    {
        isBorrowed=false;
    }
    public abstract double calculateLateFee(int daysPastDue);
}
