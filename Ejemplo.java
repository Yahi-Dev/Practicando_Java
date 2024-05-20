class AutoMovil
{


    //Declarar los atributos privados.

    private String encender;
    private String apagar;
    private String acelerar; 
    private String frenar;


    //Declarar los metodos.
    public AutoMovil(String encender, String apagar, String acelerar, String frenar)
    {
        this.encender = encender;
        this.apagar = apagar;
        this.acelerar = acelerar;
        this.frenar = frenar;
        System.out.println("Constructor de AutoMovil");
        
    }


    // Getters & Setters.
    public String getEncender() 
    {
        return encender;
    }

    public void setEncender(String encender)
    {
        this.encender = encender;
    }

    public String getApagar() 
    {
        return apagar;
    }

    public void setApagar(String apagar) 
    {
        this.apagar = apagar;
    }

    public String getAcelerar() 
    {
        return acelerar;
    }

    public void setAcelerar(String acelerar) 
    {
        this.acelerar = acelerar;
    }

    public String getFrenar() 
    {
        return frenar;
    }

    public void setFrenar(String frenar) 
    {
        this.frenar = frenar;
    }
}

class Honda extends AutoMovil
{
  String marca;
  String modelo;
  int año;
  double precio;
  
  public Honda (String encender, String apagar, String acelerar, String frenar, String marca, String modelo, int año, double precio )
  {
    super(encender, apagar, acelerar, frenar);
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    this.precio = precio;
    System.out.println("Constructor de Honda");
   
   
  }

}

class HondaCivic extends Honda 
{
    public HondaCivic(String encender, String apagar, String acelerar, String frenar, String marca, String modelo, int año, double precio) {
        super(encender, apagar, acelerar, frenar, marca, modelo, año, precio);
        System.out.println("Constructor de HondaCivic");
    }

    
    //Sobre escritura de metodos llamando la clase padre
    public void encender()
    {
        super.getEncender();
        System.out.println("El honda civic esta acelerando");
    }

    //Sobre escritura de metodos
    public void apagar()
    {
        System.out.println("El honda civic se ha apagado");
    }

    public void acelerar()
    {
        System.out.println("El honda civic esta acelerando");
    }
}

class Metodos
 {
    public static void main(String[] args) {
        HondaCivic hondaCivic = new HondaCivic("Encender", "Apagar", "Acelerar", "Frenar", "Honda", "Civic", 2023, 25000.0);
        hondaCivic.encender();
        hondaCivic.apagar();
    }
}