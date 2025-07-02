package matematicas;

public class Varias {
    /**
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
}
