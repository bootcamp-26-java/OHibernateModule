/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.ActorDAO;
import icontroller.IActorController;
import idaos.IActorDAO;
import java.util.List;
import models.Actor;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arif Fridasari
 */
public class ActorController implements IActorController {

    private IActorDAO iadao;

    public ActorController(SessionFactory factory) {
        iadao = new ActorDAO(factory);
    }

    @Override
    public List<Actor> getAll() {
        return iadao.getAll();
    }

    @Override
    public List<Actor> search(Object keyword) {
        return iadao.search(keyword);
    }

    @Override
    public Actor getById(String id) {
        return iadao.getById(new Short(id));
    }

    @Override
    public String insert(String id, String firstName, String lastName) {
        Actor actor = new Actor(new Short(id), firstName, lastName);
        if (iadao.insert(actor)) {
            return "Insert Success";
        } else {
            return "Insert Failed";
        }
    }

    @Override
    public String update(String id, String firstName, String lastName) {
        Actor actor = new Actor(new Short(id), firstName, lastName);
        if (iadao.update(actor)) {
            return "Update Success";
        } else {
            return "Update Failed";
        }
    }

    @Override
    public String delete(String id) {
        if (iadao.delete(new Short(id))) {
            return "Delete Success";
        } else {
            return "Delete Failed";
        }
    }

}
