package main;

import java.util.ArrayList;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class VeerificaTesto {
     private  static ArrayList<String> daverificare=new ArrayList<String>();
      private static ArrayList<String> listavero=new ArrayList<String>();
      
       private static int tot=0;
       
    
    
      

    public static double reader(String a) {
        double k=0;
    	
    
try{
     Scanner Scanner=new Scanner(new File(a) );
    
     while(Scanner.hasNext()==true){
        String gggg=Scanner.next();
        if(gggg.equalsIgnoreCase("e") || gggg.equalsIgnoreCase("ne") || gggg.equalsIgnoreCase("inoltre") || gggg.equalsIgnoreCase("ma") || gggg.equalsIgnoreCase("dunque") || gggg.equalsIgnoreCase("anzi") || gggg.equalsIgnoreCase("che") || gggg.equalsIgnoreCase("allurchè") ||gggg.equalsIgnoreCase("però") ||gggg.equalsIgnoreCase("perchè") || gggg.equalsIgnoreCase("giacchè") || gggg.equalsIgnoreCase("purchè") || gggg.equalsIgnoreCase("affinchè") || gggg.equalsIgnoreCase("eppure") || gggg.equalsIgnoreCase("oppure") || gggg.equalsIgnoreCase("dopochè") || gggg.equalsIgnoreCase("neanche") ||gggg.equalsIgnoreCase("neppure") || gggg.equalsIgnoreCase("o") || gggg.equalsIgnoreCase("ovvero") || gggg.equalsIgnoreCase("ossia") || gggg.equalsIgnoreCase("tuttavia") || gggg.equalsIgnoreCase("infatti") || gggg.equalsIgnoreCase("cioè") || gggg.equalsIgnoreCase("quindi") ||  gggg.equalsIgnoreCase("come") || gggg.equalsIgnoreCase("mentre") || gggg.equalsIgnoreCase("finchè") || gggg.equalsIgnoreCase("siccome") || gggg.equalsIgnoreCase("sebbene") || gggg.equalsIgnoreCase("quantunque") || gggg.equalsIgnoreCase("qualora") || gggg.equalsIgnoreCase("fuorchè") || gggg.equalsIgnoreCase("il") || gggg.equalsIgnoreCase("lo") || gggg.equalsIgnoreCase("la") || gggg.equalsIgnoreCase("i") || gggg.equalsIgnoreCase("gli") || gggg.equalsIgnoreCase("le") || gggg.equalsIgnoreCase("un ") || gggg.equalsIgnoreCase("una") ||  gggg.equalsIgnoreCase("del") || gggg.equalsIgnoreCase("dello") || gggg.equalsIgnoreCase("della") || gggg.equalsIgnoreCase("dei") || gggg.equalsIgnoreCase("degli") || gggg.equalsIgnoreCase("delle") || gggg.equalsIgnoreCase("se") || gggg.equalsIgnoreCase("di") || gggg.equalsIgnoreCase("a") || gggg.equalsIgnoreCase("da") || gggg.equalsIgnoreCase("in ") || gggg.equalsIgnoreCase("su") || gggg.equalsIgnoreCase("per") || gggg.equalsIgnoreCase("tra ") || gggg.equalsIgnoreCase("fra")  ){
        throw new Exception();
        }
        else{
           
                
                    daverificare.add(gggg);
               

            
        }
        
     }
    
      k=confronto();
     
     daverificare.clear();
     listavero.clear();
     tot=0;
     Scanner.close();
   
    }
   
     catch(Exception dd){
        System.out.println(dd.getMessage());
     }
     
 return k;
    }
      private static double confronto() {
  
       
      int r=check();
           if(r==1) {
        	  return 1; 
           }
          
            for(int i=0;i<daverificare.size();i++){
                for(int k=0;k<listavero.size();k++){
                    if(daverificare.get(i).equalsIgnoreCase(listavero.get(k))){
tot++;
                    }
                }
            
        }

        
        
        return (double)(tot)/(double)(daverificare.size()+listavero.size());

    }
     
     private static int check() {
    	 byte[] acdc=null;
        int u=VerificaFonte.databaseconfermation();
     try {
    	
     	if(u==0) {
         acdc=VerificaFonte.databasetxt();
         String s=new String(acdc,StandardCharsets.UTF_8);
         try (Scanner qw = new Scanner(s)) {
			while(qw.hasNext()){
			     
			     String gggg=qw.next();
			     if(gggg.equalsIgnoreCase("e") || gggg.equalsIgnoreCase("ne") || gggg.equalsIgnoreCase("inoltre") || gggg.equalsIgnoreCase("ma") || gggg.equalsIgnoreCase("dunque") || gggg.equalsIgnoreCase("anzi") || gggg.equalsIgnoreCase("che") || gggg.equalsIgnoreCase("allurchè") ||gggg.equalsIgnoreCase("però") ||gggg.equalsIgnoreCase("perchè") || gggg.equalsIgnoreCase("giacchè") || gggg.equalsIgnoreCase("purchè") || gggg.equalsIgnoreCase("affinchè") || gggg.equalsIgnoreCase("eppure") || gggg.equalsIgnoreCase("oppure") || gggg.equalsIgnoreCase("dopochè") || gggg.equalsIgnoreCase("neanche") ||gggg.equalsIgnoreCase("neppure") || gggg.equalsIgnoreCase("o") || gggg.equalsIgnoreCase("ovvero") || gggg.equalsIgnoreCase("ossia") || gggg.equalsIgnoreCase("tuttavia") || gggg.equalsIgnoreCase("infatti") || gggg.equalsIgnoreCase("cioè") || gggg.equalsIgnoreCase("quindi") ||  gggg.equalsIgnoreCase("come") || gggg.equalsIgnoreCase("mentre") || gggg.equalsIgnoreCase("finchè") || gggg.equalsIgnoreCase("siccome") || gggg.equalsIgnoreCase("sebbene") || gggg.equalsIgnoreCase("quantunque") || gggg.equalsIgnoreCase("qualora") || gggg.equalsIgnoreCase("fuorchè") || gggg.equalsIgnoreCase("il") || gggg.equalsIgnoreCase("lo") || gggg.equalsIgnoreCase("la") || gggg.equalsIgnoreCase("i") || gggg.equalsIgnoreCase("gli") || gggg.equalsIgnoreCase("le") || gggg.equalsIgnoreCase("un ") || gggg.equalsIgnoreCase("una") ||  gggg.equalsIgnoreCase("del") || gggg.equalsIgnoreCase("dello") || gggg.equalsIgnoreCase("della") || gggg.equalsIgnoreCase("dei") || gggg.equalsIgnoreCase("degli") || gggg.equalsIgnoreCase("delle") || gggg.equalsIgnoreCase("se") || gggg.equalsIgnoreCase("di") || gggg.equalsIgnoreCase("a") || gggg.equalsIgnoreCase("da") || gggg.equalsIgnoreCase("in ") || gggg.equalsIgnoreCase("su") || gggg.equalsIgnoreCase("per") || gggg.equalsIgnoreCase("tra ") || gggg.equalsIgnoreCase("fra")  ){
			    	 throw new Exception();
			     }
			     else{

			         listavero.add(gggg);           
			     }
			

			 }
			 qw.close();
		}}
     	else {u=1;}
     	
     }
     catch(Exception edfrt){
System.out.println(edfrt.getMessage());
     }
     return u;
     }
}
