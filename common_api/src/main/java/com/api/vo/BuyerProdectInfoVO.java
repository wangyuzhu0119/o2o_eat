package com.api.vo;

import lombok.Data;

import java.util.List;

@Data
public class BuyerProdectInfoVO {

    private String name;
    private String type;
    private List<FoodVO> foods ;

}
