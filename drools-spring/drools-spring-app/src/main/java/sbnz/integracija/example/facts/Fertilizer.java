package sbnz.integracija.example.facts;

public class Fertilizer {
	private String name;
	private int N;
	private int P;
	private int K;
	
	
	public Fertilizer(String name, int n, int p, int k) {
		super();
		this.name = name;
		N = n;
		P = p;
		K = k;
	}
	
	
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
	public double abs(double a) {
		if(a < 0) {
			return (0 - a);
		}
		else {
			return (a);
		}
	}
	
}
