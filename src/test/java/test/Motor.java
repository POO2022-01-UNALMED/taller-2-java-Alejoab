package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		String[] tipos = {"electrico", "gasolina"};
		
		for (String e : tipos) {
			if (tipo.equals(e)) {
				this.tipo = tipo;
				break;
			}
		}
	}
}
