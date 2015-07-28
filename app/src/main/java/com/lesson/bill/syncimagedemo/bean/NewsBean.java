package com.lesson.bill.syncimagedemo.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/7/27.
 */
public class NewsBean implements Serializable{


    private long id;

    private String name;

    private String picSmall;

    private String picBig;

    private String description;

    private long learner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPicBig() {
        return picBig;
    }

    public void setPicBig(String picBig) {
        this.picBig = picBig;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getLearner() {
        return learner;
    }

    public void setLearner(long learner) {
        this.learner = learner;
    }
}
