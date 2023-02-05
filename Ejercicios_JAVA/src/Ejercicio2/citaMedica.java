package Ejercicio2;

public class citaMedica {
    public int codCita;
    public String fecha;
    public String hora;
    public int consultorio;
    public String nombreMedico;
    public String nombrePaciente;
    private String centroMedico;

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    public String crearCita() {

        return " Paciente no." + codCita + " " + nombrePaciente + " Le atenderá el médico " + nombreMedico + " en " + getCentroMedico() + " consultorio " + consultorio + " el dia " + fecha + " a las " + hora;
    }

    public String consultarCita(){
        return " Nombre: " + nombrePaciente + " Codigo: " + codCita + " Medico: " + nombreMedico + " En el consultorio: " + consultorio + " Día: " + fecha + " Hora: "+ hora + " Centro medico: " + centroMedico;
    }

    public void setHorario(String next) {
        this.hora = next;
    }

    public String cambiarHorario(){
        return "La hora será " + hora;
    }
}
