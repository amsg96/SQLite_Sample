package com.example.novinpendar.sqlite_sample;

/**
 * Created by NovinPendar on 3/10/2018.
 */

public class BookModel {


    public static final String KEY_BookId = "BookId";
    public static final String KEY_name = "name";
    public static final String KEY_price = "price";


    private int BookId;
    private String name;
    private double price;


    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
