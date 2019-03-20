import java.util.Comparator;

public class ComparatorConsumoColor implements Comparator<Electrodomesticos> {

	@Override
	public int compare(Electrodomesticos e1, Electrodomesticos e2) {
		if (e1.getConsumo() < e2.getConsumo())
			return -1;
		else if (e1.getConsumo() > e2.getConsumo())
			return 1;
		else {
			return e1.getColor().compareTo(e2.getColor());
		}
	}

}
