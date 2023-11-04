/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.data_array;

/**
 *
 * @author TUF
 */
public class Data_array {

    public static void main(String[] args) {
     String[] Air_Mineral = {"Aqua", "Le Minerale", "Kitaro","Cleo", "Hanun"};
        

        for (int i = 0; i < Air_Mineral.length; i++) {
            System.out.println("Air Mineral Paling Populer ke-" + (i + 1) + ": " + Air_Mineral[i]);
        }
    }
}


