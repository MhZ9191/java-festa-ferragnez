package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] guestList={"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        
        System.out.printf("%s%3s","Come ti chiami?"," : ");
        String currentGuest= input.nextLine();

        boolean isInvited=false;

        //CICLO FOR
        for(int i=0;!isInvited && i< guestList.length;i++){
            if(guestList[i].equalsIgnoreCase(currentGuest.trim())){
                isInvited=true;
            }
        }

        //CICLO WHILE
        // int cont=0;
        // while(!isInvited && cont < guestList.length){
        //     if(guestList[cont].equalsIgnoreCase(currentGuest.trim())){
        //         isInvited=true;
        //     }
        //     cont++;
        // }

        String message = isInvited ? "Sei nella lista! Passa pure" : "Mi spiace non sei in lista!";
        System.out.println(message);
        input.close();
    }
}
