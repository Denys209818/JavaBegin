package main;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Book {
    @Setter(AccessLevel.PRIVATE) @Getter private String Title;
    @Setter @Getter private String Fullname;
    @Setter @Getter private int Year;
    @Setter @Getter private String Type;
    @Setter(AccessLevel.PRIVATE) @Getter private int Count;

    public Book(String title, String fullname, int year, String type, int count)
    {
        this.Title = title;
        this.Fullname = fullname;
        this.Year = year;
        this.Type = type;
        this.Count = count;
    }

    public void setBookInfo(String Title)
    {
        this.Title = Title;
    }

    public void setBookInfo(int Year)
    {
         this.Year = Year;
    }

    @Override
    public String toString()
    {
        return "Інформація про книгу: \n" +
                "Назва: " + this.Title +"\n" +
                "Автор: " + this.Fullname + "\n" +
                "Рік: " + this.Year + "\n" +
                "Жанр: " + this.Type + "\n" +
                "Кількість сторінок: " + this.Count;
    }
}
