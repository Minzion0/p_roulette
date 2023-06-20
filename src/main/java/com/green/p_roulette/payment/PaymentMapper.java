package com.green.p_roulette.payment;

import com.green.p_roulette.payment.model.PaymentEntity;
import com.green.p_roulette.payment.model.PaymentInsDto;
import com.green.p_roulette.payment.model.PaymentSelVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    int insPayment(PaymentEntity entity);
    PaymentSelVo getUserMonthPayment();
}
