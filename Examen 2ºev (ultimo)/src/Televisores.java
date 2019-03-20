
public class Televisores extends Electrodomesticos {
	private float tamaño = 20;
	private TDT tdt = TDT.normal;
	
	public Televisores(float tamaño, TDT tdt) {
		super(precio_base, color, consumo, peso);
		this.tamaño = tamaño;
		this.tdt = tdt;
	}

	public  int precioFinal(int precio_base) {
		int precio_consumo = 0;
		int precio_peso = 0;
		int precio_final;
		switch (consumo) {
		case A:
			precio_consumo = precio_base + 100;
			break;
		case B:
			precio_consumo = precio_base + 80;
			break;
		case C:
			precio_consumo = precio_base + 60;
			break;
		case D:
			precio_consumo = precio_base + 50;
			break;
		case E:
			precio_consumo = precio_base + 30;
			break;
		case F:
			precio_consumo = precio_base + 10;
			break;
		}
		if (peso > 0 && peso < 19) {
			precio_peso = precio_base + 10;
		}
		if (peso > 20 && peso < 49) {
			precio_peso = precio_base + 50;
		}
		if (peso > 50 && peso < 79) {
			precio_peso = precio_base + 80;
		}
		if (peso > 80) {
			precio_peso = precio_base + 100;
		}
		precio_final = precio_base +  (precio_consumo + precio_peso);
		return precio_final;
	}
}
