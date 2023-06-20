package com.green.p_roulette.user;

import com.green.p_roulette.user.model.UserInsDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping
    @Operation(summary = "유저 생성")
    public Long postUser(@RequestBody UserInsDto dto){
        return service.postUser(dto);
    }

}
