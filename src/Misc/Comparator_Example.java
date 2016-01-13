/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Imran Bijapuri
 */
public class Comparator_Example {
    public ArrayList<Person> list =  new ArrayList<>();
    
    public static void main(String[] args){
        Comparator_Example objComparator_Example = new Comparator_Example();
        objComparator_Example.sample_method();
        
    }
    
    public void sample_method(){
        for(int i = 65; i< 90 ; i++){
            Random r = new Random();
            Person p = new Person((char) i, r.nextInt(100));
            this.list.add(p);
        }
        
        Collections.sort(this.list,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Person p1 = (Person) o1;
                Person p2 = (Person) o2;
                if(p1.age > p2.age)
                    return -1;
                else
                    return 1;
            }
            
        });
        
        for(Person p : this.list)
            System.out.println(p.name + "  " + p.age);
    }
    
    class Person{
        char name;
        int age;
        Person(char name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
