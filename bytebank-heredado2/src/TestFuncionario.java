
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario oscar = new Gerente();
		
		oscar.setNombre("Oscar Rivera");
		oscar.setDocumento("12354");
		oscar.setSalario(2590.80);
		
		System.out.println(oscar.getNombre());
		System.out.println(oscar.getBonificacion());
	}
}
