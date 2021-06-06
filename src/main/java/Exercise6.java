/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner UserInput = new Scanner(System.in);
        String CurrentAge = UserInput.nextLine();
        int currentAge = Integer.parseInt(CurrentAge);
        System.out.println("At what age would you like to retire?");
        String RetireAge = UserInput.nextLine();
        int retireAge = Integer.parseInt(RetireAge);
        int YearsLeft = retireAge - currentAge;
        System.out.println("You have "+ YearsLeft +" years left until you can retire.");
        if(YearsLeft < 0){
            System.out.println("You are already eligible for retirement.");
            return;
        }
        Year year = Year.now();
        int retireYear = YearsLeft + year.getValue();
        System.out.println("It's "+ year +", so you can retire in " + retireYear);
    }
}
