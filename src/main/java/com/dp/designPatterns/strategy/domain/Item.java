package com.dp.designPatterns.strategy.domain;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class Item {
    private final List<String> list1;
    private final List<String> list2;

    public Item(List<String> list1, List<String> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }
}
