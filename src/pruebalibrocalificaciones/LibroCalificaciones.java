/*
Libro calificaciones que utiliza un arreglo para almacenas las calificaciones de una prueba
 */
package pruebalibrocalificaciones;

/**
 *
 * @author carlosjoseanguiano
 */
public class LibroCalificaciones {

    private String nombreDelCurso;//Nombre del curso que representa este LibroCalificaciones
    private int[] calificaciones;//Arreglo de calificaciones de estudiantes

    //El constructor de dos argumentos inicializa nombreDelCurso y el arreglo calificaciones
    public LibroCalificaciones(String nombre, int[] arregloCalificaciones) {
        nombreDelCurso = nombre;//Inicializa nombreDelCurso
        calificaciones = arregloCalificaciones;//Almacena las calificaciones
    }

    //Metodo para establece el nombre del curso
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre;//Almacena el nombre del curso
    }

    //Metodo para obtener el nombre del curso
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    //Muestra un mensaje de bienvenia al usuario de LibroCalificaciones
    public void mostrarMensaje() {
        //obtenerNombreDelCurso obtiene el nombre del curso 
        System.out.printf("Bienvenido al libro de calificaciones para \n%s!\n\n", obtenerNombreDelCurso());
    }

    //Realiza varias operaciones sobre los datos    
    public void procesarCalificaciones() {
        //Imprime el arreglo de calificaciones
        imprimirCalificaciones();
        //Llama al metodo obtenerPromedio
        System.out.printf("\nEl promedio de la clase es %.2f\n", obtenerPromedio());
        //Llama a los metodos obtenerMinima y obtenerMaxima
        System.out.printf("La calificaciones mas baja es %d\nLa calificaciones mas alta es %d\n\n", obtenerMinima(), obtenerMaxima());
        //Llama al metodo imprimirGraficoBarras
        imprimirGraficoBarras();
    }
//Metodo para obtener calificacion mas baja

    public int obtenerMinima() {
        //Toma el valor de calificaciones como la mas baja
        int califBaja = calificaciones[0];
        //Itera a travez del arreglo de calificaciones
        for (int calificacion : calificaciones) {
            //Si calificacion es menor que califBaja, se aigna a califBaja
            if (calificacion < califBaja) {
                //Nuevo calificacion mas baja
                califBaja = calificacion;
            }
        }
        //Devuelve la calificacion mas baja
        return califBaja;

    }
//Metodo para obtener calificacion mas alta

    public int obtenerMaxima() {
        //Toma el valor de calificaciones como la mas alta
        int califMaxima = calificaciones[0];
        //Itera a travez del arreglo de calificaciones
        for (int calificacion : calificaciones) {
            //Si calificacion es mayor que califMaxima, se aigna a califMaxima
            if (calificacion > califMaxima) {
                //Nuevo calificacion mas alta
                califMaxima = calificacion;
            }
        }
        //Devuelve la calificacion mas alta
        return califMaxima;

    }

    public double obtenerPromedio() {
        int total = 0;//Inicializa el total

        //Suma las calificaciones para un estudiante
        for (int calificacion : calificaciones) {
            total += calificacion;
        }
        //Devuelve el promedio de las calificaciones
        return (double) total / calificaciones.length;
    }

    public void imprimirGraficoBarras() {

        System.out.println("Distribucion de calificaciones :");
        //Almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];
        //Para cada calificaciones, incrementa la frecuencia apropiada
        for (int calificacion : calificaciones) {
            ++frecuencia[calificacion / 10];
        }
        //Para cada frecuencia de calificaciones, imprime una barra en el grafico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            //Imprime etiqueta de barra (00-09)
            if (cuenta == 10) {
                System.out.printf("%5d:", 100);
            } else {
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
            }
            //Imprime barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }

    //Imprime el contenido del arreglo de calificaciones
    public void imprimirCalificaciones() {
        //Imprime la calificacion de cada estudiante
        System.out.println("Las calificaciones son: \n");
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d\n", estudiante + 1, calificaciones[estudiante]);
        }
    }
}
