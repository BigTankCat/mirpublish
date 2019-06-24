package com.li.mir.publish.controller.publish;

import javax.servlet.http.HttpServletRequest;

import com.li.mir.publish.controller.index.vo.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019-6-23.
 *
 * @author Administrator
 * @date 2019/06/23
 */
@RestController
public class publish {

    @RequestMapping("/publish/add")
    public PageResult<Long> like(HttpServletRequest httpServletRequest) {
        String id = httpServletRequest.getParameter("body");
        return new PageResult(10L);
    }

}
