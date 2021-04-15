package com.geekbrains.entity;

import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
public class ProductImpl implements Product{
    private int id;
    private String title;
    private int cost;

    @Override
    public String toString() {
        return "Наименование: " + title + " Артикул: " + id + " Цена: " + cost;
    }
}
