package Entidad;

public class Persona {
    
    
    private String nombre;
    private String apellido;
    private String dni;
    private double altura;
    private String sexo;
    private int edad;
    private String ocupacion;
    
    public Persona(){
    }

    public Persona(String nombre, String apellido, String dni, double altura, String sexo, int edad, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.altura = altura;
        this.sexo = sexo;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }
    
    
}
