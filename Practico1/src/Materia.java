import java.util.ArrayList;

public class Materia implements Inscripcion {
    private int id;
    private String name;
    private boolean condition = false;
    private ArrayList<Materia> correlativas = new ArrayList<>();


    //Constructor
    public Materia() {
    }

    public Materia(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public void inscripcionAlumno(Alumno alumno) {
        if (alumno.getMateriasAprobadas().containsAll(this.correlativas)){
            System.out.println(alumno.getName() + " se pudo inscribir a "+ this.name);
        } else {
            System.out.println(alumno.getName() + " no se pudo inscribir a " + this.name);
        }
    }
    @Override
    public void agregarCorrelativas(Materia m){
        this.correlativas.add(m);
        for (Materia c : correlativas) {
            System.out.println("Correlativas para "+ this.name +" son: "+ c.name);
        }
    }
}
