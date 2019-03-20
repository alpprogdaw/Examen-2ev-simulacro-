
public class Televisores extends Electrodomesticos {
	private float tamaño = 20;
	private TDT tdt = TDT.normal;
	
	public Televisores(float precio_base, float peso, float tamaño, TDT tdt) throws Exception {
		super(precio_base, peso);
		this.tamaño = tamaño;
		this.tdt = tdt;
	}

	public Televisores(float precio_base, Color color, Consumo consumo, float peso, float tamaño, TDT tdt) {
		super(precio_base, color, consumo, peso);
		this.tamaño = tamaño;
		this.tdt = tdt;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisores [tamaño=" + tamaño + ", tdt=" + tdt + "]";
	}
}
