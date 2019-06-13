package com.li.mir.publish.model;

/**
 * Created by lining on 2019/6/5.
 *
 * @author lining
 * @date 2019/06/05
 */
public class M2Vote extends CommonDalModel{
    /**
     * 投票者userid
     */
    private Long voteUserId;
    /**
     * true 顶，false 踩
     */
    private Boolean voteFlag;

    /**
     * serviceInfoId
     */
    private Long serviceInfoId;

    /**
     * 评论
     */
    private String serveceComment;

    public Long getVoteUserId() {
        return voteUserId;
    }

    public void setVoteUserId(Long voteUserId) {
        this.voteUserId = voteUserId;
    }

    public Boolean getVoteFlag() {
        return voteFlag;
    }

    public void setVoteFlag(Boolean voteFlag) {
        this.voteFlag = voteFlag;
    }

    public Long getServiceInfoId() {
        return serviceInfoId;
    }

    public void setServiceInfoId(Long serviceInfoId) {
        this.serviceInfoId = serviceInfoId;
    }

    public String getServeceComment() {
        return serveceComment;
    }

    public void setServeceComment(String serveceComment) {
        this.serveceComment = serveceComment;
    }
}
