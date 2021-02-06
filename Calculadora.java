//--------------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Natanael Girón 20029
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//-----------------------------------------------------------------

public class Calculadora implements CalculadoraGeneral {
     
     public String Calculo(String expresion){
          String[] dato = expresion.split(",");


          int respuesta = 0;
          int numero1 = Integer.parseInt(dato[0]);
          int numero2 = Integer.parseInt(dato[1]);

          if (dato[1] == "+"){
               respuesta = numero1 + numero2;
          }else if (dato[1] == "-"){
               respuesta = numero1 - numero2;
          }else if (dato[1] == "*"){
               respuesta = numero1 * numero2;
          }else if (dato[1] == "/"){
               respuesta = numero1 / numero2;
          }
          return String.valueOf(respuesta);    
     }
}
