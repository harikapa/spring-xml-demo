package main.java.com.stackroute.domain;

public class Actor {

    String name;
    String gender;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void display()
    {
        System.out.println("Actors details : \n name : " + this.name +"\n gender : " + this.gender + "\n age :" +this.age  );
    }
}
