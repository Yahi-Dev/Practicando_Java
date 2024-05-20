public class Practica1
{
  public static void main (String [] args)
  {
    
    //Practica 1
    //Realizar los siguientes programas:

    //1. Realizar un programa que imprima los números pares del 2 al 80 utilizando ciclos:
    
    int par;

    System.out.println("Los numeros pares dentro del 2 y el 80 son: ");
    System.out.println(" ");

    for (par = 0; par <= 80; par++)
    {
      if ((par % 2)==0) 
      {
        System.out.println(par);
      }
    }
    System.out.println("\n \n \n A Continuancion el 2do ejercicio: \n");

    //2. Realizar un programa que imprima la sumatoria de los números del 1 al 20 utilizando ciclos. (1+2+3.... + N):

    int n = 20;
    int sumatoria = 0;
    int i = 1;

    while (i <= n)
    {
        sumatoria += i;
        i++;    
    }
    System.out.println("La sumatoria de los numreos del 1 al 20, es: " + sumatoria);

    System.out.println("\n \n \n A continuación el 3er ejercicio: \n");

    //3. Realizar un programa que imprima las tablas de multiplicar del 2 al 8 utilizando ciclos anidados. (La tabla del 2 completa, la del 3 etc... hasta la tabla del 8):

    for (int j = 1; j <= 8; j++)
    {
        for (int j2 = 0; j2 <=10; j2++)
        {
            System.out.println(j + " * " + j2 + " = " + j*j2 );
        }
        System.out.println();
    }
  }
}
