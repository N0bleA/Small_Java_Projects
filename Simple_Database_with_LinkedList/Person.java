
public class Person 
{
        private String Name;
        private String Surname;
        private Integer ID;
        private Integer HitCount;
        
        public Person(String n, String s, Integer id)
        {
            Name = n;
            Surname = s;
            ID = id;
        }

        public void ContentOut()
        {
       System.out.println("Name :" + Name);
       System.out.println("Surname :" + Surname);
       System.out.println("ID :" + ID);
       System.out.println("Hit Count : " + HitCount);
       }
        
        public Person(){}
   
    public void SetName(String nName)
        {
        Name = nName;
        }
        
        public void SetSurName(String sName)
        {
        Surname = sName;
        }
        
        public void SetID(Integer nID)
        {
        ID = nID;
        }
        
        public void SetHitCount(Integer nHitCount)
        {
        HitCount = nHitCount;
        }
        
        public String GetName()
        {
        return Name;
        }
        
        public String GetSurName()
        {
        return Surname;
        }
        
        public Integer GetID()
        {
        return ID;
        }
        
        public Integer GetHitCount()
        {
        return HitCount;
        }
}


    

