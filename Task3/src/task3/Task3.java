/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.ArrayList;

/**
 *
 * @author CatalinRosu
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    
   public static int divizor6(int k)
    {
        int divizor=6;
        if(k%6 == 0 || k<6) return k;
        while(divizor<k)
        {
            if(divizor+6 > k) break;
            divizor+=6;
        }
        
        return divizor;
    }
    
    
    public static ArrayList<ArrayList<String>> task3(ArrayList<ArrayList<String>> formatie, int k)
    {
        
        int shiftNumber = (k - divizor6(k))*2;
        int h=shiftNumber;
        ArrayList<String> listaJucatori = new ArrayList<String>();
        ArrayList<String> listaJucatori2 = new ArrayList<String>();
        ArrayList<ArrayList<String>> rezultat = new ArrayList<ArrayList<String>>();
        for(int i=0;i<formatie.size();i++)
        {
            listaJucatori.addAll(formatie.get(i));
        }
        for(int i=0;i<12;i++)
        {
            listaJucatori2.add("empty");
        }
        System.out.println(listaJucatori);
        for(int i=0;i<listaJucatori.size();i++)
        {
            if(listaJucatori.get(i) != "empty")
            {
                if(i+shiftNumber>listaJucatori2.size())
                {
                    int x = shiftNumber - (listaJucatori2.size()-i) - 1;
                    listaJucatori2.set(x, listaJucatori.get(i));  
                }
                else
                {
                listaJucatori2.set(shiftNumber+i, listaJucatori.get(i));   
                }
            }
        }
        System.out.println(listaJucatori.size());
        System.out.println(listaJucatori2);
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        
        list1.add(listaJucatori2.get(0));
        list1.add(listaJucatori2.get(1));
        list1.add(listaJucatori2.get(2));
        
        list2.add(listaJucatori2.get(3));
        list2.add(listaJucatori2.get(4));
        list2.add(listaJucatori2.get(5));
        
        list3.add(listaJucatori2.get(6));
        list3.add(listaJucatori2.get(7));
        list3.add(listaJucatori2.get(8));
        
        list4.add(listaJucatori2.get(9));
        list4.add(listaJucatori2.get(10));
        list4.add(listaJucatori2.get(11));
        
        
        rezultat.add(list1);
        rezultat.add(list2);
        rezultat.add(list3);
        rezultat.add(list4);
        
        
        return rezultat;
        
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(divizor6(22));
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<ArrayList<String>> listatotala = new ArrayList<ArrayList<String>>();
        
        list1.add("empty");
        list1.add("5");
        list1.add("empty");
        
        list2.add("4");
        list2.add("empty");
        list2.add("2");
        
        list3.add("empty");
        list3.add("3");
        list3.add("empty");
        
        list4.add("6");
        list4.add("empty");
        list4.add("1");
        
        listatotala.add(list1);
        listatotala.add(list2);
        listatotala.add(list3);
        listatotala.add(list4);
        
        task3(listatotala,10);
        
    }
    
}
