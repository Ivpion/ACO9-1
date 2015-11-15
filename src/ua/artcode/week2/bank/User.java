package ua.artcode.week2.bank;

import ua.artcode.service_centre.v1.IdEntity;

/**
 * Created by serhii on 14.11.15.
 */
public class User extends IdEntity {

    private String code;
    private String name;
    private int age;

    public User() {
    }

    public User(int age, String code, String name) {
        this.age = age;
        this.code = code;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
