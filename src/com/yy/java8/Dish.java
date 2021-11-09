package com.yy.java8;

/**
 * 菜肴
 *
 * @author Administrator
 */
public class Dish {

    private String name; // 菜品名
    private double caloric; // 热量;
    private boolean vegetable; // 是否素菜？

    public Dish(String name, double caloric, boolean vegetable) {
        super();
        this.name = name;
        this.caloric = caloric;
        this.vegetable = vegetable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCaloric() {
        return caloric;
    }

    public void setCaloric(double caloric) {
        this.caloric = caloric;
    }

	public boolean isVegetable() {
		return vegetable;
	}

	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}

	@Override
	public String toString() {
		return "Dish{" +
				"name='" + name + '\'' +
				", caloric=" + caloric +
				", vegetable=" + vegetable +
				'}';
	}

}
