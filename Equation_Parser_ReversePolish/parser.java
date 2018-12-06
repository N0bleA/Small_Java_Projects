package abdullah_yilmaz_hw3;

import java.util.*;

public class parser implements ParserInterface
{
    @Override
    public int isValid(String myInput) 
    {
        Stack parantez = new Stack<>();     
        char c;
        int strpos = 0;
        int operand_count = 0;
        int operator_count = 0;

            if(myInput.isEmpty())
            {
                     System.out.println("The result : Empty String ERROR");
                     return 1;                
            }    
    while (strpos < myInput.length())
    {
            c = myInput.charAt(strpos);
            
                    
            if(c == '.')
            {
                 System.out.println("The result : Unexpected Float ERROR");
                 return 1;
            }
             
            else if(!( c =='0' || c =='1' || c =='2' || c =='3' || c =='4' || c =='5' || c =='6' || c =='7' || c =='8' || c =='9' ||c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')' || c == ' '))
             {
                 System.out.println("The result : Unexpected Character ERROR");
                 return 1;
            }   
           
            else if (c >= '0' && c <= '9')
            {  
               while ((c >= '0' && c <= '9'))
                {
                    if (strpos+1 < myInput.length())
                    {
                        c = myInput.charAt(++strpos);                       
                    }
                     else
                    {              
                            c = 0;
                            strpos = myInput.length();
                    }
                }
               strpos--;
               operand_count++;                   
            }            
            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')           
            {
                 operator_count++;
                 
            }            
            else if (c == '(')
             {
                 parantez.push(c);
             }
             
            else if (c == ')')
            {
                 if(!parantez.empty())
                 {
                     parantez.pop();
                 }
                 else
                 {
                     System.out.println("The result : Mismatch Parenthesis ERROR");
                     return 1;
                 }
            }
           strpos++; 
    }  
            if(operand_count-1 != operator_count)
            {
                     System.out.println("The result : Missing Operator ERROR");
                     return 1;
            }

            if(!parantez.empty())
            {
                System.out.println("The result : Mismatch Parenthesis ERROR");
                return 1;
            }       
            return 0;
    }

   
    @Override
  public float evaluate(String myInput) 
    {
        Stack stack = new Stack<>();
        StringBuilder resStr = new StringBuilder();           
        char c;
        int strpos = 0;
        
        while (strpos < myInput.length())
{
         
    c = myInput.charAt(strpos);
    
    if (c == ')')
    {
    
      while (!stack.empty() && !stack.peek().equals('('))
      {
        resStr.append(" ");
        resStr.append(stack.pop());
      }
      
      if (!stack.empty())
        stack.pop();
     }
    else if (c == '+')
    {
 
      if (!stack.empty() && (stack.peek().equals('+') || stack.peek().equals('-') ||
          stack.peek().equals('*') || stack.peek().equals('/')|| stack.peek().equals('^')))
      {
        resStr.append(" ");
        resStr.append(stack.pop());
        
      }
      stack.push(c);
    }
    else if (c == '-')
    {
    
      if (!stack.empty() && (stack.peek().equals('+') || stack.peek().equals('-') ||
           stack.peek().equals('*') || stack.peek().equals('/')|| stack.peek().equals('^')))
      {
        resStr.append(" ");
        resStr.append(stack.pop());
       
      }
      stack.push(c);
    }
    else if (c == '*')
    {
      
      if (!stack.empty() && (stack.peek().equals('*') || stack.peek().equals('/') || stack.peek().equals('^')))
      {
        resStr.append(" ");
        resStr.append(stack.pop());
        
      }
      stack.push(c);
    }
    else if (c == '/')
    {
      
      if (!stack.empty() && (stack.peek().equals('*') || stack.peek().equals('/')))
      {
        resStr.append(" ");
        resStr.append(stack.pop());
        
      }
      stack.push(c);
    }
        else if (c == '^')
    {
      
      if (!stack.empty() && (stack.peek().equals("^")))
      {
         resStr.append(" ");
        resStr.append(stack.pop());
        
      }
      stack.push(c);
    }
    else if (c == '(')
    {   
       
      stack.push(c);
      
    }
    else if (c >= '0' && c <= '9')
    {
      resStr.append(" ");
      while ((c >= '0' && c <= '9'))
    {
        
        resStr.append(c);
        
        if (strpos+1 < myInput.length())
        {
          
          c = myInput.charAt(++strpos);
          
        }
        else
        {              
          c = 0;
          strpos = myInput.length();
          resStr.append(" ");
        }
    } 
     strpos--; 
    }
   strpos++;
 
}
    while (!stack.empty())
    {
    resStr.append(stack.pop());
    resStr.append(" ");
    }
    
  String qwe = resStr.toString();
  /*System.out.println("The Postfix :"+qwe);*/      
  
 Stack stack_1 = new Stack();
  int strpos_1 = 0;
  char c_1;
  double x =0;
  
while (strpos_1 < qwe.length())
{
    c_1 = qwe.charAt(strpos_1);
       
    if (c_1 == '+')
    {
      double x1 = Double.valueOf(stack_1.pop().toString());
      double x2 = Double.valueOf(stack_1.pop().toString());
      x = x2 + x1;
      stack_1.push(x);
    }
    else if (c_1 == '-')
    {
      double x1 = Double.valueOf(stack_1.pop().toString());
      double x2 = Double.valueOf(stack_1.pop().toString());
      x = x2 - x1;
      stack_1.push(x);
    }
    else if (c_1 == '*')
    {
      double x1 = Double.valueOf(stack_1.pop().toString());
      double x2 = Double.valueOf(stack_1.pop().toString());
      x = x2 * x1;
      stack_1.push(x);
    }
    else if (c_1 == '/')
    {
      double x1 = Double.valueOf(stack_1.pop().toString());
      double x2 = Double.valueOf(stack_1.pop().toString());
     
      if(x1==0)
      {
          throw new IllegalArgumentException("Division by ZERO ERROR");
      }
      x = x2 / x1;
      stack_1.push(x);
    }
    else if (c_1 == '^')
    {
      double x1 = Double.valueOf(stack_1.pop().toString());
      double x2 = Double.valueOf(stack_1.pop().toString());
      x = Math.pow(x2, x1);
      stack_1.push(x);
    }
    else if (c_1 >= '0' && c_1 <= '9')
    {
      String sub = qwe.substring(strpos_1);    
      /*System.out.println("The sub :"+sub);*/
      int i;
      for (i = 0; i < sub.length(); i++)
      if (sub.charAt(i)==' ')
      {        
      sub = sub.substring(0, i);
      /*System.out.println("The sub :"+sub);*/
      x=Double.parseDouble(sub);     
      stack_1.push(x);
      
      strpos_1 = strpos_1 + sub.length();               
      }     
    }
    strpos_1++;       
}
  return (float) x; 
}
} 


    
    

