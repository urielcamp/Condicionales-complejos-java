public class Ejercicio4 {

//    Un postulante a un empleo, realiza un test de capacitación, se obtuvo
//    la siguiente información: cantidad total de preguntas que se le
//    realizaron y la cantidad de preguntas que contestó correctamente.
//    Desarrolle un programa que informe el nivel según el porcentaje de
//    respuestas correctas que ha obtenido, y sabiendo que:
//            1. Nivel máximo: Porcentaje  >= 90%.
//            2. Nivel medio:  Porcentaje  >= 75% y <90%.
//            3. Nivel regular: Porcentaje  >= 50% y <75%.
//            4. Fuera de nivel: Porcentaje  < 50%.

    public static void main(String[] args) {


        double nivel = 40.0;

        if (nivel >= 90.0){

            System.out.println("el postulante alcanzo el nivel maximo");

        } else if (nivel >= 75.0 && nivel < 90.0) {

            System.out.println("el postulante alcanzo el nivel medio");

        } else if (nivel >= 50.0 && nivel < 75.0 ) {

            System.out.println("el postulante alcanzo el nivel regular");

        } else if (nivel < 50.0) {

            System.out.println("el postulante esta fuera de nivel ");

        }


    }


}
