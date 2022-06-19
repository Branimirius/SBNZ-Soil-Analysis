package sbnz.integracija.example;

import java.util.ArrayList;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.facts.Fertilizer;
import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.Plant;
import sbnz.integracija.example.facts.Recommendation;
import sbnz.integracija.example.facts.Soil;

@Service
public class SampleAppService {

	private static Logger log = LoggerFactory.getLogger(SampleAppService.class);

	private final KieContainer kieContainer;
	
	@Autowired
	private OperationService operationService;

	@Autowired
	public SampleAppService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	public Item getClassifiedItem(Item i) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(i);
		kieSession.fireAllRules();
		kieSession.dispose();
		return i;
	}
	public Soil getClassifiedSoil(Soil s) {
		KieSession kieSession = kieContainer.newKieSession();
		//kieSession.setGlobal("recommendation", "prazno");
		kieSession.insert(s);
		kieSession.setGlobal("operationService", operationService);
		kieSession.setGlobal("plants", new ArrayList<Plant>());
		kieSession.insert(new Fertilizer("NPK 8 16 24", 8, 16, 24));
		kieSession.insert(new Fertilizer("NPK 6 12 24", 6, 12, 24));
		kieSession.insert(new Fertilizer("NPK 8 24 16", 8, 24, 16));
		kieSession.insert(new Fertilizer("MAP 11 52 0 + Kalijum 0 0 30", 11, 52, 30));
		kieSession.insert(new Fertilizer("1 x MAP 11 52 0 + 2 x Kalijum 0 0 30", 11, 52, 60));
		kieSession.insert(new Fertilizer("1 x MAP 11 52 0 + 3 x Kalijum 0 0 30", 11, 52, 90));
		kieSession.insert(new Fertilizer("MAP 11 52 0", 11, 52, 1));
		kieSession.insert(new Fertilizer("Kalijum 0 0 30", 1, 1, 30));
		kieSession.insert(new Fertilizer("KAN 27%", 27, 0, 0));
		kieSession.insert(new Fertilizer("UREA 46%", 46, 0, 0));

		kieSession.insert(new Plant("jabuka", 5.5, 6.5, 3.0, 100.0, 120.0, 36.0, 140.0));
		kieSession.insert(new Plant("jagoda", 4.6, 6.4, 5.0, 100.0, 100.0, 80.0, 150.0));
		kieSession.insert(new Plant("malina", 5.8, 6.2, 3.0, 100.0, 120.0, 90.0, 160.0));
		kieSession.insert(new Plant("kupina", 6.0, 6.5, 2.0, 4.0, 130.0, 90.0, 160.0));
		kieSession.insert(new Plant("sljiva", 6.0, 7.5, 5.0, 100.0, 50.0, 30.0, 130.0));
		//kieSession.insert(new Recommendation());
		kieSession.fireAllRules();
		//System.out.println("RECOMMENDED: " + kieSession.getGlobal("recommendation"));
		kieSession.dispose();
		return s;
	}
	public Soil getPlantRecommendation(Soil s) {
		KieSession kieSession = kieContainer.newKieSession();
		//kieSession.setGlobal("recommendation", "prazno");
		
		kieSession.insert(s);
		kieSession.setGlobal("operationService", operationService);
		kieSession.setGlobal("plants", new ArrayList<Plant>());
		kieSession.insert(new Fertilizer("NPK 8 16 24", 8, 16, 24));
		kieSession.insert(new Fertilizer("NPK 6 12 24", 6, 12, 24));
		kieSession.insert(new Fertilizer("NPK 8 24 16", 8, 24, 16));
		kieSession.insert(new Fertilizer("MAP 11 52 0 + Kalijum 0 0 30", 11, 52, 30));
		kieSession.insert(new Fertilizer("1 x MAP 11 52 0 + 2 x Kalijum 0 0 30", 11, 52, 60));
		kieSession.insert(new Fertilizer("1 x MAP 11 52 0 + 3 x Kalijum 0 0 30", 11, 52, 90));
		kieSession.insert(new Fertilizer("MAP 11 52 0", 11, 52, 1));
		kieSession.insert(new Fertilizer("Kalijum 0 0 30", 1, 1, 30));
		kieSession.insert(new Plant("jabuka", 5.5, 6.5, 3.0, 100.0, 120.0, 36.0, 140.0));
		kieSession.insert(new Plant("jagoda", 4.6, 6.4, 5.0, 100.0, 100.0, 80.0, 150.0));
		kieSession.insert(new Plant("malina", 5.8, 6.2, 3.0, 100.0, 120.0, 90.0, 160.0));
		kieSession.insert(new Plant("kupina", 6.0, 6.5, 2.0, 4.0, 130.0, 90.0, 160.0));
		kieSession.insert(new Plant("sljiva", 6.0, 7.5, 5.0, 100.0, 50.0, 30.0, 130.0));
		kieSession.fireAllRules();
		//System.out.println("RECOMMENDED: " + kieSession.getGlobal("recommendation"));
		kieSession.dispose();
		return s;
	}
}
