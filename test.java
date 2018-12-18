import java.util.*;
/**
 * simple code
 *
 * @author (Chang Deng)
 * @version (1 2018/12/18)
 */

public class test
{
    private int firstNumber; // first number.
    private int[] list1; // the input list.
    private ArrayList<Integer> listEx = new ArrayList<Integer>(); // arraylist for saving appeared number.  
    /**
     * Constructor for objects of class test
     */
    public test(int number,int[] a)
    {
        firstNumber = number;
        list1 = a;
    }
    
    public void check()
    {
        for(int i = 0; i < list1.length; i++)
        {
           int a = firstNumber - list1[i]; // first number - current number
           boolean tag = true; 
           for(int k = 0; k < listEx.size(); k ++)
           {
               if (a == listEx.get(k)) // check whether the current number are in the list listEx
               {                       // if the number already in the list, we wont use it.
                   tag = false;
                   break;
               }
               else
                   tag =  true;
           }
           listEx.add(list1[i]); // add these two number into listEx.
           listEx.add(a); 
           for(int j = i; j < list1.length - i; j ++)
           {
               if (list1[i]+list1[j] == firstNumber && list1[i] != list1[j] && tag == true)
               {
                 System.out.println(list1[i]+"+"+list1[j]); // print the requirment number.
                 break;
               }
           }
        }
    }
}
