import Services.AderantService;

import java.util.Scanner;

public class MAin {

    public static AderantService aderantService = new AderantService();

    public static void main(String[] args) {
        int choix;
        do{
        System.out.println("Menu principal");
        System.out.println("1. gestion adherant");
        System.out.println("2. gestion dossier");
        System.out.println("0. quitter");
        Scanner sc =new Scanner(System.in);
        choix = sc.nextInt();

            switch(choix){
                case 1:
                    sousMenuOption1();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("your choice is not valide");
            }
        }while(choix!=0);
    }

    private static void sousMenuOption1() {
        int choix;
        do{
        System.out.println("Menu principal");
        System.out.println("1. lister adherants");
        System.out.println("2. ajouter dossier");
        System.out.println("3. modifier dossier");
        System.out.println("4. suprimer dossier");
        System.out.println("4. return menu principale");
        System.out.println("0. quitter");
        Scanner sc =new Scanner(System.in);
        choix = sc.nextInt();

            switch(choix){
                case 1:
                    aderantService.listAderants();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("your choice is not valide");
            }
        }while(choix!=0);
    }
}
