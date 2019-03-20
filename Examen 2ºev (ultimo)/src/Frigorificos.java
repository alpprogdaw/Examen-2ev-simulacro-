
public class Frigorificos extends Electrodomesticos{
	private boolean no_frost = false; 
	
	public Frigorificos(float precio_base, float peso, boolean no_frost) throws Exception {
		super(precio_base, peso);
		this.no_frost = no_frost;
	}
	
	public Frigorificos(float precio, Color color, Consumo consumo, float peso, boolean no_frost) throws Exception {
		super(precio, color, consumo, peso);
		this.no_frost = no_frost;
	}

	@Override
	public String toString() {
		return super.toString() + "Frigorificos [no_frost=" + no_frost + "]";
	}
}
