package com.li.mir.publish.controller.index;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import com.google.common.collect.Lists;
import com.li.mir.publish.controller.index.vo.M2IndexPageVo;
import com.li.mir.publish.controller.index.vo.PageResult;
import com.li.mir.publish.dal.mapper.M2UserMapper;
import com.li.mir.publish.model.M2User;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lining on 2019/6/4.
 *
 * @author lining
 * @date 2019/06/04
 */

@RestController
public class Index {

    @Autowired
    private M2UserMapper m2UserMapper;

    @RequestMapping("/getPublishInfo")
    public PageResult<List<M2IndexPageVo>> index() {
        List<M2IndexPageVo> list = Lists.newArrayList();
        M2IndexPageVo e = new M2IndexPageVo();
        e.setId(1L);
        e.setDesc("酒鬼传奇");
        e.setName("name");
        e.setUrl("www.jiugui888.info");
        e.setOpenTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd mm:HH:ss"));
        e.setQqNum("625805992");
        list.add(e);

        //M2User m2User = m2UserMapper.selectByUserId(1L);
        //System.out.println(m2User);
        return new PageResult(list);
    }

    @RequestMapping("/publishInfo/like")
    public PageResult<Long> like(HttpServletRequest httpServletRequest) {
        String id = httpServletRequest.getParameter("body");
        return new PageResult(10L);
    }

    @RequestMapping("/publishInfo/unLike")
    public PageResult<Long> unLike() {

        return null;

    }

}



