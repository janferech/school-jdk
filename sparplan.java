import java.util.*;
import java.text.*;

public class sparplan
{
  double startkapital;
  double zinssatz;
  int zinsdauer;
  String zinsdauerjahre;
  
  double zinsentemp;
  double zinsenergebnis;
  
  static Scanner sc = new Scanner(System.in);
  DecimalFormat formatter = new DecimalFormat("#.#");
  DecimalFormat formatter2 = new DecimalFormat("#.##");
  
  public void titel ()
  {
    System.out.println("****************************************************************");
    System.out.println("\t\tSparplan");
    System.out.println("****************************************************************");
  }
  
  public void eingabe ()
  {
    
    System.out.print("Bitte geben Sie Ihr Kapital ein: ");  
    startkapital = sc.nextDouble();
    System.out.print("Bitte geben Sie den Zinssatz ein: ");
    zinssatz = sc.nextDouble();
    System.out.print("Bitte geben sie die Anlagedauer (in Jahren) ein: ");                 
    zinsdauer = sc.nextInt();
  }
  
  public void rechnung ()
  {
    if (zinsdauer > 1)
    {   
                  zinsdauerjahre = "Jahre";
    } else
                  zinsdauerjahre = "Jahr"; 
      
    zinsenergebnis = startkapital * Math.pow(1 + zinssatz /100, zinsdauer); //Math.pow(x) x=zahl---nach (,)exponent-also zeit in jahre.
    zinsentemp = zinsenergebnis - startkapital;                             // Math.pow(x,^zeitinjahre)
  }
  
  public void ausgabe ()
  {
    System.out.print("\n\n\nStartkapital: " + formatter2.format(startkapital) + " Euro");
    System.out.print("\nZinssatz: " + formatter.format(zinssatz) + " %");
    System.out.print("\nAnlagedauer: " + zinsdauer + " " + zinsdauerjahre);
    System.out.print("\nZinsen: " + formatter2.format(zinsentemp) + " Euro");
    System.out.print("\nEndkapital: " + formatter2.format(zinsenergebnis) + " Euro");
    System.out.print("\n\nMoechten Sie eine neue Berechnung durchfuehren (j/n)?: ");
  }

public static void main(String []args)
{
  sparplan spar = new sparplan();
    
  spar.titel();
  boolean loop = true;                 //Computer wahrmachen, dass alles daraufvolgendende ausgewertet werden soll
  while (loop) {                       //oeffnung der loop(Schleife/Wiederholung)
      spar.eingabe();
      spar.rechnung();
      spar.ausgabe();
      switch (sc.next()) {             //Switch aktivieren, wegen mehreren faellen, Fall (j), Fall (J), Fall (rest)
          case "j":
               loop = true;
               break;
          case "J":
               loop = true;
               break;
          default:
               loop = false;
               break; 
      } // end of while
    }                    
  }          
}
