package fp.utiles.codigo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import fp.utiles.common.Checkers;

public class GoldDigger implements Comparable<GoldDigger> {
	// ATRIBUTOS
	private Integer num; //ENUMERACION
	private LocalDate date;//FECHA SOLICITUD
	private Pelo cheveux;//COLOR DE PELO
	private Integer age;//EDAD
	private Integer exp;//EXPERIENCIA LABORAL
	private Double salaire;//EXPECTATIVA DE SALARIO
	private Sexo sexe;//SEXO 
	private String diplome;//DIPLOMATURA
	private String specialite;//ESPECIALIDAD
	private Double note;//NOTA SOBRE 100 SOBRE LA BUSQUEDA DE ORO
	private Boolean dispo;//DISPONIBILIDAD
	private Boolean embauche;//CONTRATADO
	private List<String> paises;//PAISES PREFERIDOS

		
	// CONSTRUCTORES

	public GoldDigger(Integer num, LocalDate date, Pelo cheveux, Integer age, Integer exp, Double salaire, Sexo sexe,
			String diplome, String specialite, Double note, String dispo, String embauche, String paises) {
		
		Checkers.check("LA EXPERIENCIA NO PUEDE SER 0", exp > 0 );
		Checkers.checkNoNull("num,cheveux");
		Checkers.check("LA FECHA DE SOLICITUD NO PUEDE SER LA FECHA ACTUAL", date.isBefore(LocalDate.now()));
		
		this.num = num;
		this.date = date;
		this.cheveux = cheveux;
		this.age = age;
		this.exp = exp;
		this.salaire = salaire;
		this.sexe = sexe;
		this.diplome = diplome;
		this.specialite = specialite;
		this.note = note;
		this.dispo = comprobar_disponibilidad(dispo);
		this.embauche = comprobar_contrato(embauche);
		this.paises = creador_lista(paises);
	}

	public GoldDigger(Integer num, LocalDate date, Pelo cheveux, Integer age) {
		Checkers.check("LA EXPERIENCIA NO PUEDE SER 0", exp > 0 );
		Checkers.checkNoNull("num");
		Checkers.check("LA FECHA DE SOLICITUD NO PUEDE SER LA FECHA ACTUAL", date.isBefore(LocalDate.now()));
		
		this.num = num;
		this.date = date;
		this.cheveux = cheveux;
		this.age = age;
	}

	// GETTERS Y SETTERS

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Pelo getCheveux() {
		return cheveux;
	}

	public void setCheveux(Pelo cheveux) {
		this.cheveux = cheveux;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Sexo getSexe() {
		return sexe;
	}

	public void setSexe(Sexo sexe) {
		this.sexe = sexe;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(String dispo) {
		this.dispo = comprobar_disponibilidad(dispo);
	}

	public boolean isEmbauche() {
		return embauche;
	}

	public void setEmbauche(boolean embauche) {
		this.embauche = embauche;
	}
	
	public List<String> isPaises() {
		return paises;
	}
	
	public void setPaises(String paises) {
		this.paises = creador_lista(paises);
	}

	// FUNCIONES
	static boolean comprobar_disponibilidad(String validacion) {
		boolean resultado;
		if (validacion.equals("oui")) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	static boolean comprobar_contrato(String validacion) {
		boolean resultado;
		if (validacion.equals("1")) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	private List<String> creador_lista(String paises){ //Creador del lista a partir de un String separados por punto y coma
		String[] x_separados = paises.split(";");
		List<String> lista = Arrays.asList(x_separados);
		return lista;
		}

	@Override
	public int hashCode() {
		return Objects.hash(age, cheveux, date, diplome, dispo, embauche, exp, note, num, salaire, sexe, specialite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoldDigger other = (GoldDigger) obj;
		return age == other.age && cheveux == other.cheveux && Objects.equals(date, other.date)
				&& Objects.equals(diplome, other.diplome) && dispo == other.dispo && embauche == other.embauche
				&& exp == other.exp && Double.doubleToLongBits(note) == Double.doubleToLongBits(other.note)
				&& num == other.num && Double.doubleToLongBits(salaire) == Double.doubleToLongBits(other.salaire)
				&& sexe == other.sexe && Objects.equals(specialite, other.specialite);
	}

	// PROPIEDAD DERIVADA
	public String getPerfilLaboral() {
		if (this.exp < 5) {
			return "junior";
		}

		return "senior";

	}

	// TO STRING
	public String toString() {
		return "Base [num=" + num + ", date=" + date + ", cheveux=" + cheveux + ", age=" + age + ", exp=" + exp
				+ ", salaire=" + salaire + ", sexe=" + sexe + ", diplome=" + diplome + ", specialite=" + specialite
				+ ", note=" + note + ", dispo=" + dispo + ", embauche=" + embauche + ", paises= " + paises + "]";
	}

	@Override
	public int compareTo(GoldDigger b) {
		return this.num.compareTo(b.num);
	}


}

