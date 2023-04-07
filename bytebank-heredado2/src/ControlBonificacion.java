
public class ControlBonificacion {
	private double suma;
	
	
	public void registrar(Funcionario e) {
		//double boni = e.getBonificacion();
		//this.suma = this.suma + boni;
		this.suma += e.getBonificacion();
	}
	
	public double getSuma() {
		return this.suma;
	}
}
