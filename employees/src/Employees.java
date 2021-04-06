/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DANISH LAPTOP
 */
public class Employees {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        data_entry object = new data_entry();
        
        object.insert(123);
        object.insert(321);
        object.insert(5);
        object.insert(6);
        object.insert(7);
      //  object.insert(1);
        object.traverse();
        System.out.println("find "+object.find(12));
        object.delete(2);
        object.traverse();
    }
    
}
