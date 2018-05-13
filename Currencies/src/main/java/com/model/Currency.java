/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author SirOncel
 */
public class Currency {

    private String name;
    private String fullName;
    private String code;
    private double selling;
    private double buying;
    private double changeRate;
    private int currency;
    private long updateDate;

    public Currency() {
    }

    public Currency(String name, String fullName, String code, double selling, double buying, double changeRate, int currency, long updateDate) {
        this.name = name;
        this.fullName = fullName;
        this.code = code;
        this.selling = selling;
        this.buying = buying;
        this.changeRate = changeRate;
        this.currency = currency;
        this.updateDate = updateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSelling() {
        return selling;
    }

    public void setSelling(double selling) {
        this.selling = selling;
    }

    public double getBuying() {
        return buying;
    }

    public void setBuying(double buying) {
        this.buying = buying;
    }

    public double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(double changeRate) {
        this.changeRate = changeRate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(long updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Currency{" + "name=" + name + ", fullName=" + fullName + ", code=" + code + ", selling=" + selling + ", buying=" + buying + ", changeRate=" + changeRate + ", currency=" + currency + ", updateDate=" + updateDate + '}';
    }

}
