package model;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String registration;
    private int age;
    private String course;

    public Student(String name, String registration, int age, String course) {
        this.name = name;
        this.registration = registration;
        this.age = age;
        this.course = course;
    }

    public String getName() { return name; }
    public String getRegistration() { return registration; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    public void setName(String name) { this.name = name; }
    public void setRegistration(String registration) { this.registration = registration; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }
}
