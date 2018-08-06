package com.bailu.ayada.constants;

/**
 * 角色类型
 */
public enum RoleType {


    ADMIN("管理员", "20"), HOSPITAL("医疗机构", "100046"), CITYQC("市级质控", "100047"), PROVQC("省级质控", "100048");

    private String name;
    private String value;

    RoleType(String name, String value) {
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
