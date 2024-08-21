public class Ejercicio3 {

    public static void main(String[] args) {
        
        int numA = 4;
        int numB = 5;
        int numC = 7;
        
        if (numA > numB && numA > numC){

            System.out.println(numA + " es el numero mayor");
            
        } else if (numB > numA && numB > numC) {

            System.out.println(numB + " es el numero mayor");
            
        } else if (numC > numA && numC > numB) {

            System.out.println(numC + " es el numero mayor");
            
        } else if (numA == numB && numA == numC) {

            System.out.println("los tres numeros son iguales");
            
        } else {

            System.out.println("hay mas de un numero mayor");

            }
            
        }
    }



