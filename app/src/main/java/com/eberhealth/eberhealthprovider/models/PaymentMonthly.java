package com.eberhealth.eberhealthprovider.models;

/**
 * Created by owner on 6/6/16.
 */
public class PaymentMonthly {
    String nurseID;
    String paypalAccountNumber;
    Float money;
    String paypalConfirmation;

    public PaymentMonthly () {}


    public PaymentMonthly(String nurseID, String paypalAccountNumber, Float money, String paypalConfirmation) {
        this.nurseID = nurseID;
        this.paypalAccountNumber = paypalAccountNumber;
        this.money = money;
        this.paypalConfirmation = paypalConfirmation;
    }


    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public String getPaypalAccountNumber() {
        return paypalAccountNumber;
    }

    public void setPaypalAccountNumber(String paypalAccountNumber) {
        this.paypalAccountNumber = paypalAccountNumber;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getPaypalConfirmation() {
        return paypalConfirmation;
    }

    public void setPaypalConfirmation(String paypalConfirmation) {
        this.paypalConfirmation = paypalConfirmation;
    }

}
