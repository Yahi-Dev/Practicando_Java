public class Persona
{
  private static String nombre;
  private String apellido;
  private int edad;
  private char sexo;

  public Persona()
  {
    System.out.println(nombre);
    System.out.println("Método constructor de persona");
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad > 0 && edad <= 130) {
    this.edad = edad;  
    }
    else{
      System.out.println("La edad no es correcta " + edad);
    }
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    if (sexo == 'M' || sexo == 'F') {
    this.sexo = sexo;  
    }
  }

  public static void main(String[] args) 
  {
     // System.out.println(nombre);
      comer();

  }

  public static void comer ()
  {
   System.out.println("Comiendo");
  }

  public void hablar()
  {
   System.out.println("Hablando");
  }

  public void caminar()
  {
   System.out.println("Caminando");
  }

  public void dormir()
  {
   System.out.println("Durmiendo");
  }


}