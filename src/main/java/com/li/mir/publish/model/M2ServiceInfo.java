package com.li.mir.publish.model;

import java.util.Date;

/**
 * Created by lining on 2019/6/5.
 *
 * @author lining
 * @date 2019/06/05
 */
public class M2ServiceInfo {

    private Long id;
    /**
     * 开服名称
     */
    private String name;
    /**
     * 开服时间
     */
    private Date openTime;
    /**
     * 描述
     */
    private String desc;

    /**
     * url
     */
    private String url;

    /**
     * qq
     */
    private String qqNum;

    /**
     * 开服的管理员id
     */
    private Long serviceMasterUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public Long getServiceMasterUserId() {
        return serviceMasterUserId;
    }

    public void setServiceMasterUserId(Long serviceMasterUserId) {
        this.serviceMasterUserId = serviceMasterUserId;
    }
}
