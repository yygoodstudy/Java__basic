package com.yy.gather;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Date 2021/10/14 21:58
 */
public class CollectionIterator {

    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("Java编程与思想", "Bruce Eckel", 99.00));
        col.add(new Book("Spring实战", "Craig Walls", 88.00));
        col.add(new Book("深入浅出MySQL", "kissa Ld", 100.00));

        Iterator it = col.iterator();

        while (it.hasNext()) { // 判断是否还有数据
            Object obj = it.next(); // 返回下一个数据
            System.out.println("obj = " + obj);
        }
        // 循环走完时，指向元素的游标已经在最末尾了
//        Object next = it.next(); // Exception in thread "main" java.util.NoSuchElementException
//        System.out.println("next = " + next);

    }
}

class Book {
    private String name;
    private String author;
    private Double price;

    public Book(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}