package main;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Car {

    @Setter @Getter private String Title;
    @Setter @Getter private String Brand;
    @Setter(AccessLevel.PRIVATE) @Getter private int Year;
    @Setter @Getter private int Capacity;

    public Car(String title, String brand, int year, int capacity)
    {
        this.Title = title;
        this.Brand = brand;
        this.Year = year;
        this.Capacity = capacity;
    }

    public void setCarInfo(int Year)
    {
        this.Year = Year;
    }

    public void setCarInfo(String Title)
    {
        this.Title = Title;
    }

    @Override
    public String toString()
    {
        return "Інформація про автомобіль: \n" +
                "Назва: " + this.Title + "\n" +
                "Марка автомобіля: " + this.Brand + "\n" +
                "Рік випуску: " + this.Year + "\n" +
                "Об'єм двигуна: " + this.Capacity;
    }
}
