/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.City;

/**
 *
 * @author Arif Fridasari
 */
public interface ICityDAO {
    public List<City> getAll();
    public List<City> search(Object keyword);
    public City getById(short id);
    public boolean update(City city);
    public boolean insert(City city);
    public boolean delete(short id);
}
