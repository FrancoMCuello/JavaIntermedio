// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Se crean las instancias de Alumno
        Alumno alumno1 = new Alumno("Franco");
        Alumno alumno2 = new Alumno("Pedro");
        //Se crean las instancias de Materias
        Materia m1 = new Materia (1, "Diseño de Sistemas");
        Materia m2 = new Materia (2,"Paradigmas de Programación");
        Materia m3 = new Materia (3,"Algoritmos");
        Materia m4 = new Materia (4,"Estructuras de Datos");

        //Se agregan las correlativas de cada materia
        m1.agregarCorrelativas(m2);

        m2.agregarCorrelativas(m3);
        m2.agregarCorrelativas(m4);
        System.out.println();

        //Se agregan las materias que aprobó cada alumno
        alumno1.aprobarMateria(m4);
        alumno1.aprobarMateria(m3);

        alumno2.aprobarMateria(m4);
        System.out.println();

        //Se inscriben a las materias verificando las correlatividades
        m2.inscripcionAlumno(alumno1);
        m2.inscripcionAlumno(alumno2);
        m1.inscripcionAlumno(alumno1);
        System.out.println();

        //Franco ahora si aprueba  Paradigmas de la programacion
        alumno1.aprobarMateria(m2);
        m1.inscripcionAlumno(alumno1);


    }
}