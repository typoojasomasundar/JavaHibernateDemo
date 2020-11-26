package com.ty.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
      EntityManagerFactory factory=Persistence.createEntityManagerFactory("UsersDB"); 
      EntityManager entityManager=factory.createEntityManager();
      entityManager.getTransaction().begin();
      User newUser=new User();
      newUser.setEmail("psomsweet@gmail.com");
      newUser.setFullname("Pooja Somasundar");
      newUser.setPassword("Bravor_12");
      newUser.setEmail("lalithas672@gmail.com");
      newUser.setFullname("Lalitha Somasundar");
      newUser.setPassword("diet1234");
      entityManager.persist(newUser);
      System.out.println("Inserted");
      entityManager.getTransaction().commit();
      entityManager.close();
      factory.close();
      
    }
}
