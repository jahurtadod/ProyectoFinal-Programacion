/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package generador;

public class generador {

    private int[] lista;

    // constructor con los atributos de la clase Sort
    public generador(int tam) {
        this.lista = new int[tam];
    }

    public int[] desordenada() {
        // Aqui se carca el archivo deshordenado
        int[] lista = new int [5000];
        CargarLista a = new CargarLista();
        String preLis = a.leerTxt("ListaD.txt");
        String[] lista1 = preLis.split(" ");
        for (int i = 0; i < lista.length; i++){
            this.lista[i] = Integer.parseInt(lista1[i]);
        }
        return this.lista;
    }

    public int[] invertida() {
        for (int i = this.lista.length - 1; i >=0; i--) {
            this.lista[this.lista.length - i - 1] = (int) (i);
        }
        return this.lista;
    }

}
