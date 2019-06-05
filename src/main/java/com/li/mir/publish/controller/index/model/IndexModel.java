package com.li.mir.publish.controller.index.model;

/**
 * Created by lining on 2019/6/5.
 *
 * @author lining
 * @date 2019/06/05
 */
public class IndexModel {
    private Long id;
    /**
     * 开服名称
     */
    private String name;
    /**
     * 开服时间
     */
    private String openTime;
    /**
     * 描述
     */
    private String desc;

    private String url;

    /**
     * qq
     */
    private String qqNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }
}
