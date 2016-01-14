/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Imran Bijapuri
 */
public class Itinerary {
    public static void main(String[] args){
        new Itinerary().printItinerary();
    }
    
    public void printItinerary(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Chennai","Banglore");
        map.put("Bombay","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        
        String start = "";
        String destination = "";
        for(String s : map.keySet()){
            if(!map.containsValue(s))
                start = s;
        }
        
        while(!map.isEmpty()){
            destination = map.get(start);
            System.out.println(start + " ==> " + destination);
            map.remove(start);
            start = destination;
        }
        
    }
}
