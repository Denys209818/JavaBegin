package main;

import lombok.Data;

@Data
public class City {
    private String Name;
    private int PostIndex;
    private int People;

    public City(String name, int postIndex, int people)
    {
        this.Name = name;
        this.PostIndex = postIndex;
        this.People = people;
    }

    @Override
    public String toString()
    {
        return "Інформація про місто: \n" +
                "Назва: " + this.Name +
                "\nПоштовий індекс: " + this.PostIndex +
                "\nНаселення: " + this.People;
    }
}
