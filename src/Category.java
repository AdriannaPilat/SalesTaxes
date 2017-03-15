import java.util.ArrayList;

public class Category {
	private final String name;
	private ArrayList<String> products;
	
	Category(String n, ArrayList<String> p) {
		name = n;
		products = p;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getProducts() {
		return products;
	}
	
	public static Category createGroceries() {
		ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("Pieczywo");
        groceries.add("Mieso");
        groceries.add("Produkty mleczne");
        groceries.add("Owoce");
        groceries.add("Warzywa");
        groceries.add("Soki");
        groceries.add("Jajka");
        groceries.add("Przetwory");
        return new Category("Artyku³y spo¿ywcze", groceries);
	}
	public static Category createPreparedFood() {
		ArrayList<String> preparedFood = new ArrayList<String>();
		preparedFood.add("Konserwy");
        preparedFood.add("Chipsy");
        preparedFood.add("Slodycze");
        preparedFood.add("Alkohol");
        preparedFood.add("Wyroby tytoniowe");
        preparedFood.add("Napoje");
        preparedFood.add("Mro¿onki");
        return new Category("Gotowe jedzenie", preparedFood);
	}
	public static Category createPrescriptionDrugs() {
		ArrayList<String> prescriptionDrugs = new ArrayList<String>();
		prescriptionDrugs.add("Hydrocodone");
        prescriptionDrugs.add("Zocor");
        prescriptionDrugs.add("Lisinopril");
        prescriptionDrugs.add("Synthroid");
        prescriptionDrugs.add("Norvasc");
        prescriptionDrugs.add("Prilosec");
        prescriptionDrugs.add("Azithromycin");
        return new Category("Leki na receptê", prescriptionDrugs);
	}
	public static Category createNonPrescriptionDrugs() {
		ArrayList<String> nonPrescriptionDrugs = new ArrayList<String>();
		nonPrescriptionDrugs.add("Aspirin");
        nonPrescriptionDrugs.add("Antidiarrheals ");
        nonPrescriptionDrugs.add("Clotrimazole");
        nonPrescriptionDrugs.add("Butoconazole");
        nonPrescriptionDrugs.add("Diphenhydramine");
        nonPrescriptionDrugs.add("Antihistamine");
        nonPrescriptionDrugs.add("Suncare");
        return new Category("Leki bez recepty", nonPrescriptionDrugs);
	}
	public static Category createClothing() {
		ArrayList<String> clothing = new ArrayList<String>();
		clothing.add("Buty");
        clothing.add("P³aszcze");
        clothing.add("Podkoszulki");
        clothing.add("Zbroje");
        clothing.add("Sukienki");
        clothing.add("Spódnice");
        clothing.add("Kapelusze");
        return new Category("Odzie¿", clothing);
	}
	public static Category createIntangibles() {
		ArrayList<String> intangibles = new ArrayList<String>();
		intangibles.add("Zabawki");
        intangibles.add("Elektronika");
        intangibles.add("Broñ");
        intangibles.add("Meble");
        intangibles.add("Pojazdy");
        intangibles.add("Nieruchomoœci");
        intangibles.add("Zwierzêta");
        return new Category("Nieuchwytne", intangibles);
	}
}