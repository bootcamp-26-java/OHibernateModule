/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontroller;

import java.util.List;
import models.City;

/**
 *
 * @author Arif Fridasari
 */
public interface ICityController {
    public List<City> getAll();
    public List<City> search(Object keyword);
    public City getById(String id);
    public String insert (String id, String name, String country, String lastUpdate);
    public String update (String id, String name, String country, String lastUpdate);
    public String delete (String id); 
}
