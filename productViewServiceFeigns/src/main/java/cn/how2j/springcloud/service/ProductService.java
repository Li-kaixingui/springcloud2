package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.ProductClinentFeign;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClinentFeign productClinentFeign;

    public List<Product> listProducts() {
        return productClinentFeign.listProdcuts();
    }
}
