public class macota{
    private int edad;
    private int estatura;
    private String nombre;
}

public macota(int edad, int estatura, String nombre){
    this.edad=edad;
    this.estatura=estatura;
    this.nombre=nombre;
}

public int getEdad(){
    return edad;
}

public void setEdad (int edad){
    this.edad=edad;
}

public int getEstatura(){
    return estatura;
}
public void setEstatura(int estatura){
    this.estatura=estatura;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;

}

public void mostrarInfo(){
        System.out.println("Informacionde de una mascota");
        System.out.println("edad: " + getEdad());
        System.out.println("estatura: " + getEstatura());
        System.out.println("estatura: " + getNombre());
}

