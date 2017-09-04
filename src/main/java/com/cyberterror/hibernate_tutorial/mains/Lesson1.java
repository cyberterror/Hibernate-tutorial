package com.cyberterror.hibernate_tutorial.mains;

import com.cyberterror.hibernate_tutorial.dao.lesson1.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Lesson1 {

    public static void main(String[] args) {

        // 1. Создаем экземпляр класса DAO
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("First User");

        System.out.println(userDetails);

        // 2. Создаем SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // 3. Создаем Session
        Session session = sessionFactory.openSession();

        // 4. Открываем транзакцию
        session.beginTransaction();

        // 5. Сохраняем объект
        session.save(userDetails);
        session.getTransaction().commit();

    }
}
