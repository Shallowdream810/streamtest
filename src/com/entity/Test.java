package com.entity;

import java.util.List;

public class Test {
    private String date;
    private List<Apple> apples;

    @Override
    public String toString() {
        return "Test{" +
                "date='" + date + '\'' +
                ", apples=" + apples +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Apple> getApples() {
        return apples;
    }

    public void setApples(List<Apple> apples) {
        this.apples = apples;
    }
}
