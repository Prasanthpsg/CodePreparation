package org.demo;

//checked exception created
public class CustomAgeException extends  Exception{

    CustomAgeException(String message){
        super(message);
    }

    //RuntimeException for an unchecked exception
}
