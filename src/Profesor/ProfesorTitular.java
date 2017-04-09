package Profesor;

/**
 * Created by Gabriel on 03/04/2017.
 */
public class ProfesorTitular extends Profesor {

    //Definir atributos

    private String especialidad;

    //Definir constructor

    public ProfesorTitular(String nombre, String apellido, Integer codigo, String especialidad) {
        super(nombre, apellido, codigo);
        this.especialidad = especialidad;
    }

    //Definir overrides

    //Definir getters

    public String getEspecialidad() {
        return especialidad;
    }

    //Definir setters

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Definir metodos


}
