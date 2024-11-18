package com.zhujun.learnspringboot;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;


@Slf4j
@Builder
@Data
public class CmowerLombok {
    @Getter @Setter private int age;
    @Getter private String name;
    @Setter private BigDecimal money;

    public static void main(String[] args) {
        CmowerLombok demo = CmowerLombok.builder().age(1).name("cmower").money(new BigDecimal(100)).build();
        System.out.printf(demo.toString());
    }
}
