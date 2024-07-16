package entities;

public class Student {
    public String name;
    public double first;
    public double second;
    public double third;

    public double grade(){
        return first+second+third;
    }

    public String toString(){
        if(grade() >= 60 && grade() <= 100){
            return "Final Grade = " + String.format("%.2f", grade()) + "\nPass";
        }
        else {
            return "Final Grade = " + String.format("%.2f", grade()) + "\nFailed\nMissing " + (60-grade()) + " Points";
        }
    }
}


