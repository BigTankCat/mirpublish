package com.li.mir.publish.controller.index;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;
import com.li.mir.publish.controller.index.vo.M2IndexPageVo;
import org.apache.commons.lang3.time.DateFormatUtils;
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

    @RequestMapping("/")
    public List index() {
        List<M2IndexPageVo> list = Lists.newArrayList();
        M2IndexPageVo e = new M2IndexPageVo();
        e.setId(1L);
        e.setDesc("desc");
        e.setName("name");
        e.setUrl("www.baidu.com");
        e.setOpenTime(DateFormatUtils.format(new Date(),"yyyy-MM-dd mm:HH:ss") );
        e.setQqNum("12334566");

        list.add(e);

        return list;
    }

}



