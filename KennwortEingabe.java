import java.util.*;
import java.text.*;

public class KennwortEingabe
{
  String passwort = "FLS";
  String passworteingabe;
  boolean loop = true;
  int versuche = 3;
  int versuche1;
  
  public void titel()
  {
    System.out.println("****************************************************************");
    System.out.println("\t\tKennworteingabe");
    System.out.println("****************************************************************");
  }  
  public void eingabe()
  {
    Scanner sc = new Scanner(System.in);
  while (loop) {  
  System.out.print("Bitte geben Sie ihr Kennwort ein : ");
  passworteingabe = sc.nextLine();
  if (passworteingabe.equals(passwort)==true) {
        System.out.println("\nSie haben sich erfolgreich angemeldet!");
        loop = false;                                                  //Loop wird nicht wiederholt, wenn Passwort korrekt
         }else  {  
           versuche--;                                                 //-- = Ein Abzug  
        System.out.println("\nDas Kennwort ist leider falsch!\nSie haben noch " + versuche +" von 3 Versuchen!");  
        versuche1 ++;                                                  //++ = ein Zusatz
        if (versuche==0) {
          System.out.println("\nSie haben leider keine Versuche mehr!\n");
          loop = false;                                                //loop schliessen/beenden
          
        } // end of if-else
      }
    }
  }
public static void main(String []args)
{
KennwortEingabe kennwort = new KennwortEingabe();

kennwort.titel();
kennwort.eingabe();
}  
}  
