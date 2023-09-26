package RegistroEmpresa;

public class UsuarioFinal extends Persona {
	
	private String usuario;
	private String password;

	public UsuarioFinal(String cargo, String nombre, String apellido, int edad, String usuario, String password) {
		super(cargo, nombre, apellido, edad);
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return super.toString()+
				" Usuario: " + this.getUsuario()+
				" Password: " + this.getPassword()+
				"\n";
	}
}
