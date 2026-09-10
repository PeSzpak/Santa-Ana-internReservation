package com.restaurante.reservas.model;


public class Reservation {
    private String id;
    private String date;
    private String time;
    private TimeSlot timeSlot;
    private Salon salon;
    private int guests;
    private String clientName;
    private String clientPhone;

    public Reservation() {
    }

    public Reservation(String id, String date, String time, Salon salon, int guests, String clientName, String clientPhone) {
        this.id = id;
        this.date = date;
        this.salon = salon;
        this.guests = guests;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        setTime(time);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
        this.timeSlot = TimeSlot.fromTime(time);
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }


    @Override
    public String toString() {
        return clientName + " · " + guests + " pessoas ·" + time + " · " + salon.getDisplayName();
    }
}