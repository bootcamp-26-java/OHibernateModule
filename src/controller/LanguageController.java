/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.LanguageDAO;
import icontroller.ILanguageController;
import idaos.ILanguageDAO;
import java.util.List;
import models.Language;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arif Fridasari
 */
public class LanguageController implements ILanguageController {

    private ILanguageDAO ildao;

    public LanguageController(SessionFactory factory) {
        ildao = new LanguageDAO(factory);
    }

    @Override
    public List<Language> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Language> search(Object keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Language getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(String id, String name, String date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(String id, String name, String date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
