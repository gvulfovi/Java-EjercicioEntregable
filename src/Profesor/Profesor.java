package Profesor;

/**
 * Created by Gabriel on 03/04/2017.
 */
public class Profesor {

    //Definir atributos

    private String nombre, apellido;
    private Integer antiguedad;
    private Integer codigo;

    //Definir constructor

    public Profesor(String nombre, String apellido, Integer codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = 0;
        this.codigo = codigo;
    }

    //Definir overrides

    @Override
    public boolean equals(Object oBjeto) {

        if (this == oBjeto) return true;
        if (!(oBjeto instanceof Profesor)) return false;

        Profesor profesor = (Profesor) oBjeto;

        if(codigo.equals(profesor.codigo)){
           return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Profesor: " + codigo + " " + nombre + " " + apellido;
    }

    //Definir getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

//Definir setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    //Definir metodos
}
