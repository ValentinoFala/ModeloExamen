package parcial;

public class administrativo extends empleado{
	private String clase;

	public administrativo(String nombre, String apellido, double salarioanual, double años, String clase) {
		super(nombre, apellido, salarioanual, años);
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	

	public double calcularbno() {
		double bono;
		bono=(salarioanual*0.10);
		if (años < 5) {
			bono=salarioanual*0.10;
		}
		else {
			bono=salarioanual*0.15;
		}
		return bono;
	}
	
}
