import Profesor.ProfesorAdjunto;
import Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabriel on 03/04/2017.
 */
public class Curso {

    //Definir atributos
    private String name;
    private Integer codigo;
    private ProfesorTitular unProfesorTitular;
    private ProfesorAdjunto unProfesorAdjunto;
    private Integer cuporMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnosInscriptos;

    //Definir constructor

    public Curso(String name, Integer codigo) {
        this.name = name;
        this.codigo = codigo;
        this.listaDeAlumnosInscriptos = new ArrayList<>();
    }


    //Definir overrides

    @Override
    public boolean equals(Object oBjeto) {
        if (this == oBjeto) return true;
        if (!(oBjeto instanceof Curso)) return false;

        Curso curso = (Curso) oBjeto;

        if(codigo.equals(curso.codigo)){
            return true;
        } else return false;

    }

    @Override
    public String toString() {
        return "Curso " + codigo + "-" + name;
    }

    //Definir getters

    public String getName() {
        return name;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public ProfesorTitular getUnProfesorTitular() {
        return unProfesorTitular;
    }

    public ProfesorAdjunto getUnProfesorAdjunto() {
        return unProfesorAdjunto;
    }

    public Integer getCuporMaximoDeAlumnos() {
        return cuporMaximoDeAlumnos;
    }

    public List<Alumno> getListaDeAlumnosInscriptos() {
        return listaDeAlumnosInscriptos;
    }

    //Definir setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setUnProfesorTitular(ProfesorTitular unProfesorTitular) {
        this.unProfesorTitular = unProfesorTitular;
    }

    public void setUnProfesorAdjunto(ProfesorAdjunto unProfesorAdjunto) {
        this.unProfesorAdjunto = unProfesorAdjunto;
    }

    public void setCuporMaximoDeAlumnos(Integer cuporMaximoDeAlumnos) {
        this.cuporMaximoDeAlumnos = cuporMaximoDeAlumnos;
    }

    //Definir metodos

    public Boolean agregarUnAlumno(Alumno unAlumno){

        return listaDeAlumnosInscriptos.add(unAlumno);

    }

    public void eliminarAlumno(Alumno unAlumno){

        listaDeAlumnosInscriptos.remove(unAlumno);

    }


}
