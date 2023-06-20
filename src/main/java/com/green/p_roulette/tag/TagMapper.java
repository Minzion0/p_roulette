package com.green.p_roulette.tag;

import com.green.p_roulette.tag.model.TagEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagMapper {
    Long insTag(TagEntity entity);
    Long findTag(TagEntity entity);
}
