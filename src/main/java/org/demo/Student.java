package org.demo;

 class Student {

     String name;
      int mark;
     int age;

    Student(String name, int mark, int age){
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    public int getMark(){
        return mark;
    }

     public int getAge(){
         return age;
     }

     public String getName(){
         return name;
     }



    @Override
    public String toString() {
        return name + " - " + mark + " - " + age;
    }


}
