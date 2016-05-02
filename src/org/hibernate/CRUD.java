package org.hibernate;

import java.awt.Point;
import org.generate.Posts;
import org.util.HibernateUtil;

public class CRUD {
  
    private Session session;
    private HibernateUtil util;
    
    public static void main(String[] args) {
        
        CRUD crud = new CRUD();
        crud.addPost("new post title 2", "new post content 2");
        
    }

    public void addPost(String title, String content){
      
       Posts post = new Posts(title, content);
       session = util.getSessionFactory().openSession();
       session.beginTransaction();
       session.save(post);
       session.getTransaction().commit();
       session.close();
    }
}
