package com.dp.designPatterns.strategy.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class ItemEng extends Item {

    //대소문자 구분
    private boolean cCase;

    @Builder
    public ItemEng(List<String> list1, List<String> list2, boolean cCase) {
        super(list1, list2);
        this.cCase = cCase;
    }
}
