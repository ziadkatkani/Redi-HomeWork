package org.redi.inheritance;

import java.net.SocketPermission;

/**
 * Created by redi on 5/8/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Inheritance");
        Student student = new Student();
        student.setFirstName("ziad");
        student.setLastName("katkani");
        System.out.println("student name is" + student.getFirstName() + " " + student.getLastName());
        Teacher teacher = new Teacher();
        teacher.setFirstName("Alaa");
        teacher.setLastName("Aloush");
        System.out.println("teacher name is" + teacher.getFirstName()+ " " + teacher.getLastName());

    }
    }

