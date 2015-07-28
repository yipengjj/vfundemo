package com.lesson.bill.syncimagedemo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/7/27.
 */
public class ResponseValue implements Serializable {
    private String status;

    private List<NewsBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<NewsBean> getData() {
        return data;
    }

    public void setData(List<NewsBean> data) {
        this.data = data;
    }
}
