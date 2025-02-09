package com.dp.designPatterns.strategy.domain;

import java.util.List;

public class ItemStrategyEng implements ItemStrategy {
    private final List<ItemEng> items = List.of(
            ItemEng.builder()
                    .list1(List.of("ABC", "DEF"))
                    .list2(List.of("GHI", "JKL"))
                    .cCase(true)
                    .build()
            , ItemEng.builder()
                    .list1(List.of("abc", "def"))
                    .list2(List.of("ghi", "jkl"))
                    .cCase(false)
                    .build()
    );

    @Override
    public List<? extends Item> getItemList() {
        return this.items;
    }
}
