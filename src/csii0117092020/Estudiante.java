package csii0117092020;


public class Estudiante extends Persona{
       
    private String idioma;
    private int nivel;
    private double promedio;

    public Estudiante() {
    }
    

    public Estudiante(int id, String nombre, String apellidos, int edad, String sexo, boolean graduado, String idioma, int nivel, double promedio) {
        super(id, nombre, apellidos, edad, sexo, graduado);
        this.idioma = idioma;
        this.nivel = nivel;
        this.promedio = promedio;
    }
       
    
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
        
}
