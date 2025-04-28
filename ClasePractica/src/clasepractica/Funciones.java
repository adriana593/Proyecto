

package clasepractica;
public class Funciones {
    public static boolean isTernaPitagorica(int a, int b, int c){
     return Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2);
    
    }
    public static boolean isTerminoCorrect( int a, int b) {
        return a == sumaFibonacci(b);
                    
    }
    private static int sumaFibonacci(int c){
        int a = 1;
        int b = 0;
        int fib = 0;
        if ( c == 0 )
            return b;
        for(int i = 1; i <= c; i++){
            fib = a + b;
             b = a;
             a = fib;
        }
        return fib;
      }
}
