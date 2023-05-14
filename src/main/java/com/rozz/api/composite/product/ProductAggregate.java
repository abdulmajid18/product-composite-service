package com.rozz.api.composite.product;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductAggregate {
    private  int productId;
    private  String name;
    private  int weight;
    private   String serviceAddress;
}

