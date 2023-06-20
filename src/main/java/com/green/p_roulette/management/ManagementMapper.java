package com.green.p_roulette.management;

import com.green.p_roulette.management.model.ManagementEntity;
import com.green.p_roulette.management.model.ManagementSelDto;
import com.green.p_roulette.management.model.ManagementSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagementMapper {
    int setMonthManagement(ManagementEntity entity);
    List<ManagementSelVo> getUserMangement(ManagementEntity entity);
    ManagementSelVo getUserMonthManagement(ManagementEntity entit);
    Long findUserManagement(Long iuser);
}
