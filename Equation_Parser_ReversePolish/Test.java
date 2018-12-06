/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdullah_yilmaz_hw3;

/**
 *
 * @author Abdullah
 */
public class Test_HW3 
{
    public static void main(String[] args) 
    {
        String myST1, myST2, myST3, myST4, myST5, myST6, myST7, myST8, myST9;
        myST1 ="32 + 14 / 2";
        myST2 ="(32 + 14) / 2";
        myST3 ="42.5-12";
        myST4 ="(2 * (7 + (10 / 5))";
        myST5 ="(45 / (52 - 2 * (7 + 6) 3) + 8)";
        myST6 ="(45/(2^3*(7+6))+8)";
        myST7 ="(45 / (2 ^ 3 * (7 + 6)) + 8)";
        myST8 ="(45 * u)";
        myST9 ="(32 + 14) / (3 - 21 / 7)";
             
        
        parser Myparser1 = new parser();
       
        
        
        
        if(Myparser1.isValid(myST1) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST1));
        }
        if(Myparser1.isValid(myST2) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST2));
        }
        if(Myparser1.isValid(myST3) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST3));
        }
        if(Myparser1.isValid(myST4) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST4));
        }
        if(Myparser1.isValid(myST5) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST5));
        }
        if(Myparser1.isValid(myST6) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST6));
        }
        if(Myparser1.isValid(myST7) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST7));
        }
        if(Myparser1.isValid(myST8) == 0)
        {
        System.out.println("The result : " + Myparser1.evaluate(myST8));
        }
        if(Myparser1.isValid(myST9) == 0)
        {
        System.out.print("The result : " + Myparser1.evaluate(myST9));
        }            

}
}

