package com.li.mir.publish.model;

import java.util.Date;

import com.li.mir.publish.constant.PublishInfoTypeEnum;

/**
 * Created by lining on 2019/6/5.
 *
 * @author lining
 * @date 2019/06/05
 */
public class M2ServicePublishInfo extends CommonDalModel {

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
    private String description;

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

    /**
     * 好评
     */
    private Long like;

    /**
     * 差评
     */
    private Long unLike;

    /**
     * type
     */
    private PublishInfoTypeEnum type;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public PublishInfoTypeEnum getType() {
        return type;
    }

    public void setType(PublishInfoTypeEnum type) {
        this.type = type;
    }

    public Long getLike() {
        return like;
    }

    public void setLike(Long like) {
        this.like = like;
    }

    public Long getUnLike() {
        return unLike;
    }

    public void setUnLike(Long unLike) {
        this.unLike = unLike;
    }
}
