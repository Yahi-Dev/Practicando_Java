public class Tv 
{
  String canal = "Cambiando de canal";
  String volumensubir = "Subiendo el volumen de la TV";
  String volumenBajar = "Bajando el volumen de la TV";
  String configuracion = "Abriendo la configuración"; 
  
  
  public void cambiarCanal ()
  {
    System.out.println("Cambiando de canal");
  }

  public void subirVolumen ()
  {
    System.out.println("Subiendo el volumen de la TV");
  }

  public void bajarVolumen ()
  {
    System.out.println("Bajando el volumen de la TV");
  }

  public void configuracionTv ()
  {
    System.out.println("Abriendo la Configuarición de la TV");
  }

  public static void main(String[] args)
  {
    Tv tvsTv = new Tv();

    tvsTv.cambiarCanal();
    System.out.println("\n");
    tvsTv.subirVolumen();
    System.out.println("\n");
    tvsTv.bajarVolumen();
    System.out.println("\n");
    tvsTv.configuracionTv();
  }
}
