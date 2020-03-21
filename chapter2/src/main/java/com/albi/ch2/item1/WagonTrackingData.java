package com.albi.ch2.item1;

public class WagonTrackingData {

    private String currentLocation;
    private String originLocation;
    private String destinationLocation;

    public static WagonTrackingData ofCurrentAndOriginAndDestinationLocation(String currentLocation, String originLocation, String destinationLocation) {
        WagonTrackingData wagonTrackingData = new WagonTrackingData();
        wagonTrackingData.currentLocation = currentLocation;
        wagonTrackingData.originLocation = originLocation;
        wagonTrackingData.destinationLocation = destinationLocation;
        return wagonTrackingData;
    }

    public static WagonTrackingData ofCurrentLocation(String currentLocation) {
        WagonTrackingData wagonTrackingData = new WagonTrackingData();
        wagonTrackingData.currentLocation = currentLocation;
        return wagonTrackingData;
    }

    @Override
    public String toString() {
        return "WagonTrackingData{" +
                "currentLocation='" + currentLocation + '\'' +
                ", originLocation='" + originLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                '}';
    }
}
