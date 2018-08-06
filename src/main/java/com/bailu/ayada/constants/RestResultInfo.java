package com.bailu.ayada.constants;

/**
 * Created by bailu on 2017/9/13.
 */
public class RestResultInfo {
    private boolean success;
    private String result;
    private String info;
    private String id;



    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
