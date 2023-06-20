package com.green.p_roulette.user;

import com.green.p_roulette.user.model.UserEntity;
import com.green.p_roulette.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;
    public Long postUser(UserInsDto dto){
        UserEntity entity = new UserEntity();
        entity.setName(dto.getName());
        Long result = mapper.findUser(entity);
        if (result == null){
            mapper.insUser(entity);
            return entity.getIuser();
        }else
            return result;
    }
}
