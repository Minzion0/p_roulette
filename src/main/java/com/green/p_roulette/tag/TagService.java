package com.green.p_roulette.tag;

import com.green.p_roulette.tag.model.TagDto;
import com.green.p_roulette.tag.model.TagEntity;
import com.green.p_roulette.tag.model.TagInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {
    private final TagMapper mapper;
    public List<TagDto> postTag(TagInsDto dto) {
        TagEntity entity = new TagEntity();
        List<TagDto> list=new ArrayList<>();

        String tag = dto.getTag();
        String[] array = tag.split(" ");
        for (int i = 0; i < array.length; i++) {
            TagDto tagDto = new TagDto();
            entity.setTag(array[i]);
            Long result = mapper.findTag(entity);
            if (result == null){
                mapper.insTag(entity);
                result = entity.getItag();
                tagDto.setItag(result);
                list.add(tagDto);
            }else{
                tagDto.setItag(result);
                list.add(tagDto);
            }


        }
        return list;
    }
}