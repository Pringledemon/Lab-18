import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        File grades = new File("grades.txt");

        try
        {
            Scanner scan = new Scanner(grades);

            System.out.println("Student Grades:");

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }
        }
        catch (Exception e)
        {
            System.out.println("File not found!");
        }
    }
}
