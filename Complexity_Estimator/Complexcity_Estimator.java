

import java.util.*;
public class Complexcity_Estimator 
{
        public Complexcity_Estimator(int[] myarray)
        {
         Evaluate(myarray);
        }
        
        void Evaluate() {}
   
        public static void Evaluate(int [] myarray)
    {
        System.out.print("Now Integer Arrays will be Sorted\n");        
        for (int i=0 ;i <myarray.length ;i++)
        {
            long startTime= System.currentTimeMillis();
            int yedek[] = new int[myarray[i]];
            for(int j=0;j<myarray[i];j++)
            {
                
                Random RandomNum = new Random();
                int test = RandomNum.nextInt();
                yedek[j] = (int) test;
            }    
                                 
                for (int a = 1; a < yedek.length; a++) 
            {
                int key = yedek[a];
                int k = a - 1;
                while (k >= 0 && key < yedek[k]) 
                {      
                yedek[k + 1] = yedek[k];
                k--;
                }
                yedek[k + 1] = key;                                                                
            }
            
            long endTime= System.currentTimeMillis(); 
            System.out.println("Time to sort"+" "+ myarray[i]+" "+"elements integer array :"+" "+(endTime-startTime)+" "+"milliseconds");
        }           
        
        System.out.print("\nNow Float Arrays will be Sorted\n");
        
        for (int i=0 ;i <myarray.length ;i++)
        {
            long startTime= System.currentTimeMillis();
            float yedek1[] = new float[myarray[i]];
            for(int j=0;j<myarray[i];j++)
            {
                
                Random RandomNum1 = new Random();
                float test;
                test = RandomNum1.nextFloat()*100000;
                yedek1[j] = (float) test;
            }    
                                 
                for (int a = 1; a < yedek1.length; a++) 
            {
                float key = yedek1[a];
                int k = a - 1;
                while (k >= 0 && key < yedek1[k]) 
                {      
                yedek1[k + 1] = yedek1[k];
                k--;
                }
                yedek1[k + 1] = key;                                                                
            }
            
            long endTime= System.currentTimeMillis(); 
            System.out.println("Time to sort"+" "+ myarray[i]+" "+"elements Float array :"+" "+(endTime-startTime)+" "+"milliseconds");
        }
        
    }
}