import java.util.*;

public class Taschenrechner {
    
    public static void main(String[] args) {
        
        double LetztesErgebnis=0;
        int Versuche=0;
        
        while (true) {
            String Rechenoperation;
            String JaOderNein;
            String Addition = "addition";
            String Subtraktion = "subtraktion";
            String Division = "division";
            String Multiplikation = "multiplikation";
            String JaVorherigesErgebnis = "ja";
            String NeinVorherigesErgebnis = "nein";
            
            boolean plus;
            boolean minus;
            boolean mal;
            boolean geteilt;
            boolean vorherigesJa=false;
            boolean vorherigesNein=false;
                    
            Scanner scan = new Scanner(System.in);
                    
            System.out.println("Welche Rechenoperation willst du durchführen?");
                Rechenoperation = scan.nextLine();
                
                while(vorherigesJa==false && vorherigesNein==false) {
                    
                                if (Versuche>=1) {
                                    System.out.println("Du Idiot.. Antworte mit ja oder nein. ");
                                    System.out.println("Die Anzahl deiner falschen Angaben ist bisher:"+Versuche);
                                    System.out.println();
                                    
                                }
                                
                    System.out.println("Vorheriges ergebnis verwenden? ja oder nein?");
                JaOderNein = scan.nextLine();
                vorherigesJa=JaOderNein.contentEquals(JaVorherigesErgebnis);
                vorherigesNein=JaOderNein.contentEquals(NeinVorherigesErgebnis);
                    
                                
                Versuche++;
            
                }
                
                Versuche=0;
                
            plus = Rechenoperation.contentEquals(Addition);
            minus = Rechenoperation.contentEquals(Subtraktion);
            mal = Rechenoperation.contentEquals(Multiplikation);
            geteilt = Rechenoperation.contentEquals(Division);
            
                if (plus == true && vorherigesNein==true) {
                            double ErsterSummand;
                            double ZweiterSummand;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Erster Summand: ");
                            ErsterSummand = eins.nextDouble();
                    
                            System.out.println("Zweiter Summand: ");
                            ZweiterSummand = eins.nextDouble();
            
                            System.out.println("Summe: " +(ErsterSummand + ZweiterSummand));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(ErsterSummand + ZweiterSummand);
          
                                  }
                
                if (minus ==true && vorherigesNein==true) {
                    
                            double Minuend;
                            double Subtrahend;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Minuend: ");
                            Minuend = eins.nextDouble();
                    
                            System.out.println("Subtrahend: ");
                            Subtrahend = eins.nextDouble();
            
                            System.out.println("Differenz: " +(Minuend - Subtrahend));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(Minuend - Subtrahend);
                    
                                  }
                
                 if (mal == true && vorherigesNein==true) {
                            double ErsterFaktor;
                            double ZweiterFaktor;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Erster Faktor: ");
                            ErsterFaktor = eins.nextDouble();
                    
                            System.out.println("Zweiter Faktor: ");
                            ZweiterFaktor = eins.nextDouble();
            
                            System.out.println("Produkt: " +(ErsterFaktor * ZweiterFaktor));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(ErsterFaktor * ZweiterFaktor);
          
                                  }
                
                  if (geteilt == true&& vorherigesNein==true ) {
                            double Divident;
                            double Divisor;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Divident: ");
                            Divident = eins.nextDouble();
                    
                            System.out.println("Divisor: ");
                            Divisor = eins.nextDouble();
            
                            System.out.println("Quotient: " +(Divident / Divisor));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(Divident / Divisor);
          
                                  }
                  
                   if (plus == true && vorherigesJa==true) {
                            double ErsterSummand;
                            double ZweiterSummand;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Erster Summand: ");
                            System.out.println(LetztesErgebnis);
                            ErsterSummand = LetztesErgebnis;
                    
                            System.out.println("Zweiter Summand: ");
                            ZweiterSummand = eins.nextDouble();
            
                            System.out.println("Summe: " +(ErsterSummand + ZweiterSummand));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(ErsterSummand + ZweiterSummand);
          
                                  }
                
                if (minus ==true && vorherigesJa==true) {
                    
                            double Minuend;
                            double Subtrahend;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Minuend: ");
                            System.out.println(LetztesErgebnis);
                            Minuend = LetztesErgebnis;
                    
                            System.out.println("Subtrahend: ");
                            Subtrahend = eins.nextDouble();
            
                            System.out.println("Differenz: " +(Minuend - Subtrahend));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(Minuend - Subtrahend);
                    
                                  }
                
                 if (mal == true && vorherigesJa==true) {
                            double ErsterFaktor;
                            double ZweiterFaktor;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Erster Faktor: ");
                            System.out.println(LetztesErgebnis);
                            ErsterFaktor = LetztesErgebnis;
                    
                            System.out.println("Zweiter Faktor: ");
                            ZweiterFaktor = eins.nextDouble();
            
                            System.out.println("Produkt: " +(ErsterFaktor * ZweiterFaktor));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(ErsterFaktor * ZweiterFaktor);
          
                                  }
                
                  if (geteilt == true&& vorherigesJa==true ) {
                            double Divident;
                            double Divisor;
            
                            Scanner eins = new Scanner(System.in);
                            System.out.println("Divident: ");
                            System.out.println(LetztesErgebnis);
                            Divident = LetztesErgebnis;
                    
                            System.out.println("Divisor: ");
                            Divisor = eins.nextDouble();
            
                            System.out.println("Quotient: " +(Divident / Divisor));
                            System.out.println();
                            System.out.println();
                            
                            LetztesErgebnis=(Divident / Divisor);
          
                                  }
                  
                if (minus==false && plus==false && mal==false && geteilt==false) {
                            System.out.println();
                            System.out.println("oops.. Du hast im ersten Schritt keine richtige Angabe gemacht.");
                            System.out.println("Wähle aus Folgenden:");
                            System.out.println("- addition");
                            System.out.println("- subtraktion");
                            System.out.println("- multiplikation");
                            System.out.println("- division");
                            System.out.println();
                           
                }
                
        }
                
   }
}

