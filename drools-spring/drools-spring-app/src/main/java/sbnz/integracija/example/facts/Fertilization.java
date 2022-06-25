package sbnz.integracija.example.facts;

public class Fertilization {
	private String fertilizer;
	private int daysAgo;
	public Fertilization(String fertilizer, int daysAgo) {
		super();
		this.fertilizer = fertilizer;
		this.daysAgo = daysAgo;
	}
	
	public Fertilization() {}

	public String getFertilizer() {
		return fertilizer;
	}

	public void setFertilizer(String fertilizer) {
		this.fertilizer = fertilizer;
	}

	public int getDaysAgo() {
		return daysAgo;
	}

	public void setDaysAgo(int daysAgo) {
		this.daysAgo = daysAgo;
	}
	
	
}
