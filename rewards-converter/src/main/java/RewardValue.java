public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double MILES_TO_CASH_CONVERTOR_RATE = 0.0035;

    //Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERTOR_RATE;
    }

    //Methods to get the cash value
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    public static void main(String[] args){
        //Testing the class
        RewardValue rewardValue = new RewardValue(20.0);
        System.out.println("Cash Value; $" + rewardValue.getCashValue());
        System.out.println("Miles Value; " + rewardValue.getMilesValue());


        System.out.println();
    }
}

