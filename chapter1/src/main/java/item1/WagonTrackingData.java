package item1;

public class WagonTrackingData {

    private String currentLocation;

    private String originLocation;

    private String destinationLocation;

    public WagonTrackingData(String currentLocation, String originLocation, String destinationLocation) {
        this.currentLocation = currentLocation;
        this.originLocation = originLocation;
        this.destinationLocation = destinationLocation;
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

    @Override
    public String toString() {
        return "WagonTrackingData{" +
                "currentLocation='" + currentLocation + '\'' +
                ", originLocation='" + originLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                '}';
    }
}
