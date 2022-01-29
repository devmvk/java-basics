package com.devmvk;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public boolean isTeen(){
       return getAge() >= 13 && getAge() <= 19;
    }

    public String getFullName(){
        if(getFirstName().isEmpty()){
            if(getLastName().isEmpty()){
                return "";
            }
            return getLastName();
        } else if(getLastName().isEmpty()){
           return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}
