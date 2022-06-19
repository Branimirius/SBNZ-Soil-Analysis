package sbnz.integracija.example.facts;

public class Recommendation {
	private double caco3;
	private double manure;
	private String kgNPK;
	
	private Fertilizer fertilizerNPK;
	private String stringFertNPK;
	private double massFertilizerNPK;
	private Fertilizer fertilizerN;
	private double massFertilizerN;
	private Boolean nitroOptimised;
	
	public double getCaco3() {
		return caco3;
	}
	public void setCaco3(double caco3) {
		this.caco3 = caco3;
	}
	public double getManure() {
		return manure;
	}
	public void setManure(double manure) {
		this.manure = manure;
	}
	public String getKgNPK() {
		return kgNPK;
	}
	public void setKgNPK(String kgNPK) {
		this.kgNPK = kgNPK;
	}
	public Fertilizer getFertilizerNPK() {
		return fertilizerNPK;
	}
	public void setFertilizerNPK(Fertilizer fertilizerNPK) {
		this.fertilizerNPK = fertilizerNPK;
	}
	
	public String getStringFertNPK() {
		return stringFertNPK;
	}
	public void setStringFertNPK(String stringFertNPK) {
		this.stringFertNPK = stringFertNPK;
	}
	public double getMassFertilizerNPK() {
		return massFertilizerNPK;
	}
	public void setMassFertilizerNPK(double massFertilizerNPK) {
		this.massFertilizerNPK = massFertilizerNPK;
	}
	public Fertilizer getFertilizerN() {
		return fertilizerN;
	}
	public void setFertilizerN(Fertilizer fertilizerN) {
		this.fertilizerN = fertilizerN;
	}
	public double getMassFertilizerN() {
		return massFertilizerN;
	}
	public void setMassFertilizerN(double massFertilizerN) {
		this.massFertilizerN = massFertilizerN;
	}
	
	public Boolean getNitroOptimised() {
		return nitroOptimised;
	}
	public void setNitroOptimised(Boolean nitroOptimised) {
		this.nitroOptimised = nitroOptimised;
	}
	public Recommendation(double caco3, double manure, String kgNPK, Fertilizer fertilizerNPK, double massFertilizerNPK,
			Fertilizer fertilizerN, double massFertilizerN) {
		super();
		this.caco3 = caco3;
		this.manure = manure;
		this.kgNPK = kgNPK;
		this.fertilizerNPK = fertilizerNPK;
		this.massFertilizerNPK = massFertilizerNPK;
		this.fertilizerN = fertilizerN;
		this.massFertilizerN = massFertilizerN;
		this.stringFertNPK = "";
		this.nitroOptimised = false;
	}
	public Recommendation() {}
	
	public Recommendation(Recommendation rec) {
		this.caco3 = rec.caco3;
		this.manure = rec.manure;
		this.kgNPK = rec.kgNPK;
		this.fertilizerNPK = rec.fertilizerNPK;
		this.massFertilizerNPK = rec.massFertilizerNPK;
		this.fertilizerN = rec.fertilizerN;
		this.massFertilizerN = rec.massFertilizerN;
		this.stringFertNPK = rec.stringFertNPK;
		this.nitroOptimised = rec.nitroOptimised;
	}
	
	
}
