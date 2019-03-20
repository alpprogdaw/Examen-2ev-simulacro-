
public class Televisores extends Electrodomesticos {
	private float tama�o = 20;
	private TDT tdt = TDT.normal;
	
	public Televisores(float precio_base, float peso, float tama�o, TDT tdt) throws Exception {
		super(precio_base, peso);
		this.tama�o = tama�o;
		this.tdt = tdt;
	}

	public Televisores(float precio_base, Color color, Consumo consumo, float peso, float tama�o, TDT tdt) {
		super(precio_base, color, consumo, peso);
		this.tama�o = tama�o;
		this.tdt = tdt;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisores [tama�o=" + tama�o + ", tdt=" + tdt + "]";
	}
}
