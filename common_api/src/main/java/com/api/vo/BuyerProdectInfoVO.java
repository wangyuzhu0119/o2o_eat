package com.api.vo;

import lombok.Data;

import java.util.List;

@Data
public class BuyerProdectInfoVO {

    private String name;
    private String type;
    private List<FoodVO> foods ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FoodVO> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodVO> foods) {
        this.foods = foods;
    }
}
