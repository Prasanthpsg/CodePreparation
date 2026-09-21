package org.demo;

public class AgeValidation {
    static void ageTest(int age) throws CustomAgeException {
        if(age < 18){
            throw new CustomAgeException("Age is less than 18");
        }else{
            System.out.println("The age :" + age);
        }
    }
//    Caller is not forced to use try-catch or throws if it is unchecked exception
    public static void main(String[] args) {
       try{
          ageTest(17);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
