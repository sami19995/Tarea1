/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author turupawn
 */
public class Ejercicios
{

    static int sumar(int x, int y)
    {
        int a = x + y ;
        return a;
    }

    static int restar(int x, int y)
    {
        int a = x - y;
        return a;
    }

    static int multiplicar(int x, int y) 
    {
        int a = x * y;
        return a;
    }

    static int residuo(int x, int y)
    {
        int a = x%y;
        return a;
    }

    static boolean esPar(int x) 
    {
        boolean a = false;
        if(x%2==0)
        {
         a=true;
        }
        return a;
    }

    static boolean esMultiploDe3(int x) 
    {
        boolean a = false;
        
        if(x%3==0)
            
        {
         a=true;
        }
        return a;
    }

    static int getMayor(int x, int y)
    {
        if(x>y)
        return x;
         else
 
        return y;
        
    }

    static boolean esMayorDeEdad(int edad)
    {   
        boolean a;
        if (edad>=18)
          a=true;
        
        else
            a=false;
            
             
        return a;
    }

    static boolean sonPares(int x, int y, int z)
    {
        boolean a=true;
        if(x%2!=0)
           a=false;
        if(y%2!=0)
           a=false;
        if(y%2!=0)
           a=false;
        return a;
    }

    static int getMayorDe3(int x, int y, int z)
    {
        int resultado=0;
        if(x>y & x>z)
        {
        resultado=x;
        }
        
         if(y>x & y>z)
        {
        resultado=y;
        }
          if(z>y & z>x)
        {
        resultado=z;
        }  
        return resultado;
    }

}
