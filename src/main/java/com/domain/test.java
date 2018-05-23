package com.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaowenyu on 2018/5/23.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");

        Session s = sf.openSession();
        Employee employee = new Employee("aa","aa@qq.com",new java.util.Date(),234.56f);

        Transaction ts = s.beginTransaction();
        s.save(employee);
        ts.commit();
    }
}
