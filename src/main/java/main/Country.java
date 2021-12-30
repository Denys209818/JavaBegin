package main;

import lombok.Data;

@Data
public class Country {
    private String Name;
    private double StateArea;
    private String Description;

    public Country (String name, double stateArea, String description)
    {
        this.Name = name;
        this.StateArea = stateArea;
        this.Description = description;
    }

    @Override
    public String toString()
    {
        return "Інформація про країну: \n" +
                "Назва: " + this.Name + "\n" +
                "Площа: " + this.StateArea +" км^2\n" +
                "Опис: " + this.Description ;
    }
}
