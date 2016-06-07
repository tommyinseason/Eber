package com.eberhealth.eberhealthprovider.models;

/**
 * Created by owner on 6/6/16.
 */
public class AppointmentNurseLocation {
    String appointmentID;
    Long appointmentNurseLongitude;
    Long appointmentNuresLatitude;

    public AppointmentNurseLocation() {}

    public AppointmentNurseLocation(String appointmentID, Long appointmentNurseLongitude, Long appointmentNuresLatitude) {
        this.appointmentID = appointmentID;
        this.appointmentNurseLongitude = appointmentNurseLongitude;
        this.appointmentNuresLatitude = appointmentNuresLatitude;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Long getAppointmentNurseLongitude() {
        return appointmentNurseLongitude;
    }

    public void setAppointmentNurseLongitude(Long appointmentNurseLongitude) {
        this.appointmentNurseLongitude = appointmentNurseLongitude;
    }

    public Long getAppointmentNuresLatitude() {
        return appointmentNuresLatitude;
    }

    public void setAppointmentNuresLatitude(Long appointmentNuresLatitude) {
        this.appointmentNuresLatitude = appointmentNuresLatitude;
    }
}
