package com.green.p_roulette.management;

import com.green.p_roulette.management.model.ManagementEntity;
import com.green.p_roulette.management.model.ManagementInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ManagementService {
    private final ManagementMapper mapper;
    private LocalDate now = LocalDate.now();
    private String  year = String.valueOf(now.getYear());
    private int month = now.getMonthValue();

    public int setMonthManagement(ManagementInsDto dto){
        ManagementEntity entity = new ManagementEntity();
        entity.setMonth(month);
        entity.setYear(year);
        entity.setIuser(dto.getIuser());
        entity.setMonthLimit(dto.getMontLimit());
        return mapper.setMonthManagement(entity);
    }
}
