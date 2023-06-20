package com.green.p_roulette.tag;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo/tag")
@RequiredArgsConstructor
public class TagController {
    private final TagService service;

}
