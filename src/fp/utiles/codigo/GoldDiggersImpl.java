package fp.utiles.codigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.utiles.codigo.GoldDigger;

public class GoldDiggersImpl implements GoldDiggers{
	
	private List<GoldDigger> goldDigger;

	public GoldDiggersImpl() {
		goldDigger = new ArrayList<GoldDigger>();
	}

	/**
	 * @param partidas Colección de partidas. Crea un objeto de tipo Partidas a
	 *                 partir de una colección de partidas de ajedrez
	 */
	public GoldDiggersImpl(Collection<GoldDigger> goldDigger) {
		this.goldDigger = new ArrayList<GoldDigger>(goldDigger);
	}

	/**
	 * @param partidas Stream de partidas Crea un objeto de tipo Partidas a partir
	 *                 de una colección de partidas de ajedrez.
	 * @return 
	 */
	public void GoldDigger(Stream<GoldDigger> goldDigger) {
		this.goldDigger = goldDigger.collect(Collectors.toList());
	}

	public int getNumeroDatos() {
		return goldDigger.size();
	}

	public void agregarGoldDigger(GoldDigger p) {
		goldDigger.add(p);
	}
	public void eliminarGoldDigger(GoldDigger p) {
		goldDigger.remove(p);
	}
	public int hashCode() {
		return Objects.hash(goldDigger);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoldDiggersImpl other = (GoldDiggersImpl) obj;
		return Objects.equals(goldDigger, other.goldDigger);
	}
	public Double getPromedioEdad(GoldDigger edad) {
		return GoldDiggers.stream()
				.mapToDouble(p -> p.getAge() / Factoria.numElementos())
				.average()
				.orElse(0);
	}
	
	public SortedSet<GoldDigger> getNMayoresNotas(int n){
		Comparator<GoldDigger> b =  Comparator.comparing(GoldDigger::getNote).thenComparing(Comparator.naturalOrder());;
		return GoldDiggers.stream()
				.sorted(Comparator.comparing(GoldDigger::getNote))
				.limit(n)
				.collect(Collectors.toCollection(()->new TreeSet<GoldDigger>(b)));
	}
	
	public Boolean hayPersonasConMasEdadQueLaMedia(Integer n) {
		Predicate<GoldDigger> filtro = p-> p.getAge();
		Map<String, Long> mc = getPromedioEdad(filtro);
			return mc.values().stream()
					.anyMatch (num -> num >n);
	}
	public Double getPromedioNotasPor(GoldDigger diplome) {
		return GoldDiggers.stream().filter(p -> p.getDiplome().equals(diplome))
				.mapToDouble(p -> p.getNote() / p.getDiplome().length())
				.average()
				.orElse(0);
	}

	public void OrdernarPorC(Comparator<? super fp.utiles.codigo.GoldDigger> c) {
		goldDigger.sort(c);
	}
	
}

		
