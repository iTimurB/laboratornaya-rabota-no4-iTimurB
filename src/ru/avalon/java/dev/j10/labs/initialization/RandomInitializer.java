package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

public class RandomInitializer implements Initializer {
private final
 int number;

    public RandomInitializer (int number){
        this.number = number;
    }
    
    @Override
    public void initialize(int[] array) {
        if (array.length == 0){
            System.out.println("Array is empty");
          return;  
        } 
        int i;
        for (i = 0; i < array.length; i++){
            array[i]= (int) ((Math.random() * (number+number))- number);
        }        
    }
}
