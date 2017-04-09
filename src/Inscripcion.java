import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 03/04/2017.
 */
public class Inscripcion {

    //Definir atributos

    private Alumno alumno;
    private Curso curso;
    private Date fechaDeInscripcion;

    //Definir constructor

    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaDeInscripcion = new Date();
    }


    //Definir overrides


    @Override
    public String toString() {

        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        return "Inscripcion " + curso +  " -> " + alumno + " - Fecha Inscripcion: " + formatoFecha.format(fechaDeInscripcion) ;
    }


    //Definir getters

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getFechaDeInscripcion() {
        return fechaDeInscripcion;
    }


    //Definir setters

    //Definir metodos


}
