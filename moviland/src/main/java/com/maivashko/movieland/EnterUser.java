package com.maivashko.movieland;
import com.maivashko.movieland.entity.User;
import com.maivashko.movieland.dao.HibernateUtil;
import org.hibernate.Session;

public class EnterUser {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        user.setName("Alexander");
        user.setEmail("Barchuk@gmail.com");
        session.save(user);
        session.getTransaction().commit();
    }
}
