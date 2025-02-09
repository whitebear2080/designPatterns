package com.dp.designPatterns.strategy.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class ItemKor extends Item {

    @Builder
    public ItemKor(List<String> list1, List<String> list2) {
        super(list1, list2);
    }
}
