package tech.dxc.springcloud;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceFallback implements ProductService {

    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(String itemCode) {
        return new Product("error", "未知", "TwoStepsFromJava-Fallback", 0);
    }

}
