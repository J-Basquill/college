import java.util.Scanner;
/**
 * Method to do something
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
 */
public class lab203
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int month = 0;
        while(flag==false)
        {
            System.out.print("Please enter a number between 1-12 : ");
            month = sc.nextInt();
            if(month>=1&&month<=12)
            {
                String nameMonth = "undefined";
                String season = "undefined";
                switch(month)
                {
                    case 1:     nameMonth = "January"; season = "Winter"; break;
                    case 2:     nameMonth = "February"; season = "Spring"; break;
                    case 3:     nameMonth = "March"; season = "Spring"; break;
                    case 4:     nameMonth = "April"; season = "Spring"; break;
                    case 5:     nameMonth = "May"; season = "Summer"; break;
                    case 6:     nameMonth = "June"; season = "Summer"; break;
                    case 7:     nameMonth = "July"; season = "Summer"; break;
                    case 8:     nameMonth = "August"; season = "Autumn"; break;
                    case 9:     nameMonth = "September"; season = "Autumn"; break;
                    case 10:    nameMonth = "October"; season = "Autumn"; break;
                    case 11:    nameMonth = "November"; season = "Winter"; break;
                    case 12:    nameMonth = "December"; season = "Winter"; break;
                    default:    nameMonth = "ERROR"; season = "ERROR"; break;
                }
                System.out.println("Thank you, you have selected "+nameMonth);
                System.out.println(nameMonth+" is in "+season);
                flag = true;
            }
            else if(month==-1)
            {
                flag = true;
            }
            else
            {
                System.out.println("\nERROR! ERROR!");
            }
        }
        //System.out.println(month);
        /*String nameMonth = "undefined";
        String season = "undefined";
        switch(month)
        {
            case 1:     nameMonth = "January"; season = "Winter"; break;
            case 2:     nameMonth = "February"; season = "Spring"; break;
            case 3:     nameMonth = "March"; season = "Spring"; break;
            case 4:     nameMonth = "April"; season = "Spring"; break;
            case 5:     nameMonth = "May"; season = "Summer"; break;
            case 6:     nameMonth = "June"; season = "Summer"; break;
            case 7:     nameMonth = "July"; season = "Summer"; break;
            case 8:     nameMonth = "August"; season = "Autumn"; break;
            case 9:     nameMonth = "September"; season = "Autumn"; break;
            case 10:    nameMonth = "October"; season = "Autumn"; break;
            case 11:    nameMonth = "November"; season = "Winter"; break;
            case 12:    nameMonth = "December"; season = "Winter"; break;
            default:    nameMonth = "ERROR"; season = "ERROR"; break;
        }
        System.out.println("Thank you, you have selected "+nameMonth);
        System.out.println(nameMonth+" is in "+season);*/
    }
}