/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akuku
 */
public class leapmonth {
    public static void main(String[]args){
        int year = 2024;
        int month = 2;
        boolean isleapmonth = (year % 4 == 0);
        isleapmonth = isleapmonth && (month % 100!= 0);
        isleapmonth = isleapmonth && (month % 400 == 0);
        if (isleapmonth){
            System.out.println("The given month is a leap month.");
            
        }else {
            System.out.println("The given month is not a leap month.");
        }
    }
    
}
