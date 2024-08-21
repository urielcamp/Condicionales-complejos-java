public class Ejercicio2 {

    public static void main(String[] args) {

        int num = 57;

        if (num < 10){

            System.out.println("el numero es de una cifra");

        } else if (num < 100 && num > 9) {

            System.out.println("el numero es de dos cifras");

        } else if (num < 1000 && num > 99)  {

            System.out.println("el numero es de tres cifras");

        }else if (num < 10000 && num > 999){

            System.out.println("el numero es de cuatro cifras");

        }else {
            System.out.println("el numero es de mas de cuatro cifras");
        }


    }

}
