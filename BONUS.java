package tp3;

import java.util.Random;
import java.util.Scanner;

public class BONUS{
    public static void main(String[] args) {
        
        
        Random rand = new Random();
        int nombreSecret = rand.nextInt(10) + 1;
        
        
        Scanner sc = new Scanner(System.in);
        
        int tentative = 0;
        int nombreSaisi = 0;
        
        System.out.println(" Devinez un nombre entre 1 et 10 !");
        
        
        while (nombreSaisi != nombreSecret) {
            System.out.print("Votre proposition : ");
            nombreSaisi = sc.nextInt();
            
            tentative++; 
            
            if (nombreSaisi < nombreSecret) {
                System.out.println(" Plus grand");
            } 
            else if (nombreSaisi > nombreSecret) {
                System.out.println(" Plus petit");
            } 
            else {
                System.out.println(" Bravo !");
            }
        }
        
        
        System.out.println(" Vous avez trouvé en " + tentative + " tentative(s).");
        
        sc.close();
    }
} 
