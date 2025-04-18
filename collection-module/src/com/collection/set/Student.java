package com.collection.set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "{name=" + name + ", age=" + age + "}";
    }

    // 只要两个对象的内容一样，返回的哈希值就是一样的
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 比较内容
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int compareTo(Student o) {
        // return this.age - o.age; // 升序
         return o.age - this.age; // 降序
    }
}
