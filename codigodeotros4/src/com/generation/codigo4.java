package com.generation;

import java.util.Scanner; //Se importo la libreria

public class codigo4 {
	public static void main(String[] args) { //se agrega el main
Scanner s = new Scanner(System.in);//Se agrega el system.in
    
 	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner scanner = null;
	//Scanner s2 = new Scanner();
    String j2 = scanner.nextLine().toLowerCase();//Se agrega el scanner
    
    if (j1 == j2) { //Elimine el parentesis extra )
      System.out.println("Empate");
    } else {
      int g = 2;
      
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }
          break;
        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//se pone el cierre de llave
            break;
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
        	System.out.println("Entrada inválida");
            return;
        	//Se define el caso default y se agregan los break
      }
      System.out.println("Gana el jugador " + g);
    }
     scanner.close(); //se agrega
}
}


