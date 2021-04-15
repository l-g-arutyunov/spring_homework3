package com.geekbrains.controllers;

import com.geekbrains.entity.Product;
import com.geekbrains.entity.ProductImpl;
import com.geekbrains.repository.ProductRepository;
import com.geekbrains.repository.ProductRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class AddController {
    private final ProductRepository productRepository;

    @PostMapping("create")
    public String addHtml(@NotNull ProductImpl ProductImpl) {
        productRepository.addProduct(ProductImpl);
        return "addHtml";
    }

    @GetMapping("create")
    public String addHtmlForm(@NotNull Model model) {
        model.addAttribute("product", new ProductImpl());
        return "addHtml";
    }
}
