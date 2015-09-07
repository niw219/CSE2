//define a class
public class Arithmetic {
    
    //add a main method
    public static void main(String [] args) {
    
    //number of pairs of socks
    int nSocks=3;
    //cost per pair of socks
    //"$" is part of the variable name
    double sockCost$=2.58;
    
    //number of drinking glasses
    int nGlasses=6;
    //cost per glass
    double glassCost$=2.29;
    
    //number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    
    double taxPercent=.06;
    double totalSockCost$;
    double totalSockTax$;
    double totalGlassCost$;
    double totalGlassTax$;
    double totalEnvelopeCost$;
    double totalEnvelopeTax$;
    double totalPurchaseCost$;
    double totalPurchaseTax$;
    double totalWithTax$;
    
    
   
    
    totalSockCost$=(nSocks*sockCost$);
    totalSockTax$=Math.round(totalSockCost$*taxPercent*100)/100.0;
    totalGlassCost$=(nGlasses*glassCost$);
    totalGlassTax$=Math.round(totalGlassCost$*taxPercent*100)/100.0;
    totalEnvelopeCost$=(nEnvelopes*envelopeCost$);
    totalEnvelopeTax$=Math.round(totalEnvelopeCost$*taxPercent*100)/100.0;
    totalPurchaseCost$=Math.round((totalEnvelopeCost$+totalGlassCost$+totalSockCost$)*100)/100.0;
    totalPurchaseTax$=Math.round((totalEnvelopeTax$+totalGlassTax$+totalSockTax$)*100)/100.0;
    totalWithTax$=Math.round((totalPurchaseCost$+totalPurchaseTax$)*100)/100.0;
    
    double EnvelopeTax=(int)(totalEnvelopeTax$*100)/100.0;
    
    System.out.println("Total cost of socks = $" + totalSockCost$);
    System.out.println("Sales tax on socks = $" + totalSockTax$);
    System.out.println("Total cost of glasses = $" + totalGlassCost$);
    System.out.println("Sales tax on glasses = $" + totalGlassTax$);
    System.out.println("Total cost of envelopes = $" + totalEnvelopeCost$);
    System.out.println("Sales tax on envelopes = $" + EnvelopeTax);
    System.out.println("Cost of purchase = $" + totalPurchaseCost$);
    System.out.println("Sales tax on purchase = $" + totalPurchaseTax$);
    System.out.println("Purchase total with tax = $" + totalWithTax$);
    
    
    
    
    }
}