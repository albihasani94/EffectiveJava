package chapter1.item1;


public class Application {

    public static void main(String[] args) {

        //It is harder to know the parameters order
        WagonTrackingData wagonTrackingDataViaConstructor = new WagonTrackingData("testdest", "testOrigin", "testCurrent");

        //It is now easier to describe the parameters order in the name of the static factory method
        WagonTrackingData wagonTrackingDataViaStaticFactory = WagonTrackingData.ofCurrentAndOriginAndDestinationLocation("tirane", "sarande", "Mars");

        System.out.println(wagonTrackingDataViaConstructor);
        System.out.println(wagonTrackingDataViaStaticFactory);


        //Check that objects are created only once for each boolean
        System.out.println("Testing evaluation with static factory method");
        Evaluation.fromBooleanToInt(true);
        Evaluation.fromBooleanToInt(false);
        Evaluation.fromBooleanToInt(false);
        Evaluation.fromBooleanToInt(true);

        //Check that an object is required to be created with each invocation
        System.out.println("Testing evaluation with constructor");
        new Evaluation(true);
        new Evaluation(false);
        new Evaluation(false);
        new Evaluation(true);

    }
}
