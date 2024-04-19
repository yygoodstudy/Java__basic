package com.yy.java8.lambda_pro;

import java.util.List;

/**
 * @date 2023/6/11
 */
public class Author {

    private Long id;
    private String name; // 姓名
    private Integer age; // 年龄
    private String intro; // 简介
    private List<Book> books; // 作品

    public Author(Long id, String name, Integer age, String intro, List<Book> books) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.intro = intro;
        this.books = books;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
