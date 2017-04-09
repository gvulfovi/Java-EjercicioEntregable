import Profesor.Profesor;
import Profesor.ProfesorAdjunto;
import Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabriel on 03/04/2017.
 */
public class DigitalHouseManager {

    //Definir atributos

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    //Definir constructor

    public DigitalHouseManager() {
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones  = new ArrayList<>();;
    }

    //Definir overrides

    //Definir getters

    //Definir setters

    //Definir metodos

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDeAlumnos){

        Curso unCurso = new Curso(nombre, codigoCurso);
        unCurso.setCuporMaximoDeAlumnos(cupoMaximoDeAlumnos);

        if(!listaDeCursos.contains(unCurso)){
            listaDeCursos.add(unCurso);
        } else {
            System.out.println("El " + unCurso + " ya existe");
        }

    }

    public void bajaCurso(Integer codigoCurso){

        Curso cursoABorrar = null;

        for (Curso unCurso: listaDeCursos) {
            if (unCurso.getCodigo() == codigoCurso){
                cursoABorrar = unCurso;
                break;
            }
        }

        if (cursoABorrar != null) {
            listaDeCursos.remove(cursoABorrar);
        } else {
            System.out.println("El Codigo de Curso: " + codigoCurso + " no existe");
        }

    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){

        ProfesorAdjunto unProfesorAdjunto = new ProfesorAdjunto(nombre,apellido, codigoProfesor, cantidadDeHoras);

        if(!listaDeProfesores.contains(unProfesorAdjunto)){
            listaDeProfesores.add(unProfesorAdjunto);
        } else {
            System.out.println("El profesor: " + unProfesorAdjunto + " ya se encuentra asignado");
        }

    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){

        ProfesorTitular unProfesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);

        if(!listaDeProfesores.contains(unProfesorTitular)){
            listaDeProfesores.add(unProfesorTitular);
        } else {
            System.out.println("El profesor: " + unProfesorTitular + " ya se encuentra asignado");
        }

    }

    public void bajaProfesor(Integer codigoProfesor){

        Profesor profesorADarDeBaja = null;

        for (Profesor unProfesor: listaDeProfesores) {
            if (unProfesor.getCodigo() == codigoProfesor){
                profesorADarDeBaja = unProfesor;
                break;
            }
        }

        if (profesorADarDeBaja != null) {
            listaDeProfesores.remove(profesorADarDeBaja);
        } else {
            System.out.println("El Codigo de Profesor " + codigoProfesor +  " no existe");
        }

    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){

        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);

        if(!listaDeAlumnos.contains(unAlumno)){ // Si el alumno no esta previamente incluido
            listaDeAlumnos.add(unAlumno);

        } else {
            System.out.println("El " + unAlumno + " ya se encuentra inscrito");
        }

    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){

        Alumno alumnoAInscribir = null;
        Curso cursoValido = null;

        // Busco si el codigo corresponde a un Alumno ya inscripto
        for (Alumno unAlumno: listaDeAlumnos) {
            if(unAlumno.getCodigo().equals(codigoAlumno)){
                alumnoAInscribir = unAlumno;
                break;
            }
        }
        if (alumnoAInscribir == null){
            System.out.println("El codigo de Alumno "  + codigoAlumno + " no corresponde a un Alumno");
        }else { // Si el alumno esta incripto, busco si el curso existe
            for (Curso unCurso: listaDeCursos) {
                if(unCurso.getCodigo().equals(codigoCurso)){
                    cursoValido = unCurso;
                    break;
                }
            }

            if(cursoValido == null){
                System.out.println("El curso " + codigoCurso +  " no existe");
            } else { // Si el curso tambien es valido

                if(cursoValido.getListaDeAlumnosInscriptos().size() < cursoValido.getCuporMaximoDeAlumnos())  {

                   Inscripcion unaInscripcion = new Inscripcion(alumnoAInscribir, cursoValido);

                    listaDeInscripciones.add(unaInscripcion);
                    cursoValido.agregarUnAlumno(alumnoAInscribir);
                    System.out.println("El "  + alumnoAInscribir + " fue inscripto en el "  + cursoValido);
                } else {
                    System.out.println("El cupo del " + cursoValido + " fue excedido");
                }

            }
        }

    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){

        ProfesorTitular profesorTitularValido = null;
        ProfesorAdjunto profesorAdjuntoValido = null;
        Curso cursoValido = null;

        // Busco si el codigo de Profesor Titular
        for (Profesor unProfesorTitular: listaDeProfesores) {
            if(unProfesorTitular.getCodigo().equals(codigoProfesorTitular)){
                profesorTitularValido = (ProfesorTitular) unProfesorTitular;
                break;
            }
        }

        if(profesorTitularValido != null){
            // Busco si el codigo de Profesor Adjunto
            for (Profesor unProfesorAdjunto: listaDeProfesores) {
                if(unProfesorAdjunto.getCodigo().equals(codigoProfesorAdjunto)){
                    profesorAdjuntoValido = (ProfesorAdjunto) unProfesorAdjunto;
                    break;
                }
            }

            if(profesorAdjuntoValido != null){
                // Busco si el curso es valido
                for (Curso unCurso: listaDeCursos) {
                    if (unCurso.getCodigo().equals(codigoCurso)){
                        cursoValido = unCurso;
                        break;
                    }
                }

                if (cursoValido != null) {
                    cursoValido.setUnProfesorTitular(profesorTitularValido);
                    cursoValido.setUnProfesorAdjunto(profesorAdjuntoValido);

                } else {
                    System.out.println("El Codigo de Curso: " + codigoCurso + " no existe");
                }

            }
        }

    }
}
