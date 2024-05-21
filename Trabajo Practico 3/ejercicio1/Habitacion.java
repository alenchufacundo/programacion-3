import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int cantidadCamas;
    private boolean isComplete;
    private List<Paciente> pacientesInternados;

    public Habitacion(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
        this.isComplete = false;
        this.pacientesInternados = new ArrayList<Paciente>();
    }

    public boolean isComplete() {
        return isComplete;
    }

    public List<Paciente> getPacientesInternados() {
        return pacientesInternados;
    }

    public void internarPaciente(Paciente paciente) {
        // si no es true.
        if (!isComplete) {

            // agrega
            pacientesInternados.add(paciente);
            // si la longitud de la lista es mayor o igual que la cantidad de camas,
            // isComplete pasa a ser true.
            if (pacientesInternados.size() == cantidadCamas) {
                isComplete = true;
            } else {
                System.out.println("No hay camas suficientes");
            }
        }
    }

    public void altaPaciente(Paciente paciente) {
        // remueve de la lista
        boolean isAlta = pacientesInternados.remove(paciente);
            if(isAlta) {
                isComplete = false;
            } else {
                System.out.println("El paciente no se encuentra internado en dicha habitacion");
            }       

    }

}
