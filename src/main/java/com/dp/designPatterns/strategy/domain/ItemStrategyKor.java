package com.dp.designPatterns.strategy.domain;

import java.util.List;

public class ItemStrategyKor implements ItemStrategy {
    private final List<ItemKor> items = List.of(
            ItemKor.builder()
                    .list1(List.of("가나다", "라마바"))
                    .list2(List.of("사아자", "차카타"))
                    .build()
            , ItemKor.builder()
                    .list1(List.of("아야", "어여"))
                    .list2(List.of("오요", "우유"))
                    .build()
    );

    @Override
    public List<? extends Item> getItemList() {
        return this.items;
    }
}
