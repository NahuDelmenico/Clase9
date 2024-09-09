import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		Empleado Trabajador1 = new Empleado("Juan Carlos Garcia", LocalDate.of(2021, 8, 15),20000);
		
		JOptionPane.showMessageDialog(null, "Tiene " + Trabajador1.calcularDiasVacaciones() +" dias de vacaciones" );
		JOptionPane.showMessageDialog(null, "Su aumento de salario es de $" + Trabajador1.calcularAumentoSueldo() );
	}

}
