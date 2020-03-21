package com.albi.ch2.item1;

//Item 1: Consider static factory methods instead of constructors
public class Application {

    public static void main(String[] args) {

        //It is now easier to describe the parameters order in the name of the static factory method
        WagonTrackingData wagonTrackingData = WagonTrackingData.ofCurrentAndOriginAndDestinationLocation("tirane", "sarande", "Mars");
        System.out.println(wagonTrackingData);

        WagonTrackingData wagonTrackingDataCurrentLocation = WagonTrackingData.ofCurrentLocation("Sarande");
        System.out.println(wagonTrackingDataCurrentLocation);

        //Check that objects are created only once for each boolean
        System.out.println("Testing evaluation with static factory method. Values are created only once each");
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
