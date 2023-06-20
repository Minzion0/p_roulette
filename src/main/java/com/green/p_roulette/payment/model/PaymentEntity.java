package com.green.p_roulette.payment.model;

import lombok.Data;

@Data
public class PaymentEntity {
    private Long ipayment;
    private Long iuserMenu;
    private Long imanagement;
    private int remainderBalance;
    private int paymentAt;
    private int currentMenuPrice;
}
