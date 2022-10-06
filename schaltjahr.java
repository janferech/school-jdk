import java.util.*;
import java.text.*;

public class schaltjahr {

    int jahr;
    String result;
    

        public void eingabe()                                           {
            Scanner sc = new Scanner(System.in);

            System.out.println("Bitte geben Sie die Jahreszahl ein:");
            jahr = sc.nextInt();
        }

        /**
         * 
         */
        public void verarbeitung()                                      {

            if(jahr % 4 == 0 && jahr % 100 !=0)                         {  // ***if Jahr durch 4 teilbar und rest 0 result=true -- jahr %(geteilt mit Modul)4 ==0(keine reste) ergebnis==true!***
                    result = "Dies Jahr ist ein Schaltjahr, da es durch 4 teilbar ist!";
            }else if(jahr<1)                                            {
                    result = "Sie sollten eine richtige Jahreszahl nehmen, Jahreszahlen vor Chr. geburt zaehlen nicht dazu!\nStarten Sie das Programm neu, sofern sie neue Jahreszahlen eingeben moechten.";
            
            }else if(jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 ==0){
                    result = "Dieses Jahr ist ein Schaltjahr, obwohl es durch 100 und 400 teilbar ist!";
            
            }else                                                       {
                    result = "Dieses Jahr ist leider kein Schaltjahr!\nVielleicht ist es aber das naechste!";
            }
        }

         public void ausgabe()                                          {
            System.out.println(result);
        
        }

        public static void main(String[] args)                          {
            schaltjahr schaltjahrZahl;
            schaltjahrZahl = new schaltjahr();

            schaltjahrZahl.eingabe();
            schaltjahrZahl.verarbeitung();
            schaltjahrZahl.ausgabe();
        }

    }