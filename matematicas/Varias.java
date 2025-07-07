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
            for (int i = n /2; i >2; i--){
                if (n % i ==0){
                    return false;
                }
            }
        }return true;
    }
    /**
     * Devuelve el siguente numero primo del numero ingresado 
     * @param num Numero ingresado
     * @return
     */
    public static int siguentePrimo(int num){
        //++ numero, incrementa el numero antes de enviarlo
        // para que no devuelva el mismo numero inicial en el caso de  
        while (!esPrimo(++num)){
         System.out.print(num + " ");   
        };
        return num;
    }
    /**
     * Dada una base y un exponente nos devuelve la potencia
     * @param base
     * @param exponente
     * @return
     */
    public static long potencia (int base, int exponente){
        //Mi el exponente es 0 siempre devolvemos 1
        if (exponente ==0) {
            return 1;
        }
        //El el caso de que exponente sea negativo llamamos a esta funcion de manera recursiva 
        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }
        //Inicializamos n como acumulador en 1 para poder multiplicar en cada una de las interaciones del ciclo
        int n=1;
        for(int i =0; i < Math.abs(exponente); i++){
            n = n * base; 
        }
        return n;

    } 
    /**
     * devuelve la cantidad como un numero entero, la cantidad del digito 
     * @param nu
     * @return
     */
    public static int Digitos (int nu){
        if(nu <0){
            nu = -nu;
        }
        if (nu == 0) {
            return 1;
        }
        else{ 
           int n = 0;
        while (nu > 0) {
            nu = nu / 10; // esto le quita un digito a numero 
            n++; // Incrementa la cantidad de digitos
        }
        return n;
    }
}
}