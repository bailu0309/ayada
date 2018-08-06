package com.bailu.ayada.constants;

public enum RestParamsInfo {

    HOSPID("hospid"), HOSPNAME("hospname"), NAME("name"), PASSWORD("password"), YID("yid"), PADID("padid");

    private String name;

    RestParamsInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
