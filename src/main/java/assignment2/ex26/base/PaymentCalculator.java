package assignment2.ex26.base;

public class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(int balance, int apr, int monthlyPayment){
        double i = ((double) apr / 100) / 365.0;

        double out = (-(1.0/30.0)
                * Math.log(1.0 + (double)balance/(double)monthlyPayment
                * (1 - Math.pow((1 + i), 30))) / Math.log(1.0 + i));

        return (int)Math.ceil(out);
    }

    public String genResult(int monthsUntilPaidOff){
        return "It will take you " + monthsUntilPaidOff + " months to pay off this card.";
    }

    public void displayResult(String result){
        System.out.println(result);
    }
}
