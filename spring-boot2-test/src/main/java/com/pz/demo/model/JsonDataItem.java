/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pz.demo.model;

/**
 *
 * @author long655113
 */
public class JsonDataItem {

    private String date;
    private Integer integer;
    private Double Double;
    private char[] chars;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "JsonDataItem{" + "date=" + date + ", integer=" + integer + ", Double=" + Double + ", chars=" + chars + '}';
    }

}
