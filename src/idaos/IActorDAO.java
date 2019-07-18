/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Actor;

/**
 *
 * @author Arif Fridasari
 */
public interface IActorDAO {
    public List<Actor> getAll();
    public List<Actor> search(Object keyword);
    public Actor getById(short id);
    public boolean update(Actor actor);
    public boolean insert(Actor actor);
    public boolean delete(short id);
    
}
