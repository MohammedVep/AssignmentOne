/*
Mohammed Vepari
ID: 239698930
Monday September 23rd 2024
 */

public class QuestionOne {
    public static double computeSeries(double i){
        // Base case
        if (i == 1)
            return 1;
        // recursive case - up to 1 / i
        else
            return 1 / i + computeSeries(i - 1);
    }
}
