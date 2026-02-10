/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ibrahima140221257.assignment;

import java.util.Scanner;
/**
 *
 * @author iby
 */
public class IbrahimA140221257Assignment{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 

  

        // Month names 

        String[] months = { 

            "Jan", "Feb", "Mar", "Apr", "May", "Jun", 

            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" 

        }; 

  

        int[] temps2023 = new int[12]; 

        int[] temps2024 = new int[12]; 

  

        // --- USER INPUT FOR 2023 --- 

        System.out.println("Enter 12 temperatures for the year 2023:"); 

        for (int i = 0; i < 12; i++) { 

            System.out.print(months[i] + ": "); 

            temps2023[i] = input.nextInt(); 

        } 

  

        // --- USER INPUT FOR 2024 --- 

        System.out.println("\nEnter 12 temperatures for the year 2024:"); 

        for (int i = 0; i < 12; i++) { 

            System.out.print(months[i] + ": "); 

            temps2024[i] = input.nextInt(); 

        } 

  

        //DISPLAY ORIGINAL DATA

        System.out.println("\nTemperatures for 2023:"); 

        for (int i = 0; i < 12; i++) { 

            System.out.println(months[i] + " = " + temps2023[i]); 

        } 

  

        System.out.println("\nTemperatures for 2024:"); 

        for (int i = 0; i < 12; i++) { 

            System.out.println(months[i] + " = " + temps2024[i]); 

        } 

  

        //BUBBLE SORT 2023 (SORT MONTH + TEMP TOGETHER)

        for (int i = 0; i < temps2023.length - 1; i++) { 

            for (int j = 0; j < temps2023.length - 1 - i; j++) { 

                if (temps2023[j] > temps2023[j + 1]) { 

  

                    int temp = temps2023[j]; 

                    temps2023[j] = temps2023[j + 1]; 

                    temps2023[j + 1] = temp; 

  

                    String tempMonth = months[j]; 

                    months[j] = months[j + 1]; 

                    months[j + 1] = tempMonth; 

                } 

            } 

        } 

  

        System.out.println("\nSorted Temperatures for 2023:"); 

        for (int i = 0; i < 12; i++) { 

            System.out.println(months[i] + " = " + temps2023[i]); 

        } 

  

        // Reset months array for 2024 sorting 

        months = new String[]{ 

            "Jan", "Feb", "Mar", "Apr", "May", "Jun", 

            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" 

        }; 

  

        //BUBBLE SORT 2024 (SORT MONTH + TEMP TOGETHER)

        for (int i = 0; i < temps2024.length - 1; i++) { 

            for (int j = 0; j < temps2024.length - 1 - i; j++) { 

                if (temps2024[j] > temps2024[j + 1]) { 

  

                    int temp = temps2024[j]; 

                    temps2024[j] = temps2024[j + 1]; 

                    temps2024[j + 1] = temp; 

  

                    String tempMonth = months[j]; 

                    months[j] = months[j + 1]; 

                    months[j + 1] = tempMonth; 

                } 

            } 

        } 

  

        System.out.println("\nSorted Temperatures for 2024:"); 

        for (int i = 0; i < 12; i++) { 

            System.out.println(months[i] + " = " + temps2024[i]); 

        } 

  

        // this is where the averages for both years is calculated

        int total2023 = 0; 

        for (int i = 0; i < 12; i++) { 

            total2023 += temps2023[i]; 

        } 

        double avg2023 = total2023 / 12.0; 

  

        int total2024 = 0; 

        for (int i = 0; i < 12; i++) { 

            total2024 += temps2024[i]; 

        } 

        double avg2024 = total2024 / 12.0; 

  

        System.out.println("\nAverage temperature for 2023: " + avg2023); 

        System.out.println("Average temperature for 2024: " + avg2024); 

    } 

} 
