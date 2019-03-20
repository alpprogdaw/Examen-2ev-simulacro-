import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prueba {

	public static void main(String[] args) throws Exception {
		ArrayList<Electrodomesticos> lista = new ArrayList<>(); 
		lista.add(new Televisores(573.99f, Color.NEGRO, Consumo.A, 2.5f, 40, TDT.normal));
		lista.add(new Lavadora(300f, Color.GRIS, Consumo.B, 63f, 5));
		lista.add(new Frigorificos(659.99f, Color.BLANCO, Consumo.B, 47, false));
		mostrarLista(lista);
		Collections.sort(lista);
		mostrarLista(lista);
		Collections.sort(lista, Collections.reverseOrder());
		mostrarLista(lista);
		Collections.sort(lista, new ComparatorPeso());
		mostrarLista(lista);
		Collections.sort(lista, Collections.reverseOrder(new ComparatorPeso()));
		mostrarLista(lista);
		Collections.sort(lista, new ComparatorConsumoColor());
		mostrarLista(lista);
		mostrarLista(lista);
		Collections.sort(lista);
		mostrarLista(lista);
	}
	
	public static void mostrarLista(ArrayList<Electrodomesticos> lista) {
		Iterator<Electrodomesticos> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
