package com.li.mir.publish.dal.mapper;

import com.li.mir.publish.model.M2User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by lining on 2019/6/5.
 *
 * @author lining
 * @date 2019/06/05
 */
@Mapper
public interface M2UserMapper {
    /**
     * @param id
     * @return
     */
    M2User selectByUserId(Long id);
}
