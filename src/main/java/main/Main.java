package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public enum YearMonth
    {
        Winter,
        Spring,
        Summer,
        Autumn,
        Another
    }

    public static void main(String[] args) {
        //Перша програма
        //System.out.println("Hello, World");

        /* ***************************************************** */

        //Друга ДЗ
        //1
        /*Scanner sc = new Scanner("\"Your time is limited,;  " +
                "so don't waste it;   " +
                "living someone else's life\".;    " +
                "Steve Job");
        sc.useDelimiter(";");

        do{
            System.out.println(sc.next());
        }while(sc.hasNext());*/

        //2
        /*int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть число: ");
        if(!sc.hasNextInt())
        {
            System.out.println("Не коректні дані!!");
            return;
        }else {
            a = sc.nextInt();
        }
        System.out.print("Ведіть відсоток, який потрібно вирахувати: ");
        if(!sc.hasNextInt())
        {
            System.out.println("Не коректні дані!!");
            return;
        }else {
            b = sc.nextInt();
        }

        double res = a * b/100;
        System.out.println("Результат: " + res);*/

        //3
        /*Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Ведіть число " + (i+1) + ": ");
            if(!sc.hasNextInt())
            {
                System.out.println("Не коректне число!!!");
                return;
            }
            nums[i] = sc.nextInt();
        }
        String allNumber = "";
        for (int num :
                nums) {
            allNumber += num;
        }
        int result = Integer.parseInt(allNumber);

        System.out.println("Результат: " + result);*/

        //4
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть шестизначне число: ");
        if(!sc.hasNextInt()) {
            System.out.println("Помилка. Число не є коректним!!!");
            return;
        }
        StringBuilder number = new StringBuilder();
        number.append(sc.next());
        if(number.length() != 6)
        {
            System.out.println("Помилка. Число не є коректним!!!");
            return;
        }

        for(int i =0; i<2; i++)
        {
           char a = number.charAt(i);
           number.setCharAt(i, number.charAt(number.length()-1-i));
            number.setCharAt(number.length()-1-i, a);

        }

        int num = Integer.parseInt(number.toString());
        System.out.println("Результат: " + num);*/

        //5
        /*System.out.print("Ведіть число місяця: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int a = sc.nextInt();

            switch(IsContains(a))
            {
                case Winter:
                {
                    System.out.println("Winter!!!");
                    break;
                }
                case Summer:
                {
                    System.out.println("Summer!!!");
                    break;
                }
                case Autumn:
                {
                    System.out.println("Autumn!!!");
                    break;
                }
                case Spring:
                {
                    System.out.println("Spring!!!");
                    break;
                }
                default: {
                    System.out.println("Не існує такого місяця!!!");
                }
            }

        }else
        {
            System.out.println("Помилка!! Число введено не коректно!");
        }*/

        //6
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть кільіксть метрів: ");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            System.out.println("Фути: " + (double)number * 0.3048);
            System.out.println("Ярди: " + (double)number * 1.0936);
            System.out.println("Дюйми: " + (double)number * 39.370);
        }
        else {
            System.out.println("Помилка!! Число введено не коректно!");
        }*/

        //7
        /*int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть число 1: ");
        if(sc.hasNextInt())
        {
            a= sc.nextInt();
        }else {
            System.out.println("Число введено не коректно!");
        }
        System.out.print("Ведіть число 2: ");
        if(sc.hasNextInt())
        {
            b= sc.nextInt();
        }else {
            System.out.println("Число введено не коректно!");
        }

        if(a > b)
        {
            int c = b;
            b = a;
            a = c;
        }

        for (int i = a; i <= b; i++)
        {
            int mod= i % 2;
            if(mod != 0)
            {
                System.out.print(i + "; ");
            }
        }*/

        //8
        /*int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть число 1: ");
        if(sc.hasNextInt())
        {
            a= sc.nextInt();
        }else {
            System.out.println("Число введено не коректно!");
        }
        System.out.print("Ведіть число 2: ");
        if(sc.hasNextInt())
        {
            b= sc.nextInt();
        }else {
            System.out.println("Число введено не коректно!");
        }

        if(a > b)
        {
            int c = b;
            b = a;
            a = c;
        }

        for (int i = a; i <= b; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+"; ");
            }
            System.out.println("\n****************\n");
        }*/

        //9
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть розмір масиву: ");
        if(!sc.hasNextInt())
        {
            System.out.println("Не коректне число!");
            return;
        }

        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++)
        {
            arr[i] = RandomNumber(-20, 20);
        }

        System.out.println("Кількіть непарних чисел: " + Arrays.stream(arr).filter(x -> x<0).count());
        System.out.println("Кількіть парних чисел: " + Arrays.stream(arr).filter(x -> x>0).count());
        System.out.println("Кількіть нулів: " + Arrays.stream(arr).filter(x -> x==0).count());*/

        //10
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть розмір масиву: ");
        if(!sc.hasNextInt())
        {
            System.out.println("Не коректне число!");
            return;
        }

        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++)
        {
            arr[i] = RandomNumber(-20, 20);
        }

        for (int item : arr)
        {
            System.out.print(item + "; ");
        }

        int []evenNumbers = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
        int[] oddNumbers = Arrays.stream(arr).filter(x -> x % 2 != 0).toArray();
        int[] positivNumbers = Arrays.stream(arr).filter(x -> x < 0).toArray();
        int[] negativeNumbers = Arrays.stream(arr).filter(x -> x > 0).toArray();

        System.out.println("\nДодатні числа:");
        for (int item : negativeNumbers)
        {
            System.out.print(item + "; ");
        }
        System.out.println("\nПарні числа:");
        for (int item : evenNumbers)
        {
            System.out.print(item + "; ");
        }
        System.out.println("\nНепарні числа:");
        for (int item : oddNumbers)
        {
            System.out.print(item + "; ");
        }
        System.out.println("\nВід'ємні числа:");
        for (int item : positivNumbers)
        {
            System.out.print(item + "; ");
        }*/

        //11
        /*int length = 10;
        boolean isHor = true;
        char symbol = 'l';
        ShowLine(length, isHor, symbol);*/

        //12
        /*boolean minToMax = true;
        int [] arr = {23,3,5,1,5123,21,41,2,4,45,7};
        for (int item :
                Sort(arr, minToMax)) {
            System.out.print(item + "; ");
        }*/


        /* ***************************************************** */
        //3 ДЗ

        //1
       /* Person person = new Person("personName", "personSurname", "personPhone");
        System.out.println("Class Person: " + person);*/

        //2
        /*City city = new City("Рівне", 683941, 2000000);
        System.out.println(city);*/

        //3
        /*Country country = new Country("Україна", 603.628, "Центр Європи");
        System.out.println(country);*/

        //4
        /*Fraction fraction = new Fraction(20, 50);
        System.out.println(fraction);*/

        //5
        /*Book book = new Book("Кобзар", "Шевченко Тарас Григорович", 1840, "Поезія", 115);
        //Реалізовано перегружений метод setBookInfo, який приймає або назву або рік
        book.setBookInfo("Кобзар Т. Шевченко");
        book.setBookInfo(1837);
        System.out.println(book);*/

        //6
        Car car = new Car("Mercedes Benz GLA", "Mercedes", 2021, 3);
        car.setCarInfo(2022);
        car.setCarInfo("Mercedes GLA");
        System.out.println(car);
    }

    public static YearMonth IsContains(int a)
    {
        if(a == 1 || a==2|| a== 12)
        {
            return YearMonth.Winter;
        }
        else if(a >= 3 && a <= 5)
        {
            return YearMonth.Spring;
        }
        else if(a >= 6 && a <= 8)
        {
            return YearMonth.Summer;
        }
        else if(a >= 9 && a <= 11)
        {
            return YearMonth.Autumn;
        }
        return YearMonth.Another;
    }

    public static int RandomNumber(int min, int max)
    {
        return (int)((Math.random() * (max - min)) + min);
    }

    public static void ShowLine(int length, boolean isHor, char symbol)
    {
        String line = "";
        for (int i = 0; i < length; i++)
        {
            line += symbol + (isHor ? "\t" : "\n");
        }

        System.out.println(line);
    }

    public static int[] Sort(int [] arr, boolean minToMax)
    {
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j < arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }

        return minToMax ? arr : reverse(arr);
    }

    public static int[] reverse (int[] arr)
    {
        int[] newArr = new int[arr.length];
        int k = 0;
        for(int i = arr.length-1; i >= 0; i--)
        {
           newArr[k] = arr[i];
           k++;
        }

        return newArr;
    }
}
