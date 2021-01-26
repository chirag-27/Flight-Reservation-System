package com.company;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime, arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

    private Passenger[] passenger;
    private Flight[] flight;


    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Passenger[] getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger[] passenger) {
        this.passenger = passenger;
    }

    public Flight[] getFlight() {
        return flight;
    }

    public void setFlight(Flight[] flight) {
        this.flight = flight;
    }

    public Ticket(String pnr, String from, String to, String departureDateTime,
                  String arrivalDateTime, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = new Flight[100];
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger =new Passenger[100];
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public Passenger fetchPassengerById(int id) {
        for (Passenger passenger: passenger) {
            if (passenger.getId() == id) {
                return passenger;
            }
        }
        return null;
    }


    String getTicketDetails(){
        return " pnr:" + pnr + " From:" + from + " To:" +to+ " Departure date time:"+ departureDateTime+ " Arrival Date time:" + arrivalDateTime+ " Seat No. :"+ seatNo +
                " Price:" + price;
    }


    String checkStatus(){
        if (!cancelled) {
            return "Confirmed";
        } else {
            return "Cancelled";
        }
    }
    //getting flight duration
    String getFlightDuration(){
        String departureHour = ""+departureDateTime.charAt(11) + departureDateTime.charAt(12);
        String arrivalHour = ""+arrivalDateTime.charAt(11) + arrivalDateTime.charAt(12);
        String departureMinute = "" + departureDateTime.charAt(14) + departureDateTime.charAt(15);
        String arrivalMinute = "" + arrivalDateTime.charAt(14) + arrivalDateTime.charAt(15);

        int actualDepartureHour = Integer.parseInt(departureHour);
        int actualArrivalHour = Integer.parseInt(arrivalHour);
        int actualDepartureMinute = Integer.parseInt(departureMinute);
        int actualArrivalMinute = Integer.parseInt(arrivalMinute);

        int diffMinute;
        int diffHour;

        if (actualArrivalMinute < actualDepartureMinute){
            actualArrivalMinute = actualArrivalMinute + 60;
            diffMinute = actualArrivalMinute - actualDepartureMinute;
            actualArrivalHour = actualArrivalHour - 1;
            if(actualArrivalHour < actualDepartureHour){
                actualArrivalHour = actualArrivalHour + 24;
                diffHour = actualArrivalHour - actualDepartureHour;
            } else{
                diffHour = actualArrivalHour - actualDepartureHour;
            }
        }else{
            diffMinute = actualArrivalMinute - actualDepartureMinute;
            if(actualArrivalHour < actualDepartureHour){
                actualArrivalHour = actualArrivalHour + 24;
                diffHour = actualArrivalHour - actualDepartureHour;
            } else{
                diffHour = actualArrivalHour - actualDepartureHour;
            }
        }

        return diffHour + "hr" + diffMinute + "min";
    }

    void cancel(){
        cancelled = true;
    }
}
