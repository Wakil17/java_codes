package laverie;

import java.util.Scanner;

/**
 * Gestion d'une laverie automatique comportant 3 machines à laver.
 *
 * Implémentation en programmation de type procédurale
 * A quoi voit-on cela ? A l'emploi du mot clé "static" systématique :((
 *
 * @author odenier
 */
public class Laaverie {

    /* TODO
       Ecrire ce programme en POO en suivant les consignes suivantes :
       1. Ne pas supprimer cette classe
       2. Créer un nouveau package pour y coder votre solution qui devra faire exactement la même chose
       3. Identifier les objets manipulés => Coder la/les classe(s) nécessaires
       4. Avoir une nouvelle classe comportant une méthode "main" très simple
       5. Faire disparaître les variables "static"
       Et tester bien votre programme !
     */

    public static boolean isWashingMachine1Used; // false par défaut
    public static boolean isWashingMachine2Used; // false par défaut
    public static boolean isWashingMachine3Used; // false par défaut

    // TODO update ?
//    public static boolean[] isWashingMachineUsed;


    public static void main(String[] args) {
        // Démarrage de la laverie (tous les matins par exemple)
        startLaundromat();
    }

    private static void startLaundromat() {
        Scanner scanner = new Scanner(System.in);
        String action = null;

        while (!"fin".equals(action)) { // attention au NPE
            System.out.println();
            System.out.println("** ETAT DES MACHINES A LAVER **");
            System.out.println("Machine à laver n°1: " + isWashingMachine1Used);
            System.out.println("Machine à laver n°2: " + isWashingMachine2Used);
            System.out.println("Machine à laver n°3: " + isWashingMachine3Used);
            System.out.println("* Opérations possibles *");
            System.out.println("1/-1 : lancer/arrêter la machine à laver n°1");
            System.out.println("2/-2 : lancer/arrêter la machine à laver n°2");
            System.out.println("3/-3 : lancer/arrêter la machine à laver n°3");
            System.out.println("Que voulez-vous faire (fin=quitter) ?");

            action = scanner.next();

            if (action.equals("1")) {
                startWashingMachine(0);
            }
            else if (action.equals("-1")) {
                stopWashingMachine(0);
            }
            else if (action.equals("2")) {
                startWashingMachine(1);
            }
            else if (action.equals("-2")) {
                stopWashingMachine(1);
            }
            else if (action.equals("3")) {
                startWashingMachine(2);
            }
            else if (action.equals("-3")) {
                stopWashingMachine(2);
            }
        }
    }

    private static void startWashingMachine(int number) {
        boolean isUsed = false;
        if (number == 0) {
            isUsed = isWashingMachine1Used;
        }
        else if (number == 1) {
            isUsed = isWashingMachine2Used;
        }
        else if (number == 2) {
            isUsed = isWashingMachine3Used;
        }

        if (!isUsed) {
            System.out.println("Démarrage de la machine à laver n°" + (number+1));

            if (number == 0) {
                isWashingMachine1Used = true;
            }
            else if (number == 1) {
                isWashingMachine2Used = true;
            }
            else if (number == 2) {
                isWashingMachine3Used = true;
            }
        }
        else {
            System.out.println("La machine à laver n°" + (number+1) + " est déjà démarrée !");
        }
    }

    private static void stopWashingMachine(int number) {
        boolean isUsed = false;
        if (number == 0) {
            isUsed = isWashingMachine1Used;
        }
        else if (number == 1) {
            isUsed = isWashingMachine2Used;
        }
        else if (number == 2) {
            isUsed = isWashingMachine3Used;
        }

        if (isUsed) {
            System.out.println("Arrêt de la machine à laver n°" + (number+1));

            if (number == 0) {
                isWashingMachine1Used = false;
            }
            else if (number == 1) {
                isWashingMachine2Used = false;
            }
            else if (number == 2) {
                isWashingMachine3Used = false;
            }
        }
        else {
            System.out.println("La machine à laver n°" + (number+1) + " n'était pas démarrée !");
        }
    }

}
