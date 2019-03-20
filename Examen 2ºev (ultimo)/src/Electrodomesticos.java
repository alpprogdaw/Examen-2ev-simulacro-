
public abstract class Electrodomesticos {
	
	/*private static Map<Character, Float> precioPorConsumo = new HashMap<>();
	
	static {
		precioPorConsumo.put('A', 100f);
		precioPorConsumo.put('B', 80f);
		precioPorConsumo.put('C', 60f);
		precioPorConsumo.put('D', 50f);
		precioPorConsumo.put('E', 30f);
		precioPorConsumo.put('F', 10f);
	}*/
	
	private float precio_base = 100;
	private Color color = Color.BLANCO;
	private Consumo consumo = Consumo.F;
	private float peso = 5;
	
	public Electrodomesticos() {
		
	}

	public Electrodomesticos(float precio_base, float peso) throws Exception {
		if (precio_base < 0)
			throw new Exception("Error: el precio no puede ser negativo.");
		if (peso < 0)
			throw new Exception("Error: el peso no puede ser negativo.");
		this.precio_base = precio_base;
		this.peso = peso;
	}

	public Electrodomesticos(float precio_base, Color color, Consumo consumo, float peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	
	public float getPrecio_base() {
		return precio_base;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public float getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [precio_base=" + precio_base + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}

	public float precioFinal() {
		float precio_consumo = 0;
		float precio_peso = 0;
		float precio_final;
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
		precio_final = precio_base + (precio_consumo + precio_peso);
		return precio_final;
	}
}
