/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yudha
 */
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pertama declare list parameternya
        List<String> list = new LinkedList<>();
        
        //masukkan element ke dalam list
        for(int i = 0; i < 6; i++)
            list.add(i+"");
        list.add(1, "7");
        
        //print original list
        System.out.println("Original content list: " + list);
        
        //remove element linked list
        list.remove("3");
        list.remove(2);
        System.out.println("Contents list setelah di delete: " + list);
        
        //remove first and last element
        list.remove(0);
        list.remove(list.size()-1);
        System.out.println("List after delete first and last element: " + list);
        
        //get and set a value
        Object val = list.get(1);
        list.set(1, (String) val + " Changed");
        System.out.println("list after change: " + list);
        
        
        //and run project
    }
    
}
