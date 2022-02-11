package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;

public class ReflectionStudent {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Field retrievedIndexNumber = Student.class.getDeclaredField("indexNumber");
        retrievedIndexNumber.setAccessible(true);

        String value = (String)retrievedIndexNumber.get(student);
        System.out.println(value);
    }
}
