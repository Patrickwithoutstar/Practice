package comp1110.homework.J08;

public class Staff {
    //    demo
    String name;
    double hourlyPay;
    int numOfHours;
    boolean worksOvertime;


    public Staff(String name, double hourlyPay, int numOfHours, boolean worksOvertime) {
        this.name = name;
        this.hourlyPay = hourlyPay;
        this.numOfHours = numOfHours;
        this.worksOvertime = worksOvertime;
    }

    public String getName() {
        return name;
    }

    public double getTotalPay(double extraPay) {
        if (this.worksOvertime)
        return hourlyPay * numOfHours+extraPay;
        else return hourlyPay * numOfHours;
    }

    public static class WeekendPayCalculator {
        private double loadingRate;
        public void setLoadingRate(double rate) {
        this.loadingRate = rate;
        }
        double calcOvertime(double hourlyPay){
            return loadingRate * hourlyPay;
        }
    }
}
