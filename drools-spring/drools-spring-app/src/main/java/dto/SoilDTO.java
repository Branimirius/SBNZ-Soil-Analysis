package dto;

public class SoilDTO {
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
	
	
	
	public SoilDTO(double pH, double humus, double carbonate, double nitrogen, double phosphorous, double potassium,String plant, String recommendation) {
		this.pH = pH;
		this.humus = humus; 
		this.carbonate = carbonate;
		this.nitrogen = nitrogen;
		this.phosphorous = phosphorous;
		this.potassium = potassium;
		this.plant = plant;
		this.recommendation = recommendation;
		this.kgN = 0;
		this.kgP = 0;
		this.kgK = 0;
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
	
	
	
	
}
