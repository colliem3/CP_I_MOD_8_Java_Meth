import java.util.Scanner;
public class GetFavNum {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your fav int");

        favDouble = SafeInput.getDouble(in, "Enter your fav double");
        System.out.println("\nYour favorite int is: " + favInt + " and your favorite double is: " + favDouble);
    }
}