package chapter1.item1;

import java.time.LocalDateTime;

public class WagonTrackingData {

    private String currentLocation;

    private String destinationLocation;

    private String originLocation;

    private LocalDateTime lastStatusCheck;

    private LocalDateTime estimatedArrivalDate;

    public WagonTrackingData(String currentLocation, String originLocation, String destinationLocation) {
        this.currentLocation = currentLocation;
        this.destinationLocation = destinationLocation;
        this.originLocation = originLocation;
    }

    public WagonTrackingData(LocalDateTime lastStatusCheck, LocalDateTime estimatedArrivalDate) {
        this.lastStatusCheck = lastStatusCheck;
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public static WagonTrackingData ofCurrentAndOriginAndDestinationLocation(String currentLocation, String originLocation, String destinationLocation) {
        return new WagonTrackingData(currentLocation, originLocation, destinationLocation);
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(String originLocation) {
        this.originLocation = originLocation;
    }

    public LocalDateTime getLastStatusCheck() {
        return lastStatusCheck;
    }

    public void setLastStatusCheck(LocalDateTime lastStatusCheck) {
        this.lastStatusCheck = lastStatusCheck;
    }

    public LocalDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }
}
