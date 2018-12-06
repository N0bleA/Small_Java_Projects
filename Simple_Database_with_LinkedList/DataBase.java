/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah

 *
 */
public interface DataBase 
{
    public Person SearchName(String tName);
    public Person SearchSurname(String tSurname);
    public Person SearchID(Integer tID);
    public void OutputList();
    public boolean AddPerson(Person tNewPerson);
    public Person DeletePerson(Integer tID);
    public String toString();
    
}
