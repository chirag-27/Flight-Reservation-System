package com.company;

public class TouristTicket {
    String hotelAddress;
    String[] selectedTouristLocation = new String[5];

    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    String getHotelAddress(){
        return hotelAddress;
    }
    String[] getTouristLocation(){
        return selectedTouristLocation;
    }
    void removeTouristLocation(String location){
        for (int i=0; i<selectedTouristLocation.length; i++){
            if(selectedTouristLocation[i].equals(location))
                selectedTouristLocation[i] = null;
        }
    }
    void addTouristLocation(String location){
        for (int i=0; i<selectedTouristLocation.length; i++){
            if(selectedTouristLocation[i] == null)
                selectedTouristLocation[i] = location;
        }
    }
}
