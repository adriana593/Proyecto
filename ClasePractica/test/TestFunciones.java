/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import clasepractica.Funciones;
import org.junit.*;
import static org.junit.Assert.*;

public class TestFunciones {
    @Test
    public void Pitagoras (){
        int a = 3;
        int b = 4;
        int c = 5;
        assertTrue(Funciones.isTernaPitagorica(a, b, c));
        
    }
     public void Pitagoras_2 (){
        int a = 3;
        int b = 6;
        int c = 5;
        assertFalse(Funciones.isTernaPitagorica(a, b, c));
        
    }
    public void Fibonacci(){
        int a = 4;
        int b = 5;
        assertTrue(Funciones.isTerminoCorrect(a, b));
    }
    public void Fibonacci_2(){
        int a = 4;
        int b = 8;
        assertFalse(Funciones.isTerminoCorrect(a, b));
    }
    
}
