
package csii0117092020;

public class Trabajador extends Persona {
    
    private int salario, años;

    public Trabajador() {
    }

    public Trabajador(int salario, int años, int id, String nombre, String apellidos, int edad, String sexo, boolean graduado) {
        super(id, nombre, apellidos, edad, sexo, graduado);
        this.salario = salario;
        this.años = años;
    }

    public int getSalario() {
        return salario;
    }

    public int getAños() {
        return años;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setAños(int años) {
        this.años = años;
    }
    
    public String Aunmento(){
        String solicutud ;
        
        if(salario<750000)
        {
           solicutud = " Solicitud De Aumento Puede ser Posible ";
        }
        else
        {
            solicutud = " Solicitud De Aumento No Puede Ser Posible ";
        }
        return solicutud;
    }    
}
