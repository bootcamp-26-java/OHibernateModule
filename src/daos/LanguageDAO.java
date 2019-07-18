/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.ILanguageDAO;
import java.util.ArrayList;
import java.util.List;
import models.Language;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Arif Fridasari
 */
public class LanguageDAO implements ILanguageDAO {

    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public LanguageDAO(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<Language> getAll() {
        List<Language> languages = new ArrayList<>();
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            String hql = "FROM Language";
            languages = session.createQuery(hql).list();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return languages;
    }

    @Override
    public Language getById(short id) {
        Language language = null;
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            String hql = "FROM Language WHERE languageId = :a";
            Query query = session.createQuery(hql);
            query.setParameter("a", id);
            language = (Language) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return language;
    }

    @Override
    public boolean insert(Language language) {
        boolean result = false;
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            session.save(language);
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
    public List<Language> search(Object keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Language language) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(short id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
