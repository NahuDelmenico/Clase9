import java.time.LocalDate;
import java.time.Period;

public class Empleado {

	private String nombre; 
	private LocalDate fechaInicio;
	private double salario;
	
	public Empleado (String nombre, LocalDate fechaInicio, double salario){
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.salario=salario;
		
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public int calcularDiasVacaciones() {
		
	return	Period.between(this.fechaInicio,LocalDate.now()).getYears()*7;
		
	}
	
	public double calcularAumentoSueldo(){
		
		double anos = Period.between(this.fechaInicio, LocalDate.now()).getYears();
		this.salario= salario+(anos*1000);
		return anos*1000.0;
	}
	
	public double calcularIndemnizacionDespido(double salarioBase) {
		double anos = Period.between(this.fechaInicio, LocalDate.now()).getYears();
		return anos * this.salario;
	}
	
	
}
