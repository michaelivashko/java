package com.maivashko.movieland;
import com.maivashko.movieland.entity.User2;
import com.maivashko.movieland.dao.HibernateUtil;
import org.hibernate.Session;

public class EnterUser2 {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User2 user2 = new User2();
        user2.setName("Alexander");
        user2.setEmail("Barchuk@gmail.com");
        session.save(user2);
        session.getTransaction().commit();
    }
}
