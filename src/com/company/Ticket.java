package com.company;

public class Ticket {
    String pnr;
    String from;
    String to;
    Flight flight;
    String departureDateTime, arrivalDateTime;
    Passenger passenger;
    String seatNo;
    float price;
    boolean cancelled;

    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime,
                  String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
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
