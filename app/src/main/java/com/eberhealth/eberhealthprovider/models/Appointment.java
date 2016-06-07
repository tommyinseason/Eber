package com.eberhealth.eberhealthprovider.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by owner on 6/6/16.
 */
public class Appointment {
    String appointmentID;
    String patientID;
    String nurseID;
    String healthID;
    Date appointmentDate;
    String paymentID;
    String stateOfAppointment;
    Time appointmentStartTime;
    Time appointmentEndTime;
    Long appointmentLatitude;
    Long appointmentLongitude;
    List<String> healthDetails = new ArrayList<>();
    Integer appointmentNotification;

    public Appointment() {}


    public Appointment(String appointmentID, String patientID, String nurseID, String healthID, Date appointmentDate, String paymentID, String stateOfAppointment, Time appointmentStartTime, Time appointmentEndTime, Long appointmentLatitude, Long appointmentLongitude, ArrayList<String> healthDetails, Integer appointmentNotification) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.nurseID = nurseID;
        this.healthID = healthID;
        this.appointmentDate = appointmentDate;
        this.paymentID = paymentID;
        this.stateOfAppointment = stateOfAppointment;
        this.appointmentStartTime = appointmentStartTime;
        this.appointmentEndTime = appointmentEndTime;
        this.appointmentLatitude = appointmentLatitude;
        this.appointmentLongitude = appointmentLongitude;
        this.healthDetails = healthDetails;
        this.appointmentNotification = appointmentNotification;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public String getHealthID() {
        return healthID;
    }

    public void setHealthID(String healthID) {
        this.healthID = healthID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getStateOfAppointment() {
        return stateOfAppointment;
    }

    public void setStateOfAppointment(String stateOfAppointment) {
        this.stateOfAppointment = stateOfAppointment;
    }

    public Time getAppointmentStartTime() {
        return appointmentStartTime;
    }

    public void setAppointmentStartTime(Time appointmentStartTime) {
        this.appointmentStartTime = appointmentStartTime;
    }

    public Time getAppointmentEndTime() {
        return appointmentEndTime;
    }

    public void setAppointmentEndTime(Time appointmentEndTime) {
        this.appointmentEndTime = appointmentEndTime;
    }

    public Long getAppointmentLatitude() {
        return appointmentLatitude;
    }

    public void setAppointmentLatitude(Long appointmentLatitude) {
        this.appointmentLatitude = appointmentLatitude;
    }

    public Long getAppointmentLongitude() {
        return appointmentLongitude;
    }

    public void setAppointmentLongitude(Long appointmentLongitude) {
        this.appointmentLongitude = appointmentLongitude;
    }

    public List<String> getHealthDetails() {
        return healthDetails;
    }

    public void setHealthDetails(List<String> healthDetails) {
        this.healthDetails = healthDetails;
    }

    public Integer getAppointmentNotification() {
        return appointmentNotification;
    }

    public void setAppointmentNotification(Integer appointmentNotification) {
        this.appointmentNotification = appointmentNotification;
    }
}
