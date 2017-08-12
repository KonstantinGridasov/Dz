package com.example.ghome.projectdz.Dz.dz7;

import java.lang.ref.SoftReference;
import java.net.URL;

/**
 * Created by GHome on 11.08.2017.
 */

public class User  {
    private String name;
    private int age;
    private String sex;
    private String url;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        name = name;
    }

    public void setAge(int age) {
        age = age;
    }

    public void setSex(String sex) {
        sex = sex;
    }

    public void setUrl(String url) {
        url = url;
    }

    User (String name, int age, String sex, String url)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.url=url;
    }
}
