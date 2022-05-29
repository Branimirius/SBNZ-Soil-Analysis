package sbnz.integracija.example.facts;

public class Plant {
	private double pH;
	private double nConsumption;
	private double pConsumption;
	private double kConsumption;
	public double getpH() {
		return pH;
	}
	public void setpH(double pH) {
		this.pH = pH;
	}
	public double getnConsumption() {
		return nConsumption;
	}
	public void setnConsumption(double nConsumption) {
		this.nConsumption = nConsumption;
	}
	public double getpConsumption() {
		return pConsumption;
	}
	public void setpConsumption(double pConsumption) {
		this.pConsumption = pConsumption;
	}
	public double getkConsumption() {
		return kConsumption;
	}
	public void setkConsumption(double kConsumption) {
		this.kConsumption = kConsumption;
	}
	
	public Plant(double pH, double nConsumption, double pConsumption, double kConsumption) {
		super();
		this.pH = pH;
		this.nConsumption = nConsumption;
		this.pConsumption = pConsumption;
		this.kConsumption = kConsumption;
	}
	
	
}
