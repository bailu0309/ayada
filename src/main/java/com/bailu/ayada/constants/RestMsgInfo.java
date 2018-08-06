package com.bailu.ayada.constants;

public enum RestMsgInfo {

    GOOD("正常", "1000"), W_YID("YID错误", "1001"), W_PARAMS("参数错误", "1002"), W_NP("账号或密码错误", "1003"),
    W_SERVER("服务器出错或异常", "1004"), W_UNLOGIN("未登录", "1005"),;

    private String name;
    private String id;

    RestMsgInfo(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
