package huy.module4finaltest.controller;

import huy.module4finaltest.model.Product;
import huy.module4finaltest.model.ProductType;
import huy.module4finaltest.service.product.IProductService;
import huy.module4finaltest.service.producttype.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private IProductTypeService productTypeService;

    @GetMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        List<Product> productList = productService.findAll();
        List<ProductType> productTypeList = productTypeService.findAll();
        mv.addObject("productList", productList);
        mv.addObject("productTypeList", productTypeList);
        return mv;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView("create");
        Product product = new Product();
        mv.addObject("product", product);
        List<ProductType> productTypeList = productTypeService.findAll();
        mv.addObject("productTypeList", productTypeList);
        return mv;
    }

    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("update");
        Product product = productService.findById(id).get();
        mv.addObject("product", product);
        List<ProductType> productTypeList = productTypeService.findAll();
        mv.addObject("productTypeList", productTypeList);
        return mv;
    }

    @PostMapping
    public ModelAndView save(@ModelAttribute Product product) {
        productService.save(product);
        return new ModelAndView("redirect:/product");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("redirect:/product");
        productService.delete(productService.findById(id).get());
        return mv;
    }

    @PostMapping("/{id}")
    public ModelAndView update(@ModelAttribute Product product, @PathVariable Long id) {
        productService.save(product);
        return new ModelAndView("redirect:/product");
    }
}
