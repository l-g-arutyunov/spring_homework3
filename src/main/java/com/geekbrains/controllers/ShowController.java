package com.geekbrains.controllers;

import com.geekbrains.entity.Product;
import com.geekbrains.entity.ProductImpl;
import com.geekbrains.repository.ProductRepositoryImpl;
import javafx.print.Collation;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class ShowController {
    private final ProductRepositoryImpl productRepository;

    @GetMapping("/show")
    public String showHtml(@NotNull Model model) {
        Set<Product> products = productRepository.getProductSet();
        model.addAttribute("products", products);
        return "showHtml";
    }
}
