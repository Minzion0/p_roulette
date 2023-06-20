package com.green.p_roulette.management;

import com.green.p_roulette.management.model.ManagementInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roulette/management")
public class ManagementController {
    private final ManagementService service;

    @PostMapping
    public int setMonthLimit(@RequestBody ManagementInsDto dto){
        return service.setMonthManagement(dto);
    }
}
