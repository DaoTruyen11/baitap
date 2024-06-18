package com.app.MediQuirk.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.app.MediQuirk.services.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/admin")
    public String Admin(){

        return "Admin/index";
    }
    @RequestMapping("/profile")
    public String Profile(){

        return "Admin/category";
    }
    @GetMapping("/profile")
    public String showProductList(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "Admin/categories/category-list";
    }
}
