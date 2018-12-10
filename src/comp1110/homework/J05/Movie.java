package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    private String name;
    private int length;
    private int hour /*= length / 60*/;
    private int minute /*= length % 60*/;

    public Movie(String name, int length) {
        this.name = name;
        this.length = length;
        this.hour = length / 60;
        this.minute = length % 60;
    }

    @Override
    public String toString() {
//        if (length % 60 == 0) {
//            if (length == 0) return name + " runs for " + length + " minute";
//            else if (length == 60) return name + " runs for " + length / 60 + " hour";
//            else return name + " runs for " + length / 60 + " hours";
//        }
//        if (length % 60 == 1) {
//            if (length == 1) return name + " runs for " + length + " minute";
//            else if (length == 61) return name + " runs for " + length / 60 + " hour and " + length % 60 + " minute";
//            else return name + " runs for " + length / 60 + " hours and " + length % 60 + " minute";
//        }
//        else{
//            if (length <60) return name + " runs for " + length + " minutes";
//            else if (length <120) return name + " runs for " + length / 60 + " hour and " + length % 60 + " minutes";
//            else return name + " runs for " + length / 60 + " hours and " + length % 60 + " minutes";
//        }
        String result;
        result = name + " runs for ";
        switch (hour) {
            case 0:
                break;
            case 1:
                result += hour + " hour ";
                break;
            default:
                result += hour + " hours ";
                break;
        }
        if(hour!=0&&minute!=0) result += "and ";

        switch (minute) {
            case 0:
                break;
            case 1:
                result +=  minute + " minute";
                break;
            default:
                result +=   minute + " minutes";
                break;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int length = in.nextInt();
        Movie m = new Movie(name, length);
        System.out.println(m);
        /*System.out.println(m.name);
        System.out.println(m.hour);
        System.out.println(m.minute);*/
    }
}
