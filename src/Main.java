import Profesor.ProfesorAdjunto;
import Profesor.ProfesorTitular;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DigitalHouseManager unDigitalManager = new DigitalHouseManager();

        //2. Dar de alta dos profesores titulares y dos profesores adjuntos. (Inventar todos sus valores)
        unDigitalManager.altaProfesorTitular("Daniel", "Bonilla", 1, "Doctorado");
        unDigitalManager.altaProfesorTitular("Leonardo", "Gonzalez", 2, "Ingeniero");
        unDigitalManager.altaProfesorAdjunto("Jorge", "Gomez", 3, 20);
        unDigitalManager.altaProfesorAdjunto("Claudio", "Perez", 4, 22);

        //3. Dar de alta dos cursos.
        unDigitalManager.altaCurso("Full Stack", 20001, 3);
        unDigitalManager.altaCurso("Android", 20002, 2);

        //4. Asignarle un profesor titular y un adjunto a cada curso.
        unDigitalManager.asignarProfesores(20001, 1, 3);
        unDigitalManager.asignarProfesores(20002, 2, 4);

        //5. Dar de alta a tres alumnos. (Inventar todos sus valores).
        unDigitalManager.altaAlumno("Juan", "Perez", 1);
        unDigitalManager.altaAlumno("Jorge", "Gutierrez", 2);
        unDigitalManager.altaAlumno("Pedro", "Gallego", 3);

        //6. Inscribir a dos alumnos en el curso de Full Stack.
        unDigitalManager.inscribirAlumno(1, 20001);
        unDigitalManager.inscribirAlumno(2, 20001);

        //7. Inscribir a dos alumnos en el curso de Android.
        unDigitalManager.inscribirAlumno(1, 20002);
        unDigitalManager.inscribirAlumno(2, 20002);

        //8. Inscribir a tres alumnos en el curso de Android.
        unDigitalManager.inscribirAlumno(3, 20002);

    }

}
