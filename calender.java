
package printmounth;

import java.util.Scanner;


public class calender {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Year");
        int year = input.nextInt();
        
        System.out.println("Enter Month between 1 - 12");
        int month = input.nextInt();
        
 
        
    }
    
    public static String getMonthName(int month){
        
        String monthName = "";
        switch (month){
            case 1 : monthName = "Jenuary";break;
            case 2 : monthName = "Februray";break;
            case 3 : monthName = "March";break;
            case 4 : monthName = "April";break;
            case 5 : monthName = "May";break;
            case 6 : monthName = "June";break;
            case 7 : monthName = "July";break;
            case 8 : monthName = "Aguest";break;
            case 9 : monthName = "September";break;
            case 10 : monthName = "October";break;
            case 11 : monthName = "November";break;
            case 12 : monthName = "December";break;
        }
        return monthName;
    }
    
    public static void showTitleMonth(int year , int month){
        
        System.out.println("        " + getMonthName(month) +  "  " + year);
        System.out.println("-------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    
    
    public static void MonthBody(int year, int month){
        
    }
    
    
    public static int getStartDay(int year , int month){
        
    }
    
    
    public static int totleDay(int year , int month){
        int total = 0;
        for (int i == 1800 ; i < year ; i ++){
        if (isLeap(i))
            total = total + 365;
        else
            total = total + 366;
    }
    }
    
    
    public static boolean isLeap(int year){
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    
    


     
}
