package Profesor;

/**
 * Created by Gabriel on 03/04/2017.
 */
public class ProfesorAdjunto extends Profesor{

    //Definir atributos
    private Integer cantidadDeHorasParaConsulta;

    //Definir constructor

     //Definir overrides

    public ProfesorAdjunto(String nombre, String apellido, Integer codigo, Integer cantidadDeHorasParaConsulta) {
        super(nombre, apellido, codigo);
        this.cantidadDeHorasParaConsulta = cantidadDeHorasParaConsulta;
    }

    //Definir getters

    public Integer getCantidadDeHorasParaConsulta() {
        return cantidadDeHorasParaConsulta;
    }

    //Definir setters

    public void setCantidadDeHorasParaConsulta(Integer cantidadDeHorasParaConsulta) {
        this.cantidadDeHorasParaConsulta = cantidadDeHorasParaConsulta;
    }

    //Definir metodos


}
