package models;

import java.util.Date;

public class Booking {
    private String codeBooking ;
    private Date startDate ;
    private Date enddate;

    public Booking(String codeBooking, Date startDate, Date enddate) {
        this.codeBooking = codeBooking;
        this.startDate = startDate;
        this.enddate = enddate;
    }
}
