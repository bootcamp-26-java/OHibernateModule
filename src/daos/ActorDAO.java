/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.IActorDAO;
import java.util.ArrayList;
import java.util.List;
import models.Actor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Arif Fridasari
 */
public class ActorDAO implements IActorDAO {

    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public ActorDAO(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<Actor> getAll() {
        List<Actor> actors = new ArrayList<>();
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            String hql = "FROM Actor";
            actors = session.createQuery(hql).list();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return actors;
    }

    @Override
    public Actor getById(short id) {
        Actor actors = null;
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            String hql = "FROM Actor WHERE actorId = :a";
            Query query = session.createQuery(hql);
            query.setParameter("a", id);
            actors = (Actor) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return actors;
    }

    @Override
    public boolean insert(Actor actor) {
        boolean result = false;
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            session.save(actor);
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;

    }

    @Override
    public List<Actor> search(Object keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(short id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
