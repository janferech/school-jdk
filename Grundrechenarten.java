import java.util.*;
import java.text.*;
import java.util.Scanner;

public class Grundrechenarten
{
  double zahl1;
  double zahl2;
  
  int rechenart;
  double ergebnis;
  String zeichen;
  
  
  DecimalFormat formatter = new DecimalFormat("#.#");
  
  public void titel()
  {
    System.out.println("****************************************************************");
    System.out.println("\t\tGrundrechenarten");
    System.out.println("****************************************************************");
  }
  
  public void eingabe()
  {
  Scanner sc = new Scanner(System.in);  
  System.out.println("Zahleneingabe:");
  System.out.println("------------------------------------------------------------------");
  System.out.println("Bitte geben Sie die 1. Zahl ein: ");
  zahl1 = sc.nextDouble();
  System.out.println("Bitte geben Sie die 2. Zahl ein: ");
  zahl2 = sc.nextDouble();
  System.out.println("\nAuswahl:");
  System.out.println("------------------------------------------------------------------");
  System.out.println("Welche Grundrechenart moechten sie Auswaehlen: ");
  System.out.println("1. Addition");
  System.out.println("2. Subtraktion");
  System.out.println("3. Multiplikation");
  System.out.println("4. Division");
  System.out.println("Eingabe Auswahl: "); 
  rechenart = sc.nextInt();
  }
  
  public void rechnnung() 
  {
    switch (rechenart) 
    {
      case 1 :
        ergebnis = zahl1 + zahl2;
        zeichen = "+"; 
        break;
      case 2 : 
        ergebnis = zahl1 - zahl2;
        zeichen = "-";
        break;
      case 3: 
        ergebnis = zahl1 * zahl2;
        zeichen = "*";
        break;
      case 4:  
        ergebnis = zahl1 / zahl2;
        zeichen = ":"; 
      break;
      default: 
        System.out.println("Sie haben eine falsche Kennziffer eingegeben! Das Program wird abgebrochen");
      break;
        
    } // end of switch  
  }
  
  public void ausgabe()
  {
    System.out.println("\nAusgabe Ergebnis: ");
    System.out.println("------------------------------------------------------------------");
    System.out.println(" " + formatter.format(zahl1 ) + zeichen  +  formatter.format(zahl2) + " = " + formatter.format( ergebnis) );
  }  
public static void main(String[] args) 
{
Grundrechenarten Grund = new Grundrechenarten();

Grund.titel();
Grund.eingabe();
Grund.rechnnung();
Grund.ausgabe();                         
}
}     
