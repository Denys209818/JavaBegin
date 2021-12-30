package main;

import lombok.Data;

@Data
public class Fraction {
    private double Numerator;
    private double Denominator;

    public Fraction(double numerator, double denominator)
    {
        this.Numerator = numerator;
        this.Denominator = denominator;
    }

    public double getDecimalNumber()
    {
        return this.Numerator/this.Denominator;
    }

    @Override
    public String toString()
    {
        return "Інформація про дріб: \n" +
                "Чисельник: " + this.Numerator + "\n" +
                "Знаменник: " + this.Denominator + "\n" +
                "Десятковий дріб: " + this.getDecimalNumber();
    }
}
