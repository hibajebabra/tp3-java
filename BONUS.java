package tp3;

import java.util.Random;
import java.util.Scanner;

public class BONUS{
    public static void main(String[] args) {
        
        // Générer un nombre aléatoire entre 1 et 10
        Random rand = new Random();
        int nombreSecret = rand.nextInt(10) + 1;
        
        // Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);
        
        int tentative = 0;
        int nombreSaisi = 0;
        
        System.out.println("🎯 Devinez un nombre entre 1 et 10 !");
        
        // Boucle jusqu'à ce que l'utilisateur trouve
        while (nombreSaisi != nombreSecret) {
            System.out.print("Votre proposition : ");
            nombreSaisi = sc.nextInt();
            
            tentative++; // compter les essais
            
            if (nombreSaisi < nombreSecret) {
                System.out.println("➡️ Plus grand");
            } 
            else if (nombreSaisi > nombreSecret) {
                System.out.println("⬅️ Plus petit");
            } 
            else {
                System.out.println("🎉 Bravo !");
            }
        }
        
        // Affichage du score
        System.out.println("✅ Vous avez trouvé en " + tentative + " tentative(s).");
        
        sc.close();
    }
}
