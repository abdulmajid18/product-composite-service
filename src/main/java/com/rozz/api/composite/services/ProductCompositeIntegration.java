package com.rozz.api.composite.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rozz.api.composite.product.Product;
import com.rozz.api.composite.product.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductCompositeIntegration implements ProductService {
    private final ObjectMapper mapper;
    private final RestTemplate restTemplate;

    private final String productServiceUrl;

    public ProductCompositeIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${app.product-service.host}")
            String productServiceHost,

            @Value("${app.product-service.port}")
            int productServicePort )
    {
        this.restTemplate = restTemplate;
        this.mapper = mapper;
        productServiceUrl = "http://" + productServiceHost + ":" +
                productServicePort + "/product/";
    }

    @Override
    public Product getProduct(int productId) {
        String url = productServiceUrl + productId;
        return restTemplate.getForObject(url, Product.class);
    }
}
