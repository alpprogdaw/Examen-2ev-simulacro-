import java.util.Comparator;

public class ComparatorPeso implements Comparator<Electrodomesticos> {

	@Override
	public int compare(Electrodomesticos e1, Electrodomesticos e2) {
		if (e1.getPeso() < e2.getPeso())
			return -1;
		else if (e1.getPeso() > e2.getPeso())
			return 1;
		return 0;
	}

}
