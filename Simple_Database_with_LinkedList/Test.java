/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class Test 
{

    public static void main(String[] args) 
    {
       DB MyDB = new DB();
       Person newP =  new Person("Ali", "Veli", 4950);
       Person newP1 = new Person("Ece", "Lale", 1234);
       Person newP2 = new Person("Kamil", "Mahmut", 12345);
       Person newP3 = new Person("Suzan", "Ceylan", 123456);
       
       
       MyDB.AddPerson(newP);
       MyDB.AddPerson(newP1);
       MyDB.AddPerson(newP2);
       MyDB.AddPerson(newP3);
       MyDB.toString();
       MyDB.SearchID(4950);
       MyDB.SearchID(12345);
       MyDB.SearchID(123456);
       MyDB.SearchName("Ali");
       MyDB.SearchName("Ece");
       MyDB.SearchName("Kamil");
       MyDB.SearchSurname("Veli");
       MyDB.SearchSurname("Lale1");
       
       MyDB.OutputList();
      
      
      
      
       
       
      
       
       
              
      
       
    }
    
}
