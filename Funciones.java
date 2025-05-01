

package clasepractica;
public class Funciones {
    public static boolean isTernaPitagorica(int a, int b, int c){
     return Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2);
    
    }
    public static boolean isCorrectTermino( int a, int num) {
        return a == sumaFibonacci(num);
        }
    public static int sumaFibonacci( int num ){
        int num1 = 0;
        int num2  = 1;
        int fib = 0;
        for(int i = 1; i <= num; i++){
          fib = num1 + num2;  
          num1 = num2;
          num2 = fib;
        }
       return fib;
    }
}
       

