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

    public String getCodeBooking() {
        return codeBooking;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
