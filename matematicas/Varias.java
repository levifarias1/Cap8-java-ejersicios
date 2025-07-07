package matematicas;

public class Varias {
    /**
     * Ejersicio 1
     * Los numeros capicuas son los que se escriben igual de izquierda a derecha
     * @param numerole el numero a comprobar
     * @return devuelve falso cuando no es capicua
     */
    public static boolean esCapicua(int numero){
        int aux, numeroImvertido;
        aux = numero;
        numeroImvertido =0;
        while (aux >0) {
            numeroImvertido = numeroImvertido + (aux % 10);
            numeroImvertido = numeroImvertido * 10;
            aux = (int)(aux/10);

        }
        numeroImvertido = numeroImvertido / 10; 
        if (numeroImvertido == numero) {
            return true;
        }else{
            return false;

        
        }
    }
    /**
     * los numeros primos son aquellos que solo son divivcibles si mismos y por 1
     * Tomamo el numero inicial y vamos dividiendo por todos sus numeros anteriores, Si el modulo de alguna de estas diviciones nos da 0 enonces el numero es   
     * @param n
     * @return verdadero cuando es primo y falso si no 
     */
    public static boolean esPrimo(int n){
        if (n<2){
            return false;
        }else {
            for (int i = n; i >2; i--){
                if (n % i ==0){
                    return false;
                }
            }
        }return true;
    }
}
