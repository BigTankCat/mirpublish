package com.li.mir.publish.model;

/**
 * Created by lining on 2019/6/5.
 *
 * @author lining
 * @date 2019/06/05
 */
public class M2User {
    private Long userId;
    /**
     * 用户名
     */
    private String nick;
    /**
     * 密码
     */
    private String passWord;

    /**
     * qq号
     */
    private String qqNum;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
