package com.dp.designPatterns.strategy.domain;

import java.util.List;

public interface ItemStrategy {
    List<? extends Item> getItemList();
}
