package com.green.p_roulette.management.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ManagementSelVo {
    private Long iuser;
    private String year;
    private int month;
    private int monthLimit;
    private int balance;
    private int expense;
}
