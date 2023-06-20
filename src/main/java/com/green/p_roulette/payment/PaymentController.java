package com.green.p_roulette.payment;

import com.green.p_roulette.payment.model.PaymentEntity;
import com.green.p_roulette.payment.model.PaymentInsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "유저 지출")
@RequiredArgsConstructor
@RequestMapping("/roulette/payment")
public class PaymentController {
    private final PaymentService service;

    @Operation(summary = "소비등록")
    @PostMapping
    public Long postPayment(@RequestBody PaymentInsDto dto){
        Long result = service.insPayment(dto);
        if (result>0L){
            return result;
        }
        return 0L;
        //0이면 유저의 이달의 management 설정X
    }
}
