package com.bailu.ayada.constants;

/**
 * 不良事件类型
 */
public enum AdverseType {


    PRESS("压疮事件", "1"), FAILDOWN("跌倒/坠床事件", "2"), ACCIDENT("安全管理事件", "3"), NPEXT("非计划拔管", "4"), DRUG("给药错误", "5");

    private String name;
    private String value;

    AdverseType(String name, String value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
