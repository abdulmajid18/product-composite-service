package com.rozz.api.composite.services;

import com.rozz.api.composite.product.Product;
import com.rozz.api.composite.product.ProductAggregate;
import com.rozz.api.composite.util.ServiceUtil;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCompositeServiceImpl implements ProductCompositeService{
    private final ProductCompositeIntegration  integration;
    private final ServiceUtil serviceUtil;

    public ProductCompositeServiceImpl(ServiceUtil serviceUtil,
                                       ProductCompositeIntegration integration) {
        this.serviceUtil = serviceUtil;
        this.integration = integration;
    }

        @Override
    public ProductAggregate getProduct(int productId) {
       Product product = integration.getProduct(productId);
       return ProductAggregate.builder()
               .productId(product.getProductId())
               .name(product.getName())
               .weight(product.getWeight())
               .serviceAddress(serviceUtil.getServiceAddress())
               .build();

    }
}
