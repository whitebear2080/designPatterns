package com.dp.designPatterns.strategy.service;

import com.dp.designPatterns.strategy.context.ItemContext;
import com.dp.designPatterns.strategy.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public List<? extends Item> getItemList(final String paramLanguage) {
        return ItemContext.getItemList(paramLanguage);
    }
}
