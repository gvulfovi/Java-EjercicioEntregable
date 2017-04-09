/**
 * Created by Gabriel on 03/04/2017.
 */
public class Alumno {


    //Definir atributos
    private String nombre, apellido;
    private Integer codigo;

    //Definir constructor

    public Alumno(String nombre, String apellido, Integer codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    //Definir overrides

    @Override
    public boolean equals(Object oBjeto) {
        if (this == oBjeto) return true;
        if (!(oBjeto instanceof Alumno)) return false;

        Alumno alumno = (Alumno) oBjeto;

        if(codigo.equals(alumno.codigo)){
            return  true;
        } else return false;

    }

    @Override
    public String toString() {
        return "Alumno: " + codigo + " - " + nombre + " " + apellido;
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

    //Definir setters

    //Definir metodos


}
