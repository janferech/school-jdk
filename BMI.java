import java.util.*;
import java.text.*;

public class BMI         
{
  
  int gewicht;
  double koerpergroesse;
  double bmi;
  String bmi2;
  
  DecimalFormat formatter = new DecimalFormat("#.##");
  public void titel()    
  {
    System.out.println("****************************************************************");
    System.out.println("\t\tBody-Mass-Index");
    System.out.println("****************************************************************");
  }  
  
  public void eingabe()  
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Bitte geben Sie Ihr Gewicht (in kg) ein: ");
    gewicht = sc.nextInt();
    System.out.print("Bitte geben Sie Ihre Koerpergroesse (in m) ein: ");
    koerpergroesse = sc.nextDouble();
  }
  
  public void verarbeitung()
  {
    
    bmi = gewicht / (koerpergroesse * koerpergroesse);
    if (bmi >= 30)
    {  
            bmi2 = "Starkes Uebergewicht";
    }
    if (bmi <= 30)
    {
            bmi2 = "Uebergewicht";
    }
    if (bmi <= 25)
    {
            bmi2 = "Normalgewicht";
    }
    if (bmi <= 19)
    {
             bmi2 = "Untergewicht";
    }
  }
  public void ausgabe()
  {
    System.out.println("Ihr Body-Mass-Index (BMI) betraegt:" + formatter.format(bmi) );
    System.out.println("Sie haben " + bmi2);
  }
  
  public static void main(String[] args)
  {
    BMI bodymass = new BMI();
    bodymass.titel();
    bodymass.eingabe();
    bodymass.verarbeitung();
    bodymass.ausgabe();
  }
} 
      
            