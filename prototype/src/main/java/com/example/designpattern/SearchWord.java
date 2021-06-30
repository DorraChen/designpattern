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
    private long lastUpdateTime;
}
