
public class Cliente implements Autenticacion {
	private String nombre;
	private String documento;
	private String telefono;


	private AutenticacionUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacionUtil();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public void setContraseña(int contraseña) {
		this.autenticador.setContraseña(contraseña);
	}

	@Override
	public boolean autenticar(int contraseña) {
		return this.autenticador.autenticar(contraseña);
	}

}
