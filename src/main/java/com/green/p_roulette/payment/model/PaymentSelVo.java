package com.green.p_roulette.payment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentSelVo {
    private Long ipayment;
    private String name;
    private String menu;
    private String paymentAt;
}
