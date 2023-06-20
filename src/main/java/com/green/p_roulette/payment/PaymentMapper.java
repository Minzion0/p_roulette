package com.green.p_roulette.payment;

import com.green.p_roulette.payment.model.PaymentInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    int insPayment(PaymentInsDto dto);

}
