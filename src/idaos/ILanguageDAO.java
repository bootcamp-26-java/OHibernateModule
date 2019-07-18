/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Language;

/**
 *
 * @author Arif Fridasari
 */
public interface ILanguageDAO {
    public List<Language> getAll();
    public List<Language> search(Object keyword);
    public Language getById(short id);
    public boolean update(Language language);
    public boolean insert(Language language);
    public boolean delete(short id);
}
