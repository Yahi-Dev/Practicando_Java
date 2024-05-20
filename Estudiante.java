public class Estudiante extends Persona {
    
    public void estudiar(){
        System.out.println("Estudiando");
    }

    @Override
    public void dormir(){
        System.out.println("Duerme menos");
    }
}
