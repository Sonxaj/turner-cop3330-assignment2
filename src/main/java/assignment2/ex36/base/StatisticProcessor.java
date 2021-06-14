package assignment2.ex36.base;

import java.util.List;

public class StatisticProcessor {

    private double roundNum(double i, int places) {
        double power = Math.pow(10.0, places);
        return Math.round(i * power)/power;
    }

    public double avg(List<Integer> data){

        double sum = 0.0;

        for (int i : data) {
            sum += (double) i;
        }

        return sum/(double) data.size();
    }

    public int min(List<Integer> data){
        int out = data.get(0);

        for (int i : data) {
            if (i < out) {
                out = i;
            }
        }
        return out;
    }

    public int max(List<Integer> data){
        int out = data.get(0);

        for (int i : data) {
            if (i > out) {
                out = i;
            }
        }
        return out;
    }

    public double stDev(List<Integer> data){
        double sum = 0.0;

        for (int i : data) {
            sum += Math.pow((double) i - avg(data), 2); // numerator of stdev population formula
        }

        return roundNum(Math.sqrt((sum)/data.size()), 2);
    }

    public void displayData(List<Integer> data){

        //  list
        String out = "Numbers: ";
        out += data.toString().replace("[","").replace("]", "");
        System.out.println(out);

        // data
        out = "The average is " + avg(data);
        System.out.println(out);

        out = "The minimum is " + min(data);
        System.out.println(out);

        out = "The maximum is " + max(data);
        System.out.println(out);

        out = "The standard deviation is " + stDev(data);
        System.out.println(out);
    }
}
