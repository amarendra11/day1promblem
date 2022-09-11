package example6;

public class example6 {
    public static void main(String[] args) {
        int year = 2100;
        boolean leap = true;
        {
            if (year % 4 == 0) ;
           else
            leap = false;
        }
        if (leap)
            System.out.println(year + "is a leap year. ");
        else
            System.out.println(year + "is not a leap year. ");
    }
}
