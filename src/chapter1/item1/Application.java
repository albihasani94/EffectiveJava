package chapter1.item1;


import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        WagonTrackingData wagonTrackingDataViaConstructor = new WagonTrackingData("testdest", "testOrigin", "testCurrent");
        WagonTrackingData wagonTrackingDataViaStaticFactory = WagonTrackingData.ofCurrentAndOriginAndDestinationLocation("tirane", "sarande", "Mars");

        System.out.println(wagonTrackingDataViaConstructor);
        System.out.println(wagonTrackingDataViaStaticFactory);

    }
}
