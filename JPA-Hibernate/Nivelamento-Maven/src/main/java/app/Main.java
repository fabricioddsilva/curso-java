package app;

import entities.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        Inserindo
//        Pessoa p1 = new Pessoa(null, "Carlos da silva", "carlos@gmail.com");
//        Pessoa p2 = new Pessoa(null, "Maria Antonia", "maria@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Lucas Almeida", "lucas@gmail.com");
//
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();

        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
        System.out.println("Pronto!");

        em.close();
        emf.close();
    }
}
