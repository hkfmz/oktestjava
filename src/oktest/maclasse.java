package oktest;

import java.util.Scanner;

public class maclasse {

	public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
         
         System.out.println("CALCULATRICE BASIC\n");
         
         System.out.println("Choisissez un opérateur:\n1-[+]\n2-[x]\n3-[-]\n4-[/]\n\n");
         
         System.out.print("Votre choix:");
         int operateur = clavier.nextInt();
         
         if(operateur <= 0 || operateur > 4) 
         {
        	 System.out.print("Votre choix entre 1 et 4:");
             operateur = clavier.nextInt();
         }else {
        	 if(operateur == 1) {
        		 System.out.println("\nVous avez choisi l'addition\n");
        	 }else if(operateur == 2) {
        		 System.out.println("\nVous avez choisi la multiplication\n");
        	 }else if(operateur == 3) {
        		 System.out.println("\nVous avez choisi la soustraction\n");
        	 }else if(operateur == 4) {
        		 System.out.println("\nVous avez choisi la division\n");
        	 }
         }
         
         System.out.print("Donnez la première valeur:");
         int valeur1=clavier.nextInt();
         
         System.out.print("Donnez la deuxième valeur:");
         int valeur2=clavier.nextInt();
         
         switch(operateur) 
         {
         case 1: 
        	 try {
 				System.out.println(valeur1+" + "+valeur2+" = "+(valeur1+valeur2));
 			} catch (ArithmeticException e) {
 				System.out.println(e);
 			}
        	 break;
         case 2:
        	 try {
 				System.out.println(valeur1+" x "+valeur2+" = "+(valeur1*valeur2));
 			} catch (ArithmeticException e) {
 				System.out.println(e);
 			}
        	 break;
         case 3:
        	 try {
 				System.out.println(valeur1+" - "+valeur2+" = "+(valeur1-valeur2));
 			} catch (ArithmeticException e) {
 				System.out.println(e);
 			}
        	 break;
         case 4: 
        	 try {
				System.out.println(valeur1+" / "+valeur2+" = "+(valeur1/valeur2));
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
        	 break;
        	 
         default: 
        	 System.out.println("\nOpération Inconnu !");
        	 break;
         }
	}

}
