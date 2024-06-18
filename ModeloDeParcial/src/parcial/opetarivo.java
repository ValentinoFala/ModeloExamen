package parcial;

public class opetarivo extends empleado {
	private String nivel;

	public opetarivo(String nombre, String apellido, double salarioanual, int años, String nivel) {
		super(nombre, apellido, salarioanual, años);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double calcularbno() {
		double bono;
		bono=(salarioanual*0.15);
		if (años < 5) {
			bono=salarioanual*0.15;
		}
		else {
			bono=salarioanual*0.20;
		}
		return bono;
	}
	
}
