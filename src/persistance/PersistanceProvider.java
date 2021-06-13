/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import main.WeeklyHoursDatabaseException;
import model.Login;

/**
 *
 * @author Albert
 */
public interface PersistanceProvider {
    public void save (String database, String item, Login login, int option) throws WeeklyHoursDatabaseException;
    public void load (String database) throws WeeklyHoursDatabaseException;
}