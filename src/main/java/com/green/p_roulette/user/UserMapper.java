package com.green.p_roulette.user;

import com.green.p_roulette.user.model.UserEntity;
import com.green.p_roulette.user.model.UserInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserEntity entity);
    Long findUser(UserEntity entity);
}
