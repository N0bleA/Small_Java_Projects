
public class DB  extends LNode  implements DataBase
{
    
    private LNode first; 
    public int Hitcount = 0;    
    
    public void DB()
    {
        
        first = null;
    }
    
    @Override
    public Person SearchName(String tName) 
    {
           LNode dummy;
           dummy = first;
           LNode temp = new LNode();
           
            while(dummy != null)
            {                     
            if(dummy.Adam.GetName().equals(tName))
            {
                int x = dummy.Adam.GetHitCount();
                    x++;
                    temp.Adam = dummy.Adam;
                    
                    DeletePerson(dummy.Adam.GetID());
                                        
                    AddtoFront(temp.Adam);
                    dummy.Adam.SetHitCount(x);
                    return Adam;
            }
            dummy = dummy.next;
            
            }           
           return null;
    }

    @Override
    public Person SearchSurname(String tSurname) 
    {
           LNode dummy;
           dummy = first;
           LNode temp = new LNode();
           
        
            while(dummy != null)
            {                     
            if(dummy.Adam.GetSurName().equals(tSurname))
            {
                int x = dummy.Adam.GetHitCount();
                    x++;
                    temp.Adam = dummy.Adam;
                    
                    DeletePerson(dummy.Adam.GetID());
                    
                    AddtoFront(temp.Adam);
                    dummy.Adam.SetHitCount(x);
                    return Adam;
            }
            dummy = dummy.next;
            
            }           
           return null;
    }
    
    @Override
    public Person SearchID(Integer tID) 
    {
                   
        LNode dummy;
        dummy = first;
        LNode temp = new LNode();
          
        while(dummy !=null)
        {
            if(dummy.Adam.GetID().equals(tID))
            {
                    int x = dummy.Adam.GetHitCount();
                    x++;
                    temp.Adam = dummy.Adam;
                    
                    DeletePerson(dummy.Adam.GetID());
                    
                    AddtoFront(temp.Adam);
                    dummy.Adam.SetHitCount(x);
                    return Adam;
            }
                    dummy = dummy.next;
        }
        
         return null;
    }                
            
    @Override
    public void OutputList() 
    {

         
    
         LNode current, a, previous, position;
         position = new LNode();
         position.next = first;
         first = position;
      
         while (position.next != null)
         {  current = position.next;
          previous = position;
             a = current.next;
             
            while(a != null)
            {
               if (a.Adam.GetHitCount() > current.Adam.GetHitCount())
               {
                   
                LNode temp = a.next;
                a.next = previous.next;
                previous.next = current.next;
                current.next = temp; 		
                previous.next = a;
                a = temp;
                
               }
                else
                {
                        a = a.next;
                        current = current.next;
                        previous = previous.next;
                }
							               
            }	
             position = position.next;
         }
         first = first.next;
       
      
       LNode Dummy = first;
       while(Dummy != null)
       {
           System.out.println("Name :" +Dummy.Adam.GetName());
           System.out.println("Surname :" +Dummy.Adam.GetSurName());
           System.out.println("ID :" +Dummy.Adam.GetID());
           System.out.println("HitCount :" +Dummy.Adam.GetHitCount());
           System.out.println();
           Dummy = Dummy.next;
       }
           System.out.println();
           
    }

    @Override
    public boolean AddPerson(Person tNewPerson) 
    {
          
            LNode dummy = first;
            LNode NewNode = new LNode();
            NewNode.Adam = tNewPerson;
            
            
            if(dummy == null)
            {
                first = NewNode;
            }
            else
            {
                LNode temp ;
                temp = dummy;
                while(temp.next != null)
                {
                temp = temp.next;
                }
                temp.next = NewNode;
            }
            tNewPerson.SetHitCount(Hitcount);
            return true;    
            
    }
                  
    @Override
    public Person DeletePerson(Integer tID)
    {
       LNode dummy;
       dummy = first;
       LNode NewNode;
       NewNode = null;
       
       if(dummy != null)
       {
       while(dummy.Adam.GetID().equals(tID))
       {
           first = dummy.next;
           return Adam ;
       }
        while(!(dummy.Adam.GetID().equals(tID)))
        {
           NewNode = dummy;
           dummy = dummy.next;
        }
       
        NewNode.next = dummy.next;
        
        }
       return null;
     
    }

    
    public boolean AddtoFront(Person tNewPerson)
    {
            LNode NewNode = new LNode();            
            NewNode.Adam =  tNewPerson;
            NewNode.next = first;
            first = NewNode;
            
            return true;
    }
    
    @Override
    public String toString()
    {
        
        LNode Dummy;
        Dummy = first;
        
        System.out.print("The Elements in the list are : ");
        System.out.println();
        
        while (Dummy != null)
        {
        System.out.print("Name :" +Dummy.Adam.GetName());
        System.out.println();
        System.out.print("Surname :" +Dummy.Adam.GetSurName());
        System.out.println();
        System.out.print("ID :" +Dummy.Adam.GetID());
        System.out.println();
        System.out.print("HitCount :" +Dummy.Adam.GetHitCount());
        System.out.println();
        Dummy = Dummy.next;
        System.out.println();
        
        }
        System.out.println();
        return null;
    }
}    
    
