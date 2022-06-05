package sbnz.integracija.example.facts;

public class Fertilizer {
	private String name;
	private int N;
	private int P;
	private int K;
	private double propDifference;
	
	
	public Fertilizer(String name, int n, int p, int k) {
		super();
		this.name = name;
		this.N = n;
		this.P = p;
		this.K = k;
		this.propDifference = 1;
	}
	public Fertilizer() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getP() {
		return P;
	}
	public void setP(int p) {
		P = p;
	}
	public int getK() {
		return K;
	}
	public void setK(int k) {
		K = k;
	}
	
	public double getPropDifference() {
		return propDifference;
	}


	public void setPropDifference(double propDifference) {
		this.propDifference = propDifference;
	}
	public double getDoublePropPK(int p, int k) {
		
		return (Double.valueOf(p)/Double.valueOf(k));
	}

	public double calcPropDifference(double soilProp) {
		System.out.println("racunanje razlike: soilProp:" + soilProp + "NPK: " + this.N + this.P + this.K);
		System.out.println("p/k: " + getDoublePropPK(this.P, this.K));
		return abs(soilProp - getDoublePropPK(this.P, this.K));
	}
	
	public double abs(double a) {
		if(a < 0) {
			return (0 - a);
		}
		else {
			return (a);
		}
	}
	
}
