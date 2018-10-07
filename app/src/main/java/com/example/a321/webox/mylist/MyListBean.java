package com.example.a321.webox.mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyListBean {

    private String id;
    private String message;
    private String time;
    private List<Map<String,Object>>  list = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Map<String,Object>> getList() {
        return list;
    }

    public void setList(List<Map<String,Object>> list) {
        this.list = list;
    }
}
