package com.dp.designPatterns.strategy.controller;

import ch.qos.logback.core.util.StringUtil;
import com.dp.designPatterns.strategy.domain.Item;
import com.dp.designPatterns.strategy.service.ItemService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/list")
    public String getItemList() throws JsonProcessingException {
        List<? extends Item> rtnList = itemService.getItemList("e");
        return new ObjectMapper().writeValueAsString(rtnList);
    }

    @GetMapping("/list/{paramLanguage}")
    public String getItemList(@PathVariable final String paramLanguage) throws JsonProcessingException {
        List<? extends Item> rtnList = itemService.getItemList(StringUtil.isNullOrEmpty(paramLanguage) ? "e" : paramLanguage);
        return new ObjectMapper().writeValueAsString(rtnList);
    }

}
