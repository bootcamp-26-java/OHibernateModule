/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontroller;

import java.util.List;
import models.Actor;

/**
 *
 * @author Arif Fridasari
 */
public interface IActorController {
    public List<Actor> getAll();
    public List<Actor> search(Object keyword);
    public Actor getById(String id);
    public String insert (String id, String firstName, String lastName);
    public String update (String id, String firstName, String lastName);
    public String delete (String id);
}
