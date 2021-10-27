package com.example.designpattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dorra
 * @date 2021/05/30 23:03
 * @description
 */
@Setter
@Getter
public class SearchWord {
    private String keyword;
    private int count;
    private long lastUpdateTime;

    public SearchWord(String keyword, int count, long lastUpdateTime) {
        this.keyword = keyword;
        this.count = count;
        this.lastUpdateTime = lastUpdateTime;
    }
}
