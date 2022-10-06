import java.util.*;
import java.text.*;

public class NotenberechnungGMBH
{
  double maxPunktzahl;
  double erreichtePunktzahl;
  
  int ergebnisNote;
  double ergebnisProzentzahl;
  
  DecimalFormat formatter = new DecimalFormat("#.#");
  public void titel()
  {
    System.out.println("****************************************************************");
    System.out.println("\t\tNotenberechnung");
    System.out.println("****************************************************************");
    
  }
  
  public void eingabe()
  {
    Scanner sc2 = new Scanner(System.in);
    
    System.out.println("Eingabe:");
    System.out.println("------------------------------------------------------------------");
    System.out.print("Wie viele Punkte konnten Sie maximal erreichen? ");
    maxPunktzahl = sc2.nextDouble();
    System.out.print("Wie viele Punkte haben Sie erreicht? ");
    erreichtePunktzahl = sc2.nextDouble();
  }
  
  public void rechnung()
  {
    ergebnisProzentzahl = (erreichtePunktzahl * 100) / maxPunktzahl;    // Dreisatz - (erreichtePunkte * 100%) / MaxPunktzahl = erlungene Prozentzahl
    
    if      (ergebnisProzentzahl >= 95) { ergebnisNote = 15;            // Platzsparender mit else if
    }else if(ergebnisProzentzahl >= 90) { ergebnisNote = 14; 
    }else if(ergebnisProzentzahl >= 85) { ergebnisNote = 13;                      
    }else if(ergebnisProzentzahl >= 80) { ergebnisNote = 12; 
    }else if(ergebnisProzentzahl >= 75) { ergebnisNote = 11; 
    }else if(ergebnisProzentzahl >= 70) { ergebnisNote = 10; 
    }else if(ergebnisProzentzahl >= 65) { ergebnisNote = 9 ;                       
    }else if(ergebnisProzentzahl >= 60) { ergebnisNote = 8 ; 
    }else if(ergebnisProzentzahl >= 55) { ergebnisNote = 7 ; 
    }else if(ergebnisProzentzahl >= 50) { ergebnisNote = 6 ; 
    }else if(ergebnisProzentzahl >= 45) { ergebnisNote = 5 ; 
    }else if(ergebnisProzentzahl >= 40) { ergebnisNote = 4 ; 
    }else if(ergebnisProzentzahl >= 33) { ergebnisNote = 3 ; 
    }else if(ergebnisProzentzahl >= 27) { ergebnisNote = 2 ; 
    }else if(ergebnisProzentzahl >= 20) { ergebnisNote = 1 ; 
    }else if(ergebnisProzentzahl >= 0 ) { ergebnisNote = 0 ; 
    } 
    
  }  
  public void ausgabe()
  {
    System.out.print("Ausgabe: ");
    System.out.print("------------------------------------------------------------------");
    System.out.print("\nSie haben " + formatter.format(erreichtePunktzahl) + " von " + maxPunktzahl + " Punkten erreicht!");
    System.out.print("\n\nDas entspricht " + formatter.format(ergebnisProzentzahl) + " Prozent und damit der Note: " + ergebnisNote + " Punkte.");//Sicherheitshalber beide Zahlen gerundet
    System.out.print("\n\nDennoch Verbesserungswuerdig!\n\n");
  }
  public static void main(String[] args)    
  {
    NotenberechnungGMBH notenGMBH = new NotenberechnungGMBH();
    notenGMBH.titel();
    notenGMBH.eingabe();
    notenGMBH.rechnung();
    notenGMBH.ausgabe();
  }
}           