package boletinfiguras;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Piramide {
 private final String simbolo="*";    
Scanner sc = new Scanner(System.in);
private int altura2;
private String espazo=" ";

public void pedirDatos(){
    System.out.println("Introduce a altura da piramide");
altura2 = sc.nextInt();    
}

public void DebuxaPiramide(){
pedirDatos();
String acumulador = "*";   
for (int i=0;i<altura2;i++){
    for (int j=altura2;j>altura2;j--){
acumulador = " " + acumulador;   
}

    }   
}  
    
    
    
    
    
    
    
    
    
}
