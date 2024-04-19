package com.yy.java8.demo;

import java.math.BigDecimal;

/**
 * @date 2023/8/17
 */

public class Book {
    private String type;
    private String bookName;
    private BigDecimal price;

    public Book(String bookName, BigDecimal price, String type) {
        this.bookName = bookName;
        this.price = price;
        this.type = type;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
