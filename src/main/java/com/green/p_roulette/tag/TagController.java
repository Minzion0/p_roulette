package com.green.p_roulette.tag;

import com.green.p_roulette.tag.model.TagDto;
import com.green.p_roulette.tag.model.TagInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo/tag")
@RequiredArgsConstructor
public class TagController {
    private final TagService service;
    @PostMapping
    public List<TagDto> postTag(@RequestBody TagInsDto dto){
        return service.postTag(dto);
    }

}
