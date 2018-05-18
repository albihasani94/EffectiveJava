package chapter1.item1;


public class Application {

    public static void main(String[] args) {
        //It is harder to know the parameters order
        WagonTrackingData wagonTrackingDataViaConstructor = new WagonTrackingData("testdest", "testOrigin", "testCurrent");

        //It is now easier to describe the parameters order in the name of the static factory method
        WagonTrackingData wagonTrackingDataViaStaticFactory = WagonTrackingData.ofCurrentAndOriginAndDestinationLocation("tirane", "sarande", "Mars");

        System.out.println(wagonTrackingDataViaConstructor);
        System.out.println(wagonTrackingDataViaStaticFactory);

    }
}
