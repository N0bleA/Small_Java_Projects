/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int [] myarray ={100,1000,10000,20000,30000,40000,50000,60000} ;
        
        Complexcity_Estimator myEstimate = new Complexcity_Estimator(myarray);
        myEstimate.Evaluate();
    }
    
}
