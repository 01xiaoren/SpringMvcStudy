package com.xiaoren.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Person implements Serializable {
    private String pname;
    private String page;
    private String gender;
    private String[] hobby;
    private String birthdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pname, person.pname) && Objects.equals(page, person.page) && Objects.equals(gender, person.gender) && Arrays.equals(hobby, person.hobby) && Objects.equals(birthdate, person.birthdate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pname, page, gender, birthdate);
        result = 31 * result + Arrays.hashCode(hobby);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page='" + page + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String pname, String page, String gender, String[] hobby, String birthdate) {
        this.pname = pname;
        this.page = page;
        this.gender = gender;
        this.hobby = hobby;
        this.birthdate = birthdate;
    }


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
