package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCTDATASERVICE")
public interface ProductClinentFeign {
    @GetMapping("products")
    public List<Product> listProdcuts();
}
