package parcial;

public class empleado {
	protected String nombre;
	protected String apellido;
	protected double salarioanual;
	protected int años;
	public empleado(String nombre, String apellido, double salarioanual, double años) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioanual = salarioanual;
		this.años = (int) años;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSalarioanual() {
		return salarioanual;
	}
	public void setSalarioanual(double salarioanual) {
		this.salarioanual = salarioanual;
	}
	public double getBono() {
		return años;
	}
	public void setBono(int años) {
		this.años = años;
	}
}
