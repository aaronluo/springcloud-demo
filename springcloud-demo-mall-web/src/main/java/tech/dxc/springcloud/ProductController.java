package tech.dxc.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Product> list(){
        return this.productService.findAll();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/{itemCode}")
    public Product detail(@PathVariable String itemCode) {
        return this.productService.loadByItemCode(itemCode);
    }
}
