
public class TestSistema {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		
		g.setContraseña(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticar(g);
		
		/*Autenticacion referencia = new Gerente();

		Autenticacion referencia = new Cliente();

		Autenticacion referencia = new Administrador();*/
	}
}
