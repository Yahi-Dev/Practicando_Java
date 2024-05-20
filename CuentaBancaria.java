public class CuentaBancaria
{
   public int numeroDeCuenta;
   public double saldo;
   int duracionSegundos = 3;
    
    public CuentaBancaria(int numeroDeCuenta)
    {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0.0;
    }

    public void depositar (double cantidad)
    {
        saldo += cantidad;
        System.out.println("Su deposito se ha hecho con exito");
        try
        {
            Thread.sleep(duracionSegundos * 1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Su saldo actual es " + saldo + " Pesos");
    }

    public void retirar (double cantidad)
    {
        saldo = 100000;
       if (cantidad > saldo)
       {
        System.out.println("Su saldo no es suficiente para el monto solicitado");
        try
        {
            Thread.sleep(duracionSegundos * 1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Su saldo actual es " + saldo + " Pesos");
       }
       else
       {
        saldo -= cantidad;
        System.out.println("Se ha retirado un monto de " + cantidad + " pesos");
        try
        {
            Thread.sleep(duracionSegundos * 1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Su saldo actual es " + saldo + " Pesos");
       }
    }

    public void obtenerSaldo()
    {
        System.out.println("Su saldo actual es " + saldo + " Pesos");
    }
}
