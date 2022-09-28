package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) context.getBean(Student.class);
        Address add = (Address)context.getBean(Address.class);
        Phone phone = (Phone)context.getBean(Phone.class);

        addPhone(phone, student);
        addAddress(add, student);

        System.out.println("Name : " + student.getName() );
        System.out.println("ID : " + student.getId());
        System.out.println("Address : " + student.getAdd());
        System.out.println("Phone Numbers : " + student.getPh());
    }

        private static void addPhone(Phone phone, Student student){
            List<Phone> object =  new ArrayList<Phone>();
            object.add(phone);
            student.setPh(object);
        }

        private static void addAddress(Address add, Student student){
            student.setAdd(add);
        }
    }

