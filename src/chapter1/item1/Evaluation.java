package chapter1.item1;

public class Evaluation {

    private int value;

    public Evaluation(boolean bol) {
        System.out.println(String.format("Calling constructor with boolean %b", bol));
        this.value = bol ? 1 : 0;
    }

    public static final Evaluation ONE = new Evaluation(true);

    public static Evaluation ZERO = new Evaluation(false);

    public static Evaluation fromBooleanToInt(boolean bol) {
        return bol ? Evaluation.ONE : Evaluation.ZERO;
    }
    
}
