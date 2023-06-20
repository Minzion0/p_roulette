package com.green.p_roulette.payment;

import com.green.p_roulette.management.ManagementMapper;
import com.green.p_roulette.payment.model.PaymentEntity;
import com.green.p_roulette.payment.model.PaymentInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentMapper mapper;
    private final ManagementMapper managementMapper;

    public Long insPayment(PaymentInsDto dto){
        Long userManagement = managementMapper.findUserManagement(dto.getIuser());
        if (userManagement==null){
            return 0L;
        }
        PaymentEntity entity = new PaymentEntity();
        entity.setIuserMenu(dto.getIuserMenu());
        entity.setImanagement(userManagement);
         mapper.insPayment(entity);
        return entity.getIpayment();
    }
}
