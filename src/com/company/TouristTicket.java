package com.company;

public class TouristTicket {
    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];

    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    String[] getSelectedTouristLocation(){
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
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
