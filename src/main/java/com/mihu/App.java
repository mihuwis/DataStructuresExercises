package com.mihu;

import com.mihu.Algorythms.QuickSort;
import com.mihu.utills.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product tomato1 = new Product("Tomato", 20);
        Product tomato2 = new Product("Tomato", 20);

        System.out.println(tomato1.hashCode());
        System.out.println(tomato2.hashCode());
        System.out.println(tomato1.getName().hashCode());



    }
}
