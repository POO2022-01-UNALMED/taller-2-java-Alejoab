package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[6];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
        
        for (Asiento i : asientos){
            if (i != null){
                cantidad = cantidad + 1;
            } else {
                break;
            }
        }
        return cantidad;
	}
	
	String verificarIntegridad() {
		String texto = "";
		if (motor.registro != registro) {
			texto = "Las piezas no son  originales";
		} else{
			texto = "Auto original";
			int e = 0;
			while(asientos[e] != null) {
				if (asientos[e].registro != registro) {
					texto = "Las piezas no son originales";
					break;
				}
				e++;
			}
		}
		
		return texto;
	}
}
