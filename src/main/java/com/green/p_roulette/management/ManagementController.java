package com.green.p_roulette.management;

import com.green.p_roulette.management.model.ManagementEntity;
import com.green.p_roulette.management.model.ManagementInsDto;
import com.green.p_roulette.management.model.ManagementSelDto;
import com.green.p_roulette.management.model.ManagementSelVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "이달의 목표")
@RestController
@RequiredArgsConstructor
@RequestMapping("/roulette/management")
public class ManagementController {
    private final ManagementService service;
    @Operation(summary = "이달의 목표 설정")
    @PostMapping
    public int setMonthLimit(@RequestBody ManagementInsDto dto){
        return service.setMonthManagement(dto);
    }
    @Operation(summary = "목표들 불러오기")
    @GetMapping
    public List<ManagementSelVo>getUsertManagement(@RequestParam Long iuser){
        ManagementEntity entity = new ManagementEntity();
        entity.setIuser(iuser);
        return service.getUserMangement(entity);
    }
    @Operation(summary = "선택한 날의 목표 불러오기")
    @GetMapping("/{iuser}")
    public ManagementSelVo getUserMonthManagement(@PathVariable Long iuser,@RequestParam int month,@RequestParam int year){
        ManagementEntity entity = new ManagementEntity();
        entity.setMonth(month);
        entity.setYear(String.valueOf(year));
        entity.setIuser(iuser);
        return service.getUserMonthManagement(entity);
    }
}
