import java.util.*;
import java.text.*;

public class bussgeld
{
  int ortschaft;
  String ortschaftname;
  String ortschafttext;
  double maxgeschw;
  double ihregeschw;
  double zuvielgeschw;
  double strafe;
  int strafpunkte;
  int monatstrafe;
  
  DecimalFormat formatter = new DecimalFormat("#.#");         //Nachkommastellen 1
  DecimalFormat formatter2 = new DecimalFormat("#.##");       //Nachkommastellen 2

  public void titel()
  {
    System.out.println("****************************************************************");
    System.out.println("\t\tBussgeld-Berechnung");
    System.out.println("****************************************************************"); 
  }
  
  public void eingabe()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Eingabe:");
    System.out.println("****************************************************************");
    System.out.println("Wo haben Sie die Geschwindigkeitsuebertretung begangen?");
    System.out.println("1: innerhalb geschlossener Ortschaften,");
    System.out.println("2: ausserhalb geschlossener Ortschaften");
    System.out.print("Bitte geben Sie die entsprechende Ziffer ein: ");
    ortschaft = sc.nextInt();
    System.out.println("Wie hoch ist die erlaubte Hoechstgeschwindigkeit (in kmh/h)");
    System.out.print("auf dieser Strasse? "); 
    maxgeschw = sc.nextDouble();
    System.out.print("Wie schnell sind Sie gefahren (in km/h)? ");
    ihregeschw = sc.nextDouble();
  }  
  public void rechnung()
  {
    if (ihregeschw < 100) {   //If wegen Toleranzrechnung, wenn ihregeschw. ueber 100km/h minus 3km/h, wenn unter 100km/h 3% minus.
           ihregeschw = ihregeschw - 3;   
      }else if (ihregeschw >= 100) {                                // Toleranz = Konstante
           ihregeschw = ihregeschw - (ihregeschw / 100) * 3;        //Toleranz wenn ihregeschw >=100
      }
           zuvielgeschw = ihregeschw-maxgeschw;
    if (ortschaft ==1)  {
           ortschaftname = "innerorts";                             //System klar machen, welcher String rauskommt
           }else 
                 ortschaftname = "ausserorts";
            
                             
    switch (ortschaft) {
      case  1: //innerhalb geschlossener ortschaften 
        if (zuvielgeschw > 70)                   
        {
            ortschafttext = "Sie muessen 800,00 EUR bezahlen, bekommen 2 Strafpunkte und 3 Monate Fahrverbot.";
          } else if (zuvielgeschw >= 60)
        {
            ortschafttext = "Sie muessen 700,00 EUR bezahlen, bekommen 2 Strafpunkte und 3 Monate Fahrverbot.";
          } else if (zuvielgeschw >= 50)
        {
            ortschafttext = "Sie muessen 600,00 EUR bezahlen, becommen 2 Strafpunkte und 2 Monate Fahrverbot.";                       
          } else if (zuvielgeschw >= 40) 
        {
            ortschafttext = "Sie muessen 400,00 EUR bezahlen, bekommen 2 Strafpunkte und 1 Monat Fahrverbot.";
          } else if (zuvielgeschw >= 30)
        {
            ortschafttext = "Sie muessen 260,00 EUR bezahlen, bekommen 2 Strafpunkte und 1 Monat Fahrverbot.";
          } else if (zuvielgeschw >= 25)
        {
            ortschafttext = "Sie muessen 180,00 EUR bezahlen, bekommen 1 Strafpunkt.";
          } else if (zuvielgeschw >= 20)
        {
            ortschafttext = "Sie muessen 115,00 EUR bezahlen, bekommen 1 Strafpunkt."; //Usw weiter bis 10kmh und dann case2 au0erorts
          } else if (zuvielgeschw >= 15)
        {
            ortschafttext = "Sie muessen 70,00 EUR bezahlen, bekommen 1 Strafpunkt.";
          } else if (zuvielgeschw >= 10)
        {
            ortschafttext = "Sie muessen 50,00 EUR bezahlen.";
          } else if (zuvielgeschw < 10)
        {
            ortschafttext = "Sie muessen 30,00 EUR bezahlen.";
          } else if (zuvielgeschw < 3)
        {
            ortschafttext = "Sie sind aufgrund der Toleranzabzuege, ohne jegliche Kosten davon gekommen.";
           
            }  
        break;
        
      case  2: //ausserhalb geschlossener Ortschaften z.B. Landschaftstrassen, Autobahnen
        if  (zuvielgeschw > 70)
        { 
            ortschafttext = "Sie muessen 700,00 EUR bezahlen, bekommen 2 Strafpunkte und 3 Monate Fahrverbot.";
          } else if (zuvielgeschw >= 60)
        {
            ortschafttext = "Sie muessen 600,00 EUR bezahlen, bekommen 2 Strafpunkte und 2 Monate Fahrverbot.";
          } else if (zuvielgeschw >= 50)
        {
            ortschafttext = "Sie muessen 480,00 EUR bezahlen, bekommen 2 Strafpunkte und 1 Monat Fahrverbot.";
          } else if (zuvielgeschw >= 40)
        {
            ortschafttext = "Sie muessen 320,00 EUR bezahlen, bekommen 2 Strafpunkte und 1 Monat Fahrverbot.";
          } else if (zuvielgeschw >= 30)
        {
            ortschafttext = "Sie muessen 200,00 EUR bezahlen, bekommen 1 Strafpunkt und 1 Monat Fahrverbot.";
          } else if (zuvielgeschw >= 25)
        {
            ortschafttext = "Sie muessen 150,00 EUR bezahlen, bekommen 1 Strafpunkt.";
          } else if (zuvielgeschw >= 20)
        {
            ortschafttext = "Sie muessen 100,00 EUR bezahlen, bekommen 1 Strafpunkt.";
          } else if (zuvielgeschw >= 15)
        {
            ortschafttext = "Sie muessen 60,00 EUR bezahlen.";
          } else if (zuvielgeschw >= 10)
        {
            ortschafttext = "Sie muessen 40,00 EUR bezahlen.";
          } else if (zuvielgeschw < 10)
        {
            ortschafttext = "Sie muessen 20,00 EUR bezahlen.";
            } else if (zuvielgeschw < 3)
        {
            ortschafttext = "Sie sind aufgrund der Toleranzabzuege, ohne jegliche Kosten davon gekommen.";
          
      break; 
        
    } // end of switch  
   }    
  }  
  public void ausgabe()
  {
    System.out.println("\n\nAusgabe:");
    System.out.println("****************************************************************");
    System.out.println("Sie haben sich nicht an die Vorschriften gehalten und sind " + ortschaftname +" "+ formatter2.format(zuvielgeschw) + "km/h");
    System.out.println("zu schnell gefahren.");
    System.out.println(ortschafttext);
    
  }
  
public static void main(String[] args)                                    
  {
    bussgeld geld =new bussgeld();
    geld.titel();
    geld.eingabe();
    geld.rechnung();
    geld.ausgabe();
  }
}
         
