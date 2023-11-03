import java.util.ArrayList;

public class Alumno {
    private int id;
    private String name;
    private ArrayList<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void aprobarMateria(Materia materia){
        this.materiasAprobadas.add(materia);
        //materia.setCondition(true);
        System.out.println(this.name + " aprobó la materia: "+ materia.getName());
    }
}
