package com.green.p_roulette.management;

import com.green.p_roulette.management.model.ManagementEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagementMapper {
    int setMonthManagement(ManagementEntity entity);
}
