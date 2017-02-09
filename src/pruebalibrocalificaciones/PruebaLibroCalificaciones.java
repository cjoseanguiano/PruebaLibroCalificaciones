/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalibrocalificaciones;

/**
 *
 * @author carlosjoseanguiano
 */
public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        int[] arregloCalif = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("CS101 Introduccion a la programacion en Java", arregloCalif);

        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesarCalificaciones();
    }

}
