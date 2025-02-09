package com.dp.designPatterns.strategy.context;

import com.dp.designPatterns.strategy.domain.Item;
import com.dp.designPatterns.strategy.domain.ItemStrategy;
import com.dp.designPatterns.strategy.domain.ItemStrategyEng;
import com.dp.designPatterns.strategy.domain.ItemStrategyKor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

public class ItemContext {

    @Getter
    @RequiredArgsConstructor
    private enum ItemEnum {
        E("e")
        , K("k")
        ;
        private final String language;
    }

    private static ItemStrategy getStrategy(ItemEnum e) {
        return switch (e) {
            case E -> new ItemStrategyEng();
            case K -> new ItemStrategyKor();
        };
    }

    public static List<? extends Item> getItemList(final String paramLanguage) {
        return Arrays.stream(ItemEnum.values())
                .filter(e -> e.getLanguage().equals(paramLanguage))
                .findFirst()
                .map(ItemContext::getStrategy)
                .orElseGet(() -> getStrategy(ItemEnum.E)) //디폴트
                .getItemList();
    }
}
