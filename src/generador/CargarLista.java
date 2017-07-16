/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

import java.io.*;

/**
 *
 * @author jahur
 */
public class CargarLista {
    
    public String leerTxt(String nombreArchivo){ //direccion del archivo
        String preLista = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(nombreArchivo));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            preLista = temp;
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        return preLista;
    }
}
