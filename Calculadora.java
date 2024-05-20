//import javax.sound.sampled.SourceDataLine;

public class Calculadora 
{
    public int sumar(int a, int b)
    {
        int resultado = a +b;
        
        return a + b;        
        //return resultado;

       // System.out.println(resultado);
    }

    public int sumar(String msg, int a, int b)
    {
        int resultado = a + b;

        System.out.println(msg  + resultado);

        return resultado;
    }

    public int restar(int a, int b)
    {
        return a - b;
    }

    public int multiplicar(int a, int b)
    {
        return a * b;
    }

    public int dividir(int a, int b)
    {
        return a / b;
    }

    public static void main (String[] args)
    {
        Calculadora calc = new Calculadora();
       // Calculadora calc = new Calculadora();
       calc.sumar("El resultado es: ", 7, 8);
        
       //int resultadoSuma = calc.sumar(2, 8);
      // resultadoSuma /= 2;
       //System.out.println(resultadoSuma);

    }
}
