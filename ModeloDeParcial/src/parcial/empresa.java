package parcial;

public class empresa {

	public static void main(String[] args) {
		opetarivo o1= new opetarivo("nom", "ape", 10000, 6, "junior");
		administrativo a1= new administrativo("nom2", "ape2", 10000, 6, "B");
		System.out.println("Empleado: Nombre:" + o1.getNombre() + ", Apellido: " + o1.getApellido() + ", Salario anual: " + o1.getSalarioanual() + "Bono: " + o1.calcularbno() + ", años:" + o1.getBono() + "Nivel: " + o1.getNivel());
		System.out.println("Empleado: Nombre:" + a1.getNombre() + ", Apellido: " + a1.getApellido() + ", Salario anual: " + a1.getSalarioanual() + "Bono: " + a1.calcularbno() + ", años:" + a1.getBono() + "Nivel: " + a1.getClase());
	}
}