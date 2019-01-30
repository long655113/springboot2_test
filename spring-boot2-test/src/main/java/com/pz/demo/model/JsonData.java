/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pz.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author long655113
 */
public class JsonData {

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
    private String str;
    private Integer integer;
    private Double Double;
    private char[] chars;
    private List<JsonDataItem> item;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getDouble() {
        return Double;
    }

    public void setDouble(Double Double) {
        this.Double = Double;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public List<JsonDataItem> getItem() {
        return item;
    }

    public void setItem(List<JsonDataItem> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "JsonData{" + "date=" + date + ", str=" + str + ", integer=" + integer + ", Double=" + Double + ", chars=" + chars + ", item=" + item + '}';
    }

}
