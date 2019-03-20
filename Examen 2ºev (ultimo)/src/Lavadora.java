
public class Lavadora extends Electrodomesticos {
	private int carga = 5;

	public Lavadora(float precio_base, Color color, Consumo consumo, float peso, int carga) throws Exception {
		super(precio_base, color, consumo, peso);
		setCarga(carga);
	}
	
	public Lavadora(float precio_base, float peso, int carga) throws Exception {
		super(precio_base, peso);
		setCarga(carga);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Lavadora [carga=" + carga + "]";
	}

	private void setCarga(int carga) throws Exception {
		if (carga != 4 && carga != 5 && carga != 6 && carga != 7
				 && carga != 8 && carga != 10 && carga != 11 && carga != 13)
			throw new Exception("Error: carga especificada: "  + carga + ". La carga tiene que ser 4, 5, 6, 7, 8, 10, 11 o 13");
		this.carga = carga;  //lo indicamos aqui para no tener que ponerlo arriba en los constructores
	}

	public float precioFinal() {
		float precio_final = super.precioFinal();
		if (carga > 8) {
			precio_final = precio_final +  50;
		}
		return precio_final;
	}
}
