package phil.poc.springbootsqlite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import phil.poc.springbootsqlite.services.ProductService;
import phil.poc.springbootsqlite.services.dtos.CounterOffer;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("makeOffer")
    public CounterOffer makeOffer(@RequestParam final long productId, @RequestParam final int offerPrice) {
        return productService.makeOffer(productId, offerPrice);
    }
}
