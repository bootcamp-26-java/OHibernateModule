/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontroller;

import java.util.List;
import models.Language;

/**
 *
 * @author Arif Fridasari
 */
public interface ILanguageController {
    public List<Language> getAll();
    public List<Language> search(Object keyword);
    public Language getById(String id);
    public String insert (String id, String name, String date);
    public String update (String id, String name, String date);
    public String delete (String id);
}
