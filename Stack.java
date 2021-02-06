//--------------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Natanael Girón 20029
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//-----------------------------------------------------------------

import java.util.Vector;

//Interfaz Stack
public interface  Stack <E> {

     //Para ver si esta vacío
     public boolean empty();

     //Para ver el tamaño
     public int size();

     //Para ver el ultimo valor
     public E pop();

     //Para poner un número al final
     public void push (E num);

     ///Para ver el primer valor
     public E peek();


     
}
