/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author vmsanchez
 */
public class Principal {

    static void sumarEnteros(int dato1, int dato2){
        int solucion = dato1 + dato2;
        System.out.println("La suma es " + solucion);
    }
    
     static int restarEnteros(int dato1, int dato2){
        return (dato1 - dato2);
    }

    static int multiplicarEnteros(int dato1, int dato2){
        return (dato1 * dato2);
    }  

    static int dividirDecimales(int dato1, int dato2){
        return (dato1 + dato2);
    }

    public static int calcularFactorial(int dato){
        if (dato == 0) {
            return 1;
        } else {
            return dato * calcularFactorial(dato - 1);
        }
    }
    
    static int sumarArray(int dato1, int dato2){
        return (dato1 + dato2);
    }
    
    static int sumarLista(int dato1, int dato2){
        return (dato1 + dato2);
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
