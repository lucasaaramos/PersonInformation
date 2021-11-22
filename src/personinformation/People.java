/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personinformation;

/**
 *
 * @author lucas
 */


public class People {
    
    //attributes
    private String name;
    private int age;
    private char sex;
    
  
    //public methods
    private void doBirthdat(){
        this.age++;
    } 
    
    
    
    
    //constructor
    public People(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //special methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    
    
}


