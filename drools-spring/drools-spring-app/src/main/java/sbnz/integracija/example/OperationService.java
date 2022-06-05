package sbnz.integracija.example;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbnz.integracija.example.facts.Fertilizer;

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
}
