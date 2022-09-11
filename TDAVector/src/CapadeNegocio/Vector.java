/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapadeNegocio;

/**
 * //
 * @author hp
 */
public class Vector {
   //Atributos(aqui solo se declara)
    int V[]; //Vector de Enteros
    int cant; //Cantidad de Elementos
    //Constructor sin Parametros
    public Vector(){
        this.V=new int [256];
        this.cant=0;
    }
    //Constructor Parametrizado
    public Vector(int cantElem){
        this.V=new int[cantElem];
        this.cant=0;
    }
    //set tambien conocido como insertar (void,Procedimiento)
    public void setElem(int ele){
        V[cant]=ele;
        cant++;
        
    }
    //get //Funciones
    public int getElem(int pos){
        return V[pos];
    }
    
    //toString();//Imprime en pantalla (Mostrar)
    public String toString(){
        String S="[";
        for (int i = 0; i < this.cant; i++) {
            S=S+getElem(i)+"|";
        }
        return S+"]";
    }
    
     public static void mostrar(){
        for (int i = 1; i < 10; i++) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        //Instarciar la Clase
        Vector Vectorcito;
        Vectorcito=new Vector();
        //Los void se la llamada se hace asi
        Vectorcito.setElem(2);
        Vectorcito.setElem(8);
        Vectorcito.setElem(33);
        Vectorcito.setElem(23);
        Vectorcito.setElem(89);
        //las Funciones se llaman asi
        System.out.println(Vectorcito.toString());
        mostrar();
    }
    
}
