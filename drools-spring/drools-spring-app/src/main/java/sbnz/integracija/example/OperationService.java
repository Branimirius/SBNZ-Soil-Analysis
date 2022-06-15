package sbnz.integracija.example;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbnz.integracija.example.facts.Fertilizer;
import sbnz.integracija.example.facts.Plant;
import sbnz.integracija.example.facts.Soil;

@Service
@Transactional
public class OperationService {
	
	public Fertilizer getOptimalFertilizer(ArrayList<Fertilizer> list, double kgP, double kgK) {
		System.out.println("Kontrola: kgP:" + kgP + "kgK: " + kgK);
		Fertilizer ret = list.get(0);
		System.out.println("ret1" + ret.getName() + ret.getN() + ret.getP() + ret.getK());
		System.out.println("diffs and rets: ");
		for( Fertilizer f : list) {
			System.out.println("f1: "+f.getName() + f.getN() + f.getP() + f.getK()+"  f2: "+ret.getName() + ret.getN() + ret.getP() + ret.getK()+" diff: "+ f.calcPropDifference(kgP/kgK) + " " + ret.calcPropDifference(kgP/kgK));
			if(f.calcPropDifference(kgP/kgK) < ret.calcPropDifference(kgP/kgK)) {
				ret = f;
				System.out.println("bingo!");
			}
			System.out.println("ret: " + ret.getName() + ret.getN() + ret.getP() + ret.getK());
		}
		return ret;
	}
	
	public int calculateMassRecommendation(Soil soil) {
		
		System.out.println("CHECK: soil needs (kg NPK): " + soil.getKgN() + " " + soil.getKgP() + " " + soil.getKgK());
		System.out.println("Fertilizer: " + soil.getFertilizer().getN() + " " + soil.getFertilizer().getP() + " " + soil.getFertilizer().getK());
		if(soil.getFertilizer().getP() != 1) {
			return (int)(soil.getKgP() / (Double.valueOf(soil.getFertilizer().getP()) / 100));
		}
		else if(soil.getFertilizer().getK() != 1) {
			return (int)(soil.getKgK() / (Double.valueOf(soil.getFertilizer().getK()) / 100));
		}
		else if(soil.getFertilizer().getN() != 1) {
			return (int)(soil.getKgN() / (Double.valueOf(soil.getFertilizer().getN())/ 100));
		}
		return 0;
	}
	
	public Boolean isInPhRange(Plant plant, Soil soilPh) {
		System.out.println("Usao u PH range" + plant.getName());
		System.out.println("plant: " + plant.getName());
		if(soilPh.getpH() >= plant.getPhMin() && soilPh.getpH() <= plant.getPhMax()) {
			return true;
		}
		else {
			return false;
		}
	}
	public Boolean isInHumusRange(Plant plant, Soil soilHumus) {
		System.out.println("Usao u Humus range");
		if(soilHumus.getHumus() >= plant.getHumusMin() && soilHumus.getHumus() <= plant.getHumusMax()) {
			return true;
		}
		else {
			return false;
		}
	}
	public Plant getOptimalPlant(ArrayList<Plant> plants, Soil soil) {
		System.out.println("Usao u optimal plant:");
		Plant opt = plants.get(0);
		for(Plant p : plants) {
			System.out.println(p.getName());
			if(consumptionDifference(p, soil) < consumptionDifference(opt, soil)) {
				opt = p;
			}
		}
		
		return opt;
	}
	
	public double consumptionDifference(Plant plant, Soil soil) {
		double factorOne = abs((plant.getpConsumption() / plant.getkConsumption()) - (soil.getPhosphorous() / soil.getPotassium()));
		double factorTwo = abs((soil.getNitrogen() * 5) - (plant.getnConsumption() / 100));
		System.out.println(plant.getName() + " consumption difference " + (factorOne + factorTwo / 2) + " factor 1: " + factorOne + " , factor 2: " + factorTwo);
		return factorOne + factorTwo / 2;
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
