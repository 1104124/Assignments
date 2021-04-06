/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANISH LAPTOP
 */
public class data_entry {
    int[] array = new int[5];
    int index = 0;
    void insert(int value){
    array[index++]=value;
                          }
    void traverse(){
    for(int i=0;i<array.length;i++){
    System.out.println(array[i]);
    }
                   }
    int find(int value){
     int returning_value=0;   
    for(int i=0;i<array.length;i++){
    if(value==array[i])
    
 return returning_value=1;
    }
   
    return returning_value;
    }
    
    void delete(int index){
    for (int i = 0; i < array.length - 1; i++){
        if (i >= index){
            array[i] = array[i+1];
        }
        else{
            array[i] = array[i];
        }
        
    }
    array[array.length-1]=0;
    this.index--;
    
    }

}
