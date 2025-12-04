package com.example.ex032.targil;

public class Book extends LibraryItem implements Searchable,Displayable{
    private int numOfPages;
    private String author;

    public Book(String title, int yearPublished, int numOfPages, String author) {
        super(title, yearPublished);
        this.numOfPages = numOfPages;
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayFullDetails() {
        System.out.println("numOfPages: " + numOfPages + ", author" + author + super.toString());
    }

    @Override
    public double calculateLateFee(int daysPastDue) {
        return 0.5 * daysPastDue;
    }

    @Override
    public boolean matches(String query) {
        if (query.equals(author) || query.equals(getTitle())) return true;
        return false;
    }
}
