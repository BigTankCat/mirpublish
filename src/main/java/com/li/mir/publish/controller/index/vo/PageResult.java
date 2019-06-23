package com.li.mir.publish.controller.index.vo;

/**
 * Created by Administrator on 2019-6-16.
 *
 * @author Administrator
 * @date 2019/06/16
 */
public class PageResult<T> {

    public PageResult(T data) {
        this.data = data;
        this.success=true;
    }

    public PageResult(T data, String errorMessage, String errorCode) {
        this.data = data;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.success=false;
    }
    /**
     * 数据体
     */
    private T data;
    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 错误描述
     */
    private String errorMessage;

    /**
     * 错误码
     */
    private String errorCode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
