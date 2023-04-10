class Solution {
    public double[] convertTemperature(double celsius) {
        double kel=celsius+273.15, fah=(celsius*1.80)+32.00;
        double[] answer={kel,fah};
        return answer;
    }
}