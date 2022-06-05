package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.Objects;

public class Soil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double pH;
	private double humus;
	private double carbonate;
	private double nitrogen;
	private double phosphorous;
	private double potassium;
	private String plant;
	private String recommendation;
	private double kgN;
	private double kgP;
	private double kgK;
	
	public Soil() {}
	public Soil(double pH, double humus, double carbonate, double nitrogen, double phosphorous, double potassium,String plant, String recommendation) {
		this.pH = pH;
		this.humus = humus; 
		this.carbonate = carbonate;
		this.nitrogen = nitrogen;
		this.phosphorous = phosphorous;
		this.potassium = potassium;
		this.plant = plant;
		this.recommendation = recommendation;
		this.kgK = 1.0;
		this.kgN = 1.0;
		this.kgP = 1.0;
	}
	
	
	public double getpH() {
		return pH;
	}
	public void setpH(double pH) {
		this.pH = pH;
	}
	public double getHumus() {
		return humus;
	}
	public void setHumus(double humus) {
		this.humus = humus;
	}
	public double getCarbonate() {
		return carbonate;
	}
	public void setCarbonate(double carbonate) {
		this.carbonate = carbonate;
	}
	public double getNitrogen() {
		return nitrogen;
	}
	public void setNitrogen(double nitrogen) {
		this.nitrogen = nitrogen;
	}
	public double getPhosphorous() {
		return phosphorous;
	}
	public void setPhosphorous(double phosphorous) {
		this.phosphorous = phosphorous;
	}
	public double getPotassium() {
		return potassium;
	}
	public void setPotassium(double potassium) {
		this.potassium = potassium;
	}
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	
	public double getKgN() {
		return kgN;
	}
	public void setKgN(double kgN) {
		this.kgN = kgN;
	}
	public double getKgP() {
		return kgP;
	}
	public void setKgP(double kgP) {
		this.kgP = kgP;
	}
	public double getKgK() {
		return kgK;
	}
	public void setKgK(double kgK) {
		this.kgK = kgK;
	}
	public void setPositive() {
		System.out.println("making it positive..");
		if(this.kgN <= 0) {
			this.kgN = 0.99;
		} 
		if(this.kgP <= 0) {
			this.kgP = 0.99;
		} 
		if(this.kgK <= 0) {
			this.kgK = 0.99;
		} 
	}
	@Override
	public int hashCode() {
		int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.pH);
        hash = 59 * hash + Objects.hashCode(this.humus);
        hash = 59 * hash + Objects.hashCode(this.carbonate);
        hash = 59 * hash + Objects.hashCode(this.nitrogen);
        hash = 59 * hash + Objects.hashCode(this.phosphorous);
        hash = 59 * hash + Objects.hashCode(this.potassium);
        return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Soil other = (Soil) obj;
        if (!Objects.equals(this.pH, other.pH)) {
            return false;
        }
        if (!Objects.equals(this.humus, other.humus)) {
            return false;
        }
        if (!Objects.equals(this.carbonate, other.carbonate)) {
            return false;
        }
        if (!Objects.equals(this.nitrogen, other.nitrogen)) {
            return false;
        }
        if (!Objects.equals(this.phosphorous, other.phosphorous)) {
            return false;
        }
        if (!Objects.equals(this.potassium, other.potassium)) {
            return false;
        }
        
        return true;
	}
	@Override
	public String toString() {
		return "Item{" + "pH=" + pH + ", humus=" + humus + ", carbonate=" + carbonate
                + ", nitrogen=" + nitrogen + ", phosphorous=" + phosphorous + ", potassium=" + potassium + ", plant=" + plant + ", recommendation=" + recommendation +'}';
	}
	
	
	
}
