public class Ejercicio1 {

//    Desarrollar un programa que permita por medio de la edad de una
//    persona, determinar la categoría en la que pertenece a raíz de la
//    siguiente tabla:




    public static void main(String[] args) {

        int edad = 88;


        if (edad < 6){

            System.out.println("es un infante");

        }else if(edad < 11 && edad > 5){

            System.out.println("es un niño");

        }else if(edad < 16 && edad > 10){

            System.out.println("es un pre adolecente");

        }else if(edad < 19 && edad > 15){

            System.out.println("es un adolecente");

        } else if (edad < 26 && edad > 18) {

            System.out.println("es un pre adulto");

        } else if (edad < 41 && edad > 25) {

            System.out.println("es un adulto");
            
        } else if (edad < 56 && edad > 40) {

            System.out.println("es un pre anciano");

        }else if (edad >= 56){

            System.out.println("es un anciano");

        }

    }



}
