package com.enbuys.pojo;

/**
 * @Author: Pace
 * @Data: 2019/3/22 14:31
 * @Version: v1.0
 * 依赖测试bean
 */
public class Wheel {

    private String brand;
    private String specification ;

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getBrand() {

        return brand;
    }

    public String getSpecification() {
        return specification;
    }
}
