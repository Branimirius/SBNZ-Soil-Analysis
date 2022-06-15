package sbnz.integracija.example.facts;

import org.kie.api.definition.type.Position;

public class Plant {
	@Position(0)
	private String name;
	private double phMin;
	private double phMax;
	private double humusMin;
	private double humusMax;
	private double nConsumption;
	private double pConsumption;
	private double kConsumption;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPhMin() {
		return phMin;
	}
	public void setPhMin(double phMin) {
		this.phMin = phMin;
	}
	
	public double getHumusMin() {
		return humusMin;
	}
	public void setHumusMin(double humusMin) {
		this.humusMin = humusMin;
	}
	public double getHumusMax() {
		return humusMax;
	}
	public void setHumusMax(double humusMax) {
		this.humusMax = humusMax;
	}
	public double getPhMax() {
		return phMax;
	}
	public void setPhMax(double phMax) {
		this.phMax = phMax;
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
	public Plant(String name, double phMin, double phMax, double humusMin, double humusMax, double nConsumption,
			double pConsumption, double kConsumption) {
		super();
		this.name = name;
		this.phMin = phMin;
		this.phMax = phMax;
		this.humusMin = humusMin;
		this.humusMax = humusMax;
		this.nConsumption = nConsumption;
		this.pConsumption = pConsumption;
		this.kConsumption = kConsumption;
	}
	public Plant() {
	}
	
	
	
	
	
}
