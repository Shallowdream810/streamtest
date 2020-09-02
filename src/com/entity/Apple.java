package com.entity;

/**
 * @Author GHH
 * @Date 2020/9/1 15:00
 * @description:
 * @Version 1.0
 */
public class Apple {
    private Integer id;
    private String color;
    private String addr;
    private Long weight;

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Apple(Integer id, String color, String addr, Long weight) {
        this.id = id;
        this.color = color;
        this.addr = addr;
        this.weight = weight;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", addr='" + addr + '\'' +
                ", weight=" + weight +
                '}';
    }
}
