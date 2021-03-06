/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package generador;

import java.io.*;

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
